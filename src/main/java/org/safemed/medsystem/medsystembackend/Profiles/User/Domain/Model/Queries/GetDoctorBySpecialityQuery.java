package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Queries;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.ValueObjects.Specialities;

public record GetDoctorBySpecialityQuery(Specialities specialities) {
}
