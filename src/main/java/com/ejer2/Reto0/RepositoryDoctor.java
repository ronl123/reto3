package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryDoctor {

    @Autowired
    private InterfaceDoctor crud;

    public List<ModeloDoctor> getAll() {
        return (List<ModeloDoctor>) crud.findAll();
    }
    public Optional<ModeloDoctor> getDoctor(int id) {
        return crud.findById(id);
    }
    public ModeloDoctor save(ModeloDoctor doctor) {
        return crud.save(doctor);
    }

}
