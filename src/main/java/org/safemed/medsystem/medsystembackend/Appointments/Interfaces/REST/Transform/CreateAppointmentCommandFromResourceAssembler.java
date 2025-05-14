package org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Transform;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.CreateAppointmentCommand;
import org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Resources.CreateAppointmentResource;

public class CreateAppointmentCommandFromResourceAssembler {
    public static CreateAppointmentCommand toCommandFromResource(CreateAppointmentResource resource) {
        return new CreateAppointmentCommand(
                resource.doctorId(),
                resource.patientId(),
                resource.date(),
                resource.reason(),
                resource.speciality()
        );
    }
}
