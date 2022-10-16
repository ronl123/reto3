package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceDoctor {

    @Autowired
    private RepositoryDoctor metodosCrud;
    public List<ModeloDoctor> getAll() {
        return metodosCrud.getAll();
    }
    public Optional<ModeloDoctor> getDoctor(int idDoctor) {
        return  metodosCrud.getDoctor(idDoctor);
    }
    public ModeloDoctor save(ModeloDoctor doctor){
        if(doctor.getId()==null){
            return metodosCrud.save(doctor);
        }else{
            Optional<ModeloDoctor> e=metodosCrud.getDoctor(doctor.getId());
            if(e.isEmpty()){
                return metodosCrud.save(doctor);
            }else{
                return doctor;
            }
        }
    }

}
