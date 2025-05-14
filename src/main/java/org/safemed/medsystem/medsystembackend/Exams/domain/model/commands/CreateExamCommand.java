package org.safemed.medsystem.medsystembackend.Exams.domain.model.commands;

import java.time.LocalDate;

public record CreateExamCommand(Long doctorId, Long patientId, String examType, LocalDate examDate) {
}
