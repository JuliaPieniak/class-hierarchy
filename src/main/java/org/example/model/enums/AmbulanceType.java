package org.example.model.enums;

public enum AmbulanceType {
    BIG("BIG"),
    SMALL("SMALL"),
    OFFROAD("OFFROAD");

    private final String ambulanceType;

    AmbulanceType(String ambulanceType) {
        this.ambulanceType = ambulanceType;
    }

    public String getAmbulanceType() {
        return ambulanceType;
    }
}
