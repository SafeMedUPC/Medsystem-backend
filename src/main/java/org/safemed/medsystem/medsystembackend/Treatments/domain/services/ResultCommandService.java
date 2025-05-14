package org.safemed.medsystem.medsystembackend.Treatments.domain.services;

import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Result;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.CreateResultCommand;

import java.util.Optional;

public interface ResultCommandService {
    Optional<Result> handle(CreateResultCommand command);
}