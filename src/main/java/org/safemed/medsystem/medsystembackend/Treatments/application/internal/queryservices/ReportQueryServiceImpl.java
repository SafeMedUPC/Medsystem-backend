package org.safemed.medsystem.medsystembackend.Treatments.application.internal.queryservices;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.entities.Report;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetAllReportsQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetReportByIdQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetReportsByPatientIdQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.services.ReportQueryService;
import org.safemed.medsystem.medsystembackend.Treatments.infrastucture.persistence.jpa.repositories.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportQueryServiceImpl implements ReportQueryService {
    private final ReportRepository reportRepository;

    public ReportQueryServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public Optional<Report> handle(GetReportByIdQuery query) {
        return reportRepository.findById(query.id());
    }

    @Override
    public List<Report> handle(GetReportsByPatientIdQuery query) {
        return reportRepository.findAllReportsByPatientId(query.patientId());
    }

    @Override
    public List<Report> handle(GetAllReportsQuery query) {
        return reportRepository.findAll();
    }
}