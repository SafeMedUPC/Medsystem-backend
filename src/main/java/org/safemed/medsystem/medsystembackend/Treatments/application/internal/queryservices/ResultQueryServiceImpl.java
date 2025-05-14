package org.safemed.medsystem.medsystembackend.Treatments.application.internal.queryservices;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Result;
import org.safemed.medsystem.medsystembackend.Treatments.domain.services.ResultQueryService;
import org.safemed.medsystem.medsystembackend.Treatments.infrastucture.persistence.jpa.repositories.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultQueryServiceImpl implements ResultQueryService {
    private final ResultRepository resultRepository;

    public ResultQueryServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public List<Result> getByDoctorId(Long doctorId) {
        return resultRepository.findByDoctorId(doctorId);
    }

    @Override
    public List<Result> getByPatientId(Long patientId) {
        return resultRepository.findByPatientId(patientId);
    }
}