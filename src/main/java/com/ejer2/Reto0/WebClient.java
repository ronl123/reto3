package com.ejer2.Reto0;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebClient {

    @Autowired
    private ServiceClient servicio;

    @GetMapping("/all")
    public List<ModeloClient> getClients() {
        return servicio.getAll();
    }
    @DeleteMapping("/{id}")
    public Optional<ModeloClient> getClient(@PathVariable("id") int clientId) {
        return servicio.getClient(clientId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloClient save(@RequestBody ModeloClient client) {
        return servicio.save(client);
    }

}
