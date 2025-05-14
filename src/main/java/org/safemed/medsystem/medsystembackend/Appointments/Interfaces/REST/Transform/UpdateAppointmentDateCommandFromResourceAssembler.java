package org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Transform;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.UpdateAppointmentDateCommand;
import org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Resources.UpdateAppointmentDateResource;

public class UpdateAppointmentDateCommandFromResourceAssembler {
    public static UpdateAppointmentDateCommand toCommandFromResource(Long appointmentId, UpdateAppointmentDateResource resource) {
        return new UpdateAppointmentDateCommand(
                appointmentId,
                resource.date()
        );
    }
}