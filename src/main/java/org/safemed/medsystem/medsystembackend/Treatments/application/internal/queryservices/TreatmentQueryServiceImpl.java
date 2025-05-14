package org.safemed.medsystem.medsystembackend.Treatments.application.internal.queryservices;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Treatment;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetAllTreatmentsQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetTreatmentByDoctorIdQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetTreatmentByPatientIdQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.services.TreatmentQueryService;
import org.safemed.medsystem.medsystembackend.Treatments.infrastucture.persistence.jpa.repositories.TreatmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentQueryServiceImpl implements TreatmentQueryService {
    private final TreatmentRepository treatmentRepository;

    public TreatmentQueryServiceImpl(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;
    }

    @Override
    public List<Treatment> handle(GetAllTreatmentsQuery query) {
        return treatmentRepository.findAll();
    }

    @Override
    public List<Treatment> handle(GetTreatmentByPatientIdQuery query) {
        return treatmentRepository.findByPatientId(query.patientId());
    }

    @Override
    public List<Treatment> handle(GetTreatmentByDoctorIdQuery query) {
        return treatmentRepository.findByDoctorId(query.doctorId());
    }
}