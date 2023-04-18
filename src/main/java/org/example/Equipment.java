package org.example;

public class Equipment {
    int toolsCount;

    public Equipment(int toolsCount) {
        this.toolsCount = toolsCount;
    }

    @Override
    public String toString() {
        return "Equipment: " +
                "toolsCount = " + toolsCount;
    }
}
