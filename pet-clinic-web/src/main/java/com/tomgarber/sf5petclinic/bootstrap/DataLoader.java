package com.tomgarber.sf5petclinic.bootstrap;

import com.tomgarber.sf5petclinic.model.Owner;
import com.tomgarber.sf5petclinic.model.PetType;
import com.tomgarber.sf5petclinic.model.Vet;
import com.tomgarber.sf5petclinic.services.OwnerService;
import com.tomgarber.sf5petclinic.services.PetTypeService;
import com.tomgarber.sf5petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Vidar");
        owner2.setLastName("Lothbrok");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Gridar");
        vet2.setLastName("Lothbrok");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
