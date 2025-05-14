package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.transform;

import org.safemed.medsystem.medsystembackend.Treatments.domain.model.entities.Report;
import org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources.ReportResource;

public class ReportResourceFromEntityAssembler {
    public static ReportResource toResourceFromEntity(Report entity) {
        return new ReportResource(
                entity.getId(),
                entity.getReason(),
                entity.getDate(),
                entity.getPatientId()
        );
    }
}