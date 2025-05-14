package org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.transform;

import org.safemed.medsystem.medsystembackend.Exams.domain.model.commands.CreateExamCommand;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.resources.CreateExamResource;

public class CreateExamCommandFromResourceAssembler {
    public static CreateExamCommand toCommandFromResource(CreateExamResource resource) {
        return new CreateExamCommand(
                resource.doctorId(),
                resource.patientId(),
                resource.examType(),
                resource.examDate()
        );
    }
}
