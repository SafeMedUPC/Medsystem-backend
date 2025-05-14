package org.safemed.medsystem.medsystembackend.Exams.domain.model.commands;

public record UpdateExamCommand(Long examId, Boolean examResultsReady, String examResultsUrl) {
}
