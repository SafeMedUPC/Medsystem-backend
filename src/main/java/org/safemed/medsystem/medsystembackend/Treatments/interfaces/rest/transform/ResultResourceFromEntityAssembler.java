package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.transform;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Result;
import org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources.ResultResource;

public class ResultResourceFromEntityAssembler {
    public static ResultResource toResourceFromEntity(Result result) {
        return new ResultResource(
                result.getId(),
                result.getDoctorId(),
                result.getPatientId(),
                result.getTypeOfExam(),
                result.getResultDateTime(),
                result.isResult()
        );
    }
}