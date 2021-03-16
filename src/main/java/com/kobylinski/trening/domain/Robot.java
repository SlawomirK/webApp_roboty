package com.kobylinski.trening.domain;

public class Robot {
    private int moc;
   private String nazwa;
   private Zadanie zadanie;

    @Override
    public String toString() {
        return "Robot{" +
                "moc=" + moc +
                ", nazwa='" + nazwa + '\'' +
                ", zadanie=" + zadanie +
                '}';
    }

    public Robot(int moc, String nazwa,Zadanie zadanie) {
        this.moc = moc;
        this.nazwa = nazwa;
        this.zadanie=zadanie;
    }

}
