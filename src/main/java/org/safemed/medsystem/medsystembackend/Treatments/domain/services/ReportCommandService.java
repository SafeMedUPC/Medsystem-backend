package org.safemed.medsystem.medsystembackend.Treatments.domain.services;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.CreateReportCommand;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.entities.Report;

import java.util.Optional;

public interface ReportCommandService {
    Optional<Report> handle(CreateReportCommand command);
}