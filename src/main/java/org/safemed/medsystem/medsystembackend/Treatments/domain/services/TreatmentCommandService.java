package org.safemed.medsystem.medsystembackend.Treatments.domain.services;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Treatment;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.*;

import java.util.Optional;

public interface TreatmentCommandService {
    Optional<Treatment> handle(CreateTreatmentCommand command);
    void handle(DeleteTreatmentCommand command);
}