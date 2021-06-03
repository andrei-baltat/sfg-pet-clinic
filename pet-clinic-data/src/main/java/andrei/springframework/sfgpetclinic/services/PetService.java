package andrei.springframework.sfgpetclinic.services;

import andrei.springframework.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {
    Pet findByID(Long id);
    Pet save(Pet Pet);
    Set<Pet> findAll();
}
