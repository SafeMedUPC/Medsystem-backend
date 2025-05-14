package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.CreatePatientCommand;
import org.safemed.medsystem.medsystembackend.Shared.domain.model.aggregates.AuditableAbstractAggregateRoot;


@Getter
@Entity
@Setter
public class Patient extends AuditableAbstractAggregateRoot<Patient> {


    private Long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Integer age;

    private String address;

    private String phone;

    private String email;

    public Patient() {

    }

    public Patient(CreatePatientCommand command) {
        this();
        this.userId = command.id();
        this.email = command.email();
    }

    public Patient update(String firstName, String lastName, Integer age, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        return this;
    }
}