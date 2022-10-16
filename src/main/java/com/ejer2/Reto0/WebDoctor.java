package com.ejer2.Reto0;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Doctor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebDoctor {

    @Autowired
    private ServiceDoctor servicios;
    @GetMapping("/all")
    public List<ModeloDoctor> getDoctors() {
        return servicios.getAll();
    }
    @DeleteMapping("/{id}")
    public Optional<ModeloDoctor> getDoctor(@PathVariable("id") int idDoctor) {
        return servicios.getDoctor(idDoctor);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloDoctor save (@RequestBody ModeloDoctor doctor) {
        return servicios.save(doctor);
    }

}
