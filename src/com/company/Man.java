package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Man {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private int heightIn_cm;
    private int weightIn_kg;
    private BloodType bloodType;
    public int trash;

    public Man () {

    };

    public Man(String name, String surname, LocalDate birthDate, int heightIn_cm, int weightIn_kg, BloodType bloodType) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.heightIn_cm = heightIn_cm;
        this.weightIn_kg = weightIn_kg;
        this.bloodType = bloodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getHeightIn_cm() {
        return heightIn_cm;
    }

    public void setHeightIn_cm(int heightIn_cm) {
        this.heightIn_cm = heightIn_cm;
    }

    public int getWeightIn_kg() {
        return weightIn_kg;
    }

    public void setWeightIn_kg(int weightIn_kg) {
        this.weightIn_kg = weightIn_kg;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", heightIn_cm=" + heightIn_cm +
                ", weightIn_kg=" + weightIn_kg +
                ", bloodType=" + bloodType +
                ", age=" + String.valueOf(getAge()) +
                '}';
    }

    public int getAge () {
        return birthDate.until(LocalDate.now()).getYears();
    }
}
