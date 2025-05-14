package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Services;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates.Doctor;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries.GetAllDoctorQuery;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries.GetDoctorByIdQuery;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries.GetDoctorBySpecialityQuery;

import java.util.List;
import java.util.Optional;

public interface DoctorQueryService {
    Optional<Doctor> handle (GetDoctorByIdQuery query);
    List<Doctor> handle (GetAllDoctorQuery query);
    List<Doctor> handle (GetDoctorBySpecialityQuery query);
}
