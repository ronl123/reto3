package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryClient {

    @Autowired
    private InterfaceClient crud;

    public List<ModeloClient> getAll(){
        return (List<ModeloClient>) crud.findAll();
    }
    public Optional<ModeloClient> getClient(int id) {
        return crud.findById(id);
    }
    public ModeloClient save(ModeloClient client) {
        return crud.save(client);
    }

}
