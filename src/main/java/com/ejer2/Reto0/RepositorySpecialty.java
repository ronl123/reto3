package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositorySpecialty {

    @Autowired
    private InterfaceSpecialty crud;

    public List<ModeloSpecialty> getAll() {
        return (List<ModeloSpecialty>) crud.findAll();
    }
    public Optional<ModeloSpecialty> getSpecialty(int id) {
        return  crud.findById(id);
    }
    public ModeloSpecialty save(ModeloSpecialty especiality) {
        return crud.save(especiality);
    }

}
