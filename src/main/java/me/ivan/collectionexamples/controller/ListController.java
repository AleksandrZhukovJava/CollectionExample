package me.ivan.collectionexamples.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import me.ivan.collectionexamples.model.OperationalType;
import me.ivan.collectionexamples.model.UserOperation;
import me.ivan.collectionexamples.service.ListService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/operations")
@RequiredArgsConstructor
@Tag(name = "Контроллер листов", description = "Контроллер для отработки list")
public class ListController {
    private final ListService service;

    @GetMapping("/get/more-then")
    @Operation(summary = "Получение операций сотрудника на сумму большую чем переданная")
    public List<UserOperation> getHigherThan(@RequestParam("amount") int amount) {
        return service.getHigherThan(amount);
    }

    @GetMapping("/get/amount-by-user")
    @Operation(summary = "Получить все операции юзера")
    public int getOperationAmountByUser(@RequestParam("userId") long id) {
        return service.getOperationAmountByUser(id);
    }

    @GetMapping("/get/amount-per-user")
    @Operation(summary = "Получить затраты каждого юзера")
    public Map<User, Integer> getAmountPerUser(@RequestParam("userId") long id) {
        return service.getAmountPerUser(id);
    }

    @GetMapping("/get/last-operations/{amount}")
    @Operation(summary = "Получить n последних операций")
    public List<UserOperation> getLastOperations(@PathVariable("amount") int amount) {
        return service.getLastOperations(amount);
    }

    @DeleteMapping("/remove/last-operations/{amount}")
    @Operation(summary = "Удалить n последних операций")
    public List<Long> removeLastOperations(@PathVariable("amount") int amount) {
        return service.removeLastOperations(amount);
    }

    @GetMapping("/get/all-per-type")
    @Operation(summary = "Получение всех операций по каждому типу")
    public Map<OperationalType, UserOperation> getAllPerOperationType() {
        return service.getAllPerOperationType();
    }

    @PostMapping("/add")
    @Operation(summary = "Добавление операции")
    public long addOperation() {
        return service.addOperation();
    }

    @GetMapping("/get/all-until/{type}/by-user")
    @Operation(summary = "Получение всех операций до определенной")
    public List<UserOperation> getAllUntilType(@PathVariable("type") OperationalType type,
                                               @RequestParam("userId") long userId) {
        return service.getAllUntilType(userId, type);
    }
}
