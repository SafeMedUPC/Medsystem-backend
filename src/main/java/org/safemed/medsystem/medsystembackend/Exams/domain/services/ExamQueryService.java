package org.safemed.medsystem.medsystembackend.Exams.domain.services;

import org.safemed.medsystem.medsystembackend.Exams.domain.model.aggregates.Exam;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetAllExams;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetExamsByDoctorIdQuery;
import org.safemed.medsystem.medsystembackend.Exams.domain.model.queries.GetExamsByPatientIdQuery;

import java.util.List;

public interface ExamQueryService {
    List<Exam> handle(GetExamsByDoctorIdQuery query);
    List<Exam> handle(GetExamsByPatientIdQuery query);
    List<Exam> handle(GetAllExams query);
}
