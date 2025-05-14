package org.safemed.medsystem.medsystembackend.Exams.application.internal.CommandServices;

import org.safemed.medsystem.medsystembackend.Exams.domain.model.aggregates.Exam;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.commands.CreateExamCommand;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.commands.UpdateExamCommand;
import org.safemed.medsystem.medsystembackend.Exams.domain.services.ExamCommandService;
import org.safemed.medsystem.medsystembackend.Exams.infrastructure.persistence.jpa.repositories.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExamCommandServiceImpl implements ExamCommandService {
    private final ExamRepository examRepository;

    public ExamCommandServiceImpl(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @Override
    public Optional<Exam> handle(CreateExamCommand command) {
        var exam = new Exam(command);
        examRepository.save(exam);
        return Optional.of(exam);
    }

    public Optional<Exam> handle(UpdateExamCommand command) {
        var result = examRepository.findById(command.examId());
        if(result.isEmpty()) throw new IllegalArgumentException("Exam not found");
        var examToUpdate = result.get();
        try {
            var updatedExam = examRepository.save(examToUpdate.updateExamResult(command.examResultsReady(),command.examResultsUrl()));
            return Optional.of(updatedExam);
        }catch (Exception e) {
            throw new IllegalArgumentException("Failed to update exam result" + e.getMessage());
        }
    }


}
