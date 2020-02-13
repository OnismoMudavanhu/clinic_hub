package com.hospital.clinichub.models;

import javax.persistence.*;

@Entity
@Table(name = "reception")
public class Reception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patient;
    private String reason;
    private String creator; //one who is on reception

    public Reception(){

    }

    public Reception(Long id, String patient, String reason, String creator) {
        this.id = id;
        this.patient = patient;
        this.reason = reason;
        this.creator = creator;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Reception{" +
                "id=" + id +
                ", patient='" + patient + '\'' +
                ", reason='" + reason + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }
}
