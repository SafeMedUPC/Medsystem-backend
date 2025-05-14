package org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.transform;

import org.safemed.medsystem.medsystembackend.Exams.domain.model.commands.UpdateExamCommand;
import org.safemed.medsystem.medsystembackend.Exams.interfaces.rest.resources.UpdateExamResultResource;

public class UpdateExamResultCommandFromResourceAssembler {
    public static UpdateExamCommand toCommandFromResource(Long examId,UpdateExamResultResource resource) {
        return new UpdateExamCommand(
                examId,
                resource.examResultsReady(),
                resource.examResultsUrl()
        );
    }
}
