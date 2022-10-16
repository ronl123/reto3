package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryReservation {

    @Autowired
    private InterfaceReservation crud;

    public List<ModeloReservation> getAll() {
        return (List<ModeloReservation>) crud.findAll();
    }
    public Optional<ModeloReservation> getReservation(int id) {
        return crud.findById(id);
    }
    public ModeloReservation save(ModeloReservation reservation) {
        return crud.save(reservation);
    }

}
