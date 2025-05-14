package org.safemed.medsystem.medsystembackend.Profiles.User.Application.internal.queryServices;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates.Doctor;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries.GetAllDoctorQuery;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries.GetDoctorByIdQuery;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries.GetDoctorBySpecialityQuery;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Services.DoctorQueryService;
import org.safemed.medsystem.medsystembackend.Profiles.User.Infrastructure.persistence.jpa.repositories.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorQueryServiceImpl implements DoctorQueryService {

    private final DoctorRepository doctorRepository;

    public DoctorQueryServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Optional<Doctor> handle(GetDoctorByIdQuery query) {
        return doctorRepository.findById(query.doctorId());
    }

    @Override
    public List<Doctor> handle(GetAllDoctorQuery query) {
        return doctorRepository.findAll();
    }

    public List<Doctor> handle(GetDoctorBySpecialityQuery query) { return doctorRepository.findBySpecialities(query.specialities()); }}
