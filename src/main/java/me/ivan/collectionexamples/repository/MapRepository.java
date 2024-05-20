package me.ivan.collectionexamples.repository;

import me.ivan.collectionexamples.model.AppUser;
import me.ivan.collectionexamples.model.Operation;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MapRepository{

    private final Map<AppUser, Operation> repository = new HashMap<>();

}
