package org.safemed.medsystem.medsystembackend.Treatments.application.internal.commandservices;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Treatment;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.*;
import org.safemed.medsystem.medsystembackend.Treatments.domain.services.TreatmentCommandService;
import org.safemed.medsystem.medsystembackend.Treatments.infrastucture.persistence.jpa.repositories.TreatmentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TreatmentCommandServiceImpl implements TreatmentCommandService {
    private final TreatmentRepository treatmentRepository;

    public TreatmentCommandServiceImpl(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;
    }

    @Override
    public Optional<Treatment> handle(CreateTreatmentCommand command) {
        if (treatmentRepository.existsByTreatmentNameAndPatientId(command.treatmentName(), command.patientId()))
            throw new IllegalArgumentException("Treatment " + command.treatmentName() + " already exists.");
        var treatment = new Treatment(command);
        treatmentRepository.save(treatment);
        return Optional.of(treatment);
    }

    @Override
    public void handle(DeleteTreatmentCommand command) {
        var treatment = treatmentRepository.findByTreatmentName(String.valueOf(command.treatmentId()));
        treatment.ifPresent(treatmentRepository::delete);
    }
}