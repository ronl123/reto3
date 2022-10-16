package com.ejer2.Reto0;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Specialty")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebSpecialty {

    @Autowired
    private ServiceSpecialty servicios;
    @GetMapping("/all")
    public List<ModeloSpecialty> getSpecialty() {
        return  servicios.getAll();
    }
    @DeleteMapping("/{id}")
    public Optional<ModeloSpecialty> getSpecialty(@PathVariable("id") int idSpecialty) {
        return servicios.getSpecialty(idSpecialty);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloSpecialty save (@RequestBody ModeloSpecialty speciality) {
        return servicios.save(speciality);
    }

}
