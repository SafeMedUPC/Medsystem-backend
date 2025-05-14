package org.safemed.medsystem.medsystembackend.Exams.interfaces.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetAllExams;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetExamsByDoctorIdQuery;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetExamsByPatientIdQuery;
import org.safemed.medsystem.medsystembackend.Exams.domain.services.ExamCommandService;
import org.safemed.medsystem.medsystembackend.Exams.domain.services.ExamQueryService;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.resources.CreateExamResource;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.resources.ExamResource;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.resources.UpdateExamResultResource;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.transform.CreateExamCommandFromResourceAssembler;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.transform.ExamResourceFromEntityAssembler;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.transform.UpdateExamResultCommandFromResourceAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/exams", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Exams", description = "Endpoints for managing exams")
@CrossOrigin(origins = "*")
public class ExamController {
    private final ExamCommandService examCommandService;
    private final ExamQueryService examQueryService;

    public ExamController(ExamCommandService examCommandService, ExamQueryService examQueryService) {
        this.examCommandService = examCommandService;
        this.examQueryService = examQueryService;
    }

    @PostMapping
    public ResponseEntity<ExamResource> createExam(@RequestBody CreateExamResource exam) {
        var createExamCommand = CreateExamCommandFromResourceAssembler.toCommandFromResource(exam);
        var examEntity = examCommandService.handle(createExamCommand);
        if (examEntity.isEmpty()) return ResponseEntity.badRequest().build();
        var examResource = ExamResourceFromEntityAssembler.toResourceFromEntity(examEntity.get());
        return new ResponseEntity<>(examResource, HttpStatus.CREATED);
    }

    //Get all exams
    @GetMapping
    public ResponseEntity<List<ExamResource>> getAllExams(){
        var getAllExamsQuery = new GetAllExams();
        var exams = examQueryService.handle(getAllExamsQuery);
        var examResources = exams.stream()
                .map(ExamResourceFromEntityAssembler::toResourceFromEntity)
                .toList();
        return ResponseEntity.ok(examResources);
    }

    //Get exam by doctorId
    @GetMapping("doctor/{doctorId}")
    public ResponseEntity<List<ExamResource>> getExamsByDoctorId(@PathVariable Long doctorId) {
        var getExamsByDoctorIdQuery = new GetExamsByDoctorIdQuery(doctorId);
        var exams = examQueryService.handle(getExamsByDoctorIdQuery);
        var examResources = exams.stream()
                .map(ExamResourceFromEntityAssembler::toResourceFromEntity)
                .toList();
        return ResponseEntity.ok(examResources);
    }

    //Get exam by patientId
    @GetMapping("patient/{patientId}")
    public ResponseEntity<List<ExamResource>> getExamsByPatientId(@PathVariable Long patientId) {
        var getExamsByPatientIdQuery = new GetExamsByPatientIdQuery(patientId);
        var exams = examQueryService.handle(getExamsByPatientIdQuery);
        var examResources = exams.stream()
                .map(ExamResourceFromEntityAssembler::toResourceFromEntity)
                .toList();
        return ResponseEntity.ok(examResources);
    }

    // Update exam result
    @PutMapping("/{examId}/result")
    public ResponseEntity<ExamResource> updateExamResult(@PathVariable Long examId, @RequestBody UpdateExamResultResource updateExamResultResource) {
        var updateExamResultCommand = UpdateExamResultCommandFromResourceAssembler.toCommandFromResource(examId, updateExamResultResource);
        var updatedExam = examCommandService.handle(updateExamResultCommand);
        if (updatedExam.isEmpty()) return ResponseEntity.badRequest().build();
        var examResource = ExamResourceFromEntityAssembler.toResourceFromEntity(updatedExam.get());
        return ResponseEntity.ok(examResource);
    }

}
