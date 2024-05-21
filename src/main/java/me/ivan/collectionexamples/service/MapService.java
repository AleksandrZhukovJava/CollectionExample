package me.ivan.collectionexamples.service;

import lombok.RequiredArgsConstructor;
import me.ivan.collectionexamples.repository.MapRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MapService {
    private final MapRepository repository;

    public String getAllOprationWithUsersString() {
        return repository.getAllOprationWithUsersString();
    }


    public String getAllOprationByUsersString(List<Long> userIds) {
        return repository.getAllOprationByUsersString(userIds);
    }

    public boolean checkOperations() {
        return repository.checkOperations();
    }


    public void actualizeOperations() {
        repository.actualizeOperations();
    }
}
