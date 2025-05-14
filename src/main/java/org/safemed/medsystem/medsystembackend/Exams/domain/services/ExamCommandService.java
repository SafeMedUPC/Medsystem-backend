package org.safemed.medsystem.medsystembackend.Exams.domain.services;

import org.safemed.medsystem.medsystembackend.Exams.domain.model.aggregates.Exam;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.commands.CreateExamCommand;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.commands.UpdateExamCommand;

import java.util.Optional;

public interface ExamCommandService {
    Optional<Exam> handle(CreateExamCommand command);
    Optional<Exam> handle(UpdateExamCommand command);
}
