package com.example.apiator;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

public class AtorController {

    AtorRepository repository;

    @GetMapping("/ator")
    public List<Ator> getAllAtor() {
        return repository.findAll();
    }

    @PostMapping("/ator")
    public Ator saveAtor(@RequestBody Ator ator) {
        return repository.save(ator);
    }

    @GetMapping("/ator/{id}")
    public Optional<Ator> getAtorbyId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @DeleteMapping("/ator/{id}")
    public void deleteAtor(@PathVariable Long id) {
        repository.deleteById(id);

    }
}