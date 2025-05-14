package org.safemed.medsystem.medsystembackend.Treatments.application.internal.commandservices;

import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Result;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.CreateResultCommand;
import org.safemed.medsystem.medsystembackend.Treatments.domain.services.ResultCommandService;
import org.safemed.medsystem.medsystembackend.Treatments.infrastucture.persistence.jpa.repositories.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResultCommandServiceImpl implements ResultCommandService {
    private final ResultRepository resultRepository;

    public ResultCommandServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public Optional<Result> handle(CreateResultCommand command) {
        var result = new Result(command);
        resultRepository.save(result);
        return Optional.of(result);
    }
}