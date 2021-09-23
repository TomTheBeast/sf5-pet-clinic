package com.tomgarber.sf5petclinic.bootstrap;

import com.tomgarber.sf5petclinic.model.Owner;
import com.tomgarber.sf5petclinic.model.Pet;
import com.tomgarber.sf5petclinic.model.PetType;
import com.tomgarber.sf5petclinic.model.Vet;
import com.tomgarber.sf5petclinic.services.OwnerService;
import com.tomgarber.sf5petclinic.services.PetTypeService;
import com.tomgarber.sf5petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        owner1.setAddress("123 Street st");
        owner1.setCity("City city");
        owner1.setTelephone("555-765-4321");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Vidar");
        owner2.setLastName("Lothbrok");
        owner2.setAddress("948 Ave");
        owner2.setCity("NotACity");
        owner2.setTelephone("444-525-4232");

        Pet vidarPet = new Pet();
        vidarPet.setPetType(savedDogPetType);
        vidarPet.setOwner(owner2);
        vidarPet.setBirthDate(LocalDate.now());
        vidarPet.setName("Cerberus");
        owner2.getPets().add(vidarPet);

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
