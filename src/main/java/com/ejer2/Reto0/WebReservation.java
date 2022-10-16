package com.ejer2.Reto0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebReservation {

    @Autowired
    private ServiceReservation servicio;
    @GetMapping("/all")
    public List<ModeloReservation> getReservs() {
        return servicio.getAll();
    }
    @DeleteMapping("/{id}")
    public Optional<ModeloReservation> getReservs(@PathVariable("id") int reservationId)  {
        return servicio.getReservation(reservationId);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloReservation save(@RequestBody ModeloReservation reservation) {
        return servicio.save(reservation);
    }

}
