package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceSpecialty {

    @Autowired
    private RepositorySpecialty metodosCrud;

    public List<ModeloSpecialty> getAll() {
        return metodosCrud.getAll();
    }
    public Optional<ModeloSpecialty> getSpecialty(int idSpecialty) {
        return metodosCrud.getSpecialty(idSpecialty);
    }
    public ModeloSpecialty save(ModeloSpecialty speciality) {
        if(speciality.getId()==null) {
            return metodosCrud.save(speciality);
        }else{
            Optional<ModeloSpecialty> e= metodosCrud.getSpecialty(speciality.getId());
            if(e.isEmpty()) {
                return metodosCrud.save(speciality);
            }else{
                return speciality;
            }
        }
    }

}
