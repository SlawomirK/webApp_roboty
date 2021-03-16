package com.kobylinski.trening.domain;

public class Zadanie {
    private String polecenie;

    public Zadanie(String polecenie) {
        this.polecenie = polecenie;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "polecenie='" + polecenie + '\'' +
                '}';
    }
}
