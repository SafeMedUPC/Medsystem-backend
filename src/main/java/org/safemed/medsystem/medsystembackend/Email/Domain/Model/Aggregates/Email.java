package org.safemed.medsystem.medsystembackend.Email.Domain.Model.Aggregates;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import org.safemed.medsystem.medsystembackend.Email.Domain.Model.Commands.SendEmailCommand;
import org.safemed.medsystem.medsystembackend.Shared.domain.model.aggregates.AuditableAbstractAggregateRoot;

@Getter
@Entity
public class Email extends AuditableAbstractAggregateRoot<Email> {

    @Column(name = "to_email")
    private String to;

    @Column(name = "subject")
    private String subject;

    @Column(name = "body")
    private String body;

    public Email(){
        this.to = "";
        this.subject = "";
        this.body = "";
    }

    public Email(SendEmailCommand command) {
        this();
        this.to = command.to();
        this.subject = command.subject();
        this.body = command.body();
    }
}
