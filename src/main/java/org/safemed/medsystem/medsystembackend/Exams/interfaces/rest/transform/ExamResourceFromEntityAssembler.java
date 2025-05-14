package org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.transform;

import org.safemed.medsystem.medsystembackend.Exams.domain.model.aggregates.Exam;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.resources.ExamResource;

public class ExamResourceFromEntityAssembler {
    public static ExamResource toResourceFromEntity(Exam exam) {
        return new ExamResource(
                exam.getId(),
                exam.getDoctorId(),
                exam.getPatientId(),
                exam.getExamType(),
                exam.getExamDate(),
                exam.getExamResultDate(),
                exam.getExamResultsReady(),
                exam.getExamResultsUrl()
        );
    }
}
