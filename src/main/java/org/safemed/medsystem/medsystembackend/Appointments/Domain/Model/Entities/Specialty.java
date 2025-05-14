package org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.ValueObjects.Specialties;

@Getter
@Entity
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column()
    private Specialties name;

    public Specialty(Specialties name) {
        this.name = name;
    }

    public Specialty() {

    }

    public String getName(){
        return name.toString();
    }
}
