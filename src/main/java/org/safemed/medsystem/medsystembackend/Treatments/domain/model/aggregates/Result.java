package org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.safemed.medsystem.medsystembackend.Shared.domain.model.entities.AuditableModel;
import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.CreateResultCommand;


@Getter
@Entity
@NoArgsConstructor
public class Result extends AuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long doctorId;

    @NotNull
    private Long patientId;

    @NotNull
    private String typeOfExam;

    @NotNull
    private String resultDateTime;

    @NotNull
    private boolean result;

    public Result(CreateResultCommand command) {
        this.doctorId = command.doctorId();
        this.patientId = command.patientId();
        this.typeOfExam = command.typeOfExam();
        this.resultDateTime = command.resultDateTime();
        this.result = command.result();
    }
}
