package com.hospital.clinichub.models;

import javax.persistence.*;

@Entity
@Table(name = "consultation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patient;
    private String weight;
    private String temp;
    private String bp;
    private String height;
    private String date;

    public Consultation(){

    }

    public Consultation(Long id, String patient, String weight, String temp, String bp, String height, String date) {
        this.id = id;
        this.patient = patient;
        this.weight = weight;
        this.temp = temp;
        this.bp = bp;
        this.height = height;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", patient='" + patient + '\'' +
                ", weight='" + weight + '\'' +
                ", temp='" + temp + '\'' +
                ", bp='" + bp + '\'' +
                ", height='" + height + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
