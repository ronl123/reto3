package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryMessage {

    @Autowired
    private InterfaceMessage crud;

    public List<ModeloMessage> getAll() {
        return (List<ModeloMessage>) crud.findAll();
    }
    public Optional<ModeloMessage> getMenssage(int id) {
        return crud.findById(id);
    }
    public ModeloMessage save(ModeloMessage menssage) {
        return crud.save(menssage);
    }

}
