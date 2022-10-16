package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceMessage {

    @Autowired
    private RepositoryMessage metodosCrud;

    public List<ModeloMessage> getAll() {
        return metodosCrud.getAll();
    }
    public Optional<ModeloMessage> getMessage(int messageId) {
        return  metodosCrud.getMenssage(messageId);
    }
    public ModeloMessage save(ModeloMessage message){
        if (message.getIdMessage()==null){
            return metodosCrud.save(message);
        }else{
            Optional<ModeloMessage> e= metodosCrud.getMenssage(message.getIdMessage());
            if(e.isEmpty()){
                return metodosCrud.save(message);
            }else{
                return message;
            }
        }
    }

}
