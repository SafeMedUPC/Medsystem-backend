package org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.resources;

import java.time.LocalDate;

public record ExamResource(
        Long id,
        Long doctorId,
        Long patientId,
        String examType,
        LocalDate examDate,
        LocalDate examResultDate,
        Boolean examResultsReady,
        String examResultsUrl
) {
}
