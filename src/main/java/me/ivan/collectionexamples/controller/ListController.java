package me.ivan.collectionexamples.controller;

import lombok.RequiredArgsConstructor;
import me.ivan.collectionexamples.model.Operation;
import me.ivan.collectionexamples.model.OperationalType;
import me.ivan.collectionexamples.service.ListService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/operations")
@RequiredArgsConstructor
public class ListController {
    private final ListService service;

    @GetMapping("/get/more-then")
    public List<Operation> getHigherThan(@RequestParam("amount") int amount) {
        return service.getHigherThan(amount);
    }

    @GetMapping("/get/amount-by-user")
    public int getOperationAmountByUser(@RequestParam("userId") long id) {
        return service.getOperationAmountByUser(id);
    }

    @GetMapping("/get/amount-per-user")
    public Map<User, Integer> getAmountPerUser(@RequestParam("userId") long id) {
        return service.getAmountPerUser(id);
    }

    @GetMapping("/get/last-operations/{amount}")
    public List<Operation> getLastOperations(@PathVariable("amount") int amount) {
        return service.getLastOperations(amount);
    }

    @DeleteMapping("/remove/last-operations/{amount}")
    public List<Long> removeLastOperations(@PathVariable("amount") int amount) {
        return service.removeLastOperations(amount);
    }

    @GetMapping("/get/all-per-type")
    public Map<OperationalType, Operation> getAllPerOperationType() {
        return service.getAllPerOperationType();
    }

    @PostMapping("/add")
    public long addOperation(){
        return service.addOperation();
    }
}
