package org.safemed.medsystem.medsystembackend.Treatments.domain.services;

import org.safemed.medsystem.medsystembackend.Treatments.domain.model.entities.Report;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetAllReportsQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetReportByIdQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetReportsByPatientIdQuery;

import java.util.List;
import java.util.Optional;

public interface ReportQueryService {
    Optional<Report> handle(GetReportByIdQuery query);
    List<Report> handle(GetReportsByPatientIdQuery query);
    List<Report> handle(GetAllReportsQuery query);
}