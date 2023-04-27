package org.example.model.enums;

public enum MachineType {
    DEFIBRILLATOR("DEFIBRILLATOR"),
    STERILIZER("STERILIZER"),
    XRAY("XRAY");

    private final String machineType;

    MachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getMachineType() {
        return machineType;
    }
}
