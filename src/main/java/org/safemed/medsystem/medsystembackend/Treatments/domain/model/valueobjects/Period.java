package org.safemed.medsystem.medsystembackend.Treatments.domain.model.valueobjects;

public record Period(String endDate, String startDate) {
    public Period() {
        this(null, null);
    }

    public String getPeriod() {
        return String.format("From %s to %s", endDate, startDate);
    }

    public Period {
        if (startDate == null || startDate.isBlank()) {
            throw new IllegalArgumentException("Start date can't be null or empty");
        }
        if (endDate == null || endDate.isBlank()) {
            throw new IllegalArgumentException("End date can't be null or empty");
        }
    }
}
