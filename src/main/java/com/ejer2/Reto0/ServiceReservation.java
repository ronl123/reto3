package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceReservation {

    @Autowired
    private RepositoryReservation metodosCrud;

    public List<ModeloReservation> getAll() {
        return metodosCrud.getAll();
    }
    public Optional<ModeloReservation> getReservation(int reservationId) {
        return metodosCrud.getReservation(reservationId);
    }
    public ModeloReservation save(ModeloReservation reservation) {
        if(reservation.getIdReservation()==null){
            return metodosCrud.save(reservation);
        }else{
            Optional<ModeloReservation> e= metodosCrud.getReservation(reservation.getIdReservation());
            if(e.isEmpty()){
                return metodosCrud.save(reservation);
            }else{
                return reservation;
            }
        }
    }

}
