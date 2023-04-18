package org.example;

public class Labolatory {
    int samplesCount;

    public Labolatory(int samplesCount){
        this.samplesCount = samplesCount;
    }

    @Override
    public String toString() {
        return "Labolatory: " +
                "samplesCount = " + samplesCount;
    }
}
