package com.petstore.openapi.api;

import com.petstore.openapi.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PetsApiDelegateImpl implements PetsApiDelegate {
    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
        System.out.println("Custom listPets implementation in PetsApiDelegateImpl");
        return PetsApiDelegate.super.listPets(limit);
    }
}

