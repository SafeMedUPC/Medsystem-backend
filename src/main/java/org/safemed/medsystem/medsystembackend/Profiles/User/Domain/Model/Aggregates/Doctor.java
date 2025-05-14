package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.CreateDoctorCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.ValueObjects.Specialities;
import org.safemed.medsystem.medsystembackend.Shared.domain.model.aggregates.AuditableAbstractAggregateRoot;


@Getter
@Entity
@Setter
public class Doctor extends AuditableAbstractAggregateRoot<Doctor> {


    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "licence_number")
    private Integer licenceNumber;

    @Enumerated(EnumType.STRING)
    @Setter
    private Specialities specialities;

    private String phone;

    @Setter
    private String email;


    public Doctor() {

    }

    public Doctor(CreateDoctorCommand command) {
        this();
        this.userId = command.id();
        this.email = command.email();

    }

    public Doctor update(String firstName, String lastName, Integer licenceNumber, Specialities specialities, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenceNumber = licenceNumber;
        this.specialities = specialities;
        this.phone = phone;
        return this;
    }

}
