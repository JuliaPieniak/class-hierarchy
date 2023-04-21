package org.example;

public class Equipment {
    private int toolsCount;

    public Equipment(int toolsCount) {
        this.toolsCount = toolsCount;
    }

    @Override
    public String toString() {
        return "Equipment: " +
                "toolsCount = " + toolsCount;
    }
}
