package org.example;

import java.util.Objects;

public class Labolatory {
    private int samplesCount;

    public Labolatory(int samplesCount){
        this.samplesCount = samplesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Labolatory)) return false;
        Labolatory that = (Labolatory) o;
        return samplesCount == that.samplesCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(samplesCount);
    }

    @Override
    public String toString() {
        return "Labolatory: " +
                "samplesCount = " + samplesCount;
    }
}
