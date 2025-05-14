package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Services;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates.Patient;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries.GetAllPatientQuery;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries.GetPatientByIdQuery;

import java.util.List;
import java.util.Optional;

public interface PatientQueryService {
    Optional<Patient> handle (GetPatientByIdQuery query);
    List<Patient> handle (GetAllPatientQuery query);
}
