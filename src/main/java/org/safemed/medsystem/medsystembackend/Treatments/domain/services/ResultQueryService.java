package org.safemed.medsystem.medsystembackend.Treatments.domain.services;

import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Result;

import java.util.List;

public interface ResultQueryService {
    List<Result> getByDoctorId(Long doctorId);
    List<Result> getByPatientId(Long patientId);
}