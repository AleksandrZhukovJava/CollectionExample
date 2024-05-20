package me.ivan.collectionexamples.service;

import lombok.RequiredArgsConstructor;
import me.ivan.collectionexamples.model.Operation;
import me.ivan.collectionexamples.repository.ListRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ListService {
    private final ListRepository repository;

    public List<Operation> getHigherThan(int amount) {
        return repository.getHigherThan(amount);
    }

    public int getOperationAmountByUser(long id){
        return repository.getOperationAmountByUser(id);
    }

    public Map<User, Integer> getAmountByUser(long id){
        return repository.getAmountByUser(id);
    }

    public List<Operation> getLastOperations(int amount){
        return repository.getLastOperations(amount);
    }
    public List<Long> removeLastOperations(int amount){
        return repository.removeLastOperations(amount);
    }
}
