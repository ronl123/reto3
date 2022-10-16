package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceClient {

    @Autowired
    private RepositoryClient metodosCrud;

    public List<ModeloClient> getAll() {
        return metodosCrud.getAll();
    }
    public Optional<ModeloClient> getClient(int clientId) {
        return metodosCrud.getClient(clientId);
    }
    public ModeloClient save(ModeloClient client){
        if(client.getIdClient()==null){
            return metodosCrud.save(client);
        }else{
            Optional<ModeloClient> e= metodosCrud.getClient(client.getIdClient());
            if(e.isEmpty()){
                return metodosCrud.save(client);
            }else{
                return client;
            }
        }
    }

}
