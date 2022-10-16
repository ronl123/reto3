package com.ejer2.Reto0;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class ModeloDoctor implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String departament;
    private Integer year;
    private String description;

    @ManyToOne
    @JoinColumn(name = "idSpecialty")
    @JsonIgnoreProperties("doctor")
    private ModeloSpecialty specialty;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "doctor")
    @JsonIgnoreProperties({"doctor", "client"})
    private List<ModeloMessage> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "doctor")
    @JsonIgnoreProperties({"doctor","client"})
    private List<ModeloReservation> reservation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModeloSpecialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(ModeloSpecialty specialty) {
        this.specialty = specialty;
    }

    public List<ModeloMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ModeloMessage> messages) {
        this.messages = messages;
    }

    public List<ModeloReservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<ModeloReservation> reservation) {
        this.reservation = reservation;
    }
}
