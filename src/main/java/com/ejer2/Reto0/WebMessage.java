package com.ejer2.Reto0;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebMessage {

    @Autowired
    private ServiceMessage servicio;
    @GetMapping("/all")
    public List<ModeloMessage> getMessages() {
        return servicio.getAll();
    }
    @DeleteMapping("/{id}")
    public Optional<ModeloMessage> getMessage(@PathVariable("id") int messageId) {
        return servicio.getMessage(messageId);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloMessage save(@RequestBody ModeloMessage message) {
        return servicio.save(message);
    }

}
