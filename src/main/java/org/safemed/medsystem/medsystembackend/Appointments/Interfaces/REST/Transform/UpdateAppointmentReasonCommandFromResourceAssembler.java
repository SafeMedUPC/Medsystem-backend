package org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Transform;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.UpdateAppointmentReasonCommand;
import org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Resources.UpdateAppointmentReasonResource;

public class UpdateAppointmentReasonCommandFromResourceAssembler {
    public static UpdateAppointmentReasonCommand toCommandFromResource(Long appointmentId, UpdateAppointmentReasonResource resource) {
        return new UpdateAppointmentReasonCommand(appointmentId, resource.reason());
    }
}
