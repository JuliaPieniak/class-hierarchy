package org.example.model.enums;

public enum DepartmentType {
    CARDIOLOGY("Cardiology"),
    NEUROLOGY("Neurology"),
    ONCOLOGY("Oncology"),
    PEDIATRICS("Pediatrics"),
    PSYCHIATRY("Psychiatry");

    private final String departmentType;

    DepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public String getDepartmentType() {
        return departmentType;
    }
}
