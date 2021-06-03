package andrei.springframework.sfgpetclinic.services;

import andrei.springframework.sfgpetclinic.model.Vet;
import java.util.Set;

public interface VetService {
    Vet findByID(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
