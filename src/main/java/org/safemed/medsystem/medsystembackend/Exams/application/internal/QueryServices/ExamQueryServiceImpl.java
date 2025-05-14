package org.safemed.medsystem.medsystembackend.Exams.application.internal.QueryServices;

import org.safemed.medsystem.medsystembackend.Exams.domain.model.aggregates.Exam;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetAllExams;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetExamsByDoctorIdQuery;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetExamsByPatientIdQuery;
import org.safemed.medsystem.medsystembackend.Exams.domain.services.ExamQueryService;
import org.safemed.medsystem.medsystembackend.Exams.infrastructure.persistence.jpa.repositories.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamQueryServiceImpl implements ExamQueryService {
    private final ExamRepository examRepository;

    public ExamQueryServiceImpl(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }


    @Override
    public List<Exam> handle(GetExamsByDoctorIdQuery query) {
        return examRepository.findByDoctorId(query.doctorId());
    }

    @Override
    public List<Exam> handle(GetExamsByPatientIdQuery query) {
        return examRepository.findByPatientId(query.patientId());
    }

    @Override
    public List<Exam> handle(GetAllExams query) {
        return examRepository.findAll();
    }
}
