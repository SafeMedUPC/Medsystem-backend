package org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Transform;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Aggregates.Appointment;
import org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Resources.AppointmentResource;

public class AppointmentResourceFromEntityAssembler {
    public static AppointmentResource toResourceFromEntity(Appointment appointment) {
        return new AppointmentResource(
                appointment.getId(),
                appointment.getDoctorId(),
                appointment.getPatientId(),
                appointment.getDate().toString(),
                appointment.getReason(),
                appointment.getSpecialty().getName()
        );
    }
}
