package org.safemed.medsystem.medsystembackend.Treatments.domain.services;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Treatment;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetAllTreatmentsQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetTreatmentByDoctorIdQuery;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.queries.GetTreatmentByPatientIdQuery;

import java.util.List;

public interface TreatmentQueryService {
    List<Treatment> handle(GetAllTreatmentsQuery query);
    List<Treatment> handle(GetTreatmentByPatientIdQuery query);
    List<Treatment> handle(GetTreatmentByDoctorIdQuery query);
}