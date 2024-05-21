package me.ivan.collectionexamples.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import me.ivan.collectionexamples.service.MapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name = "Контроллер карты", description = "Контроллер для отработки map")
public class MapController {
    private final MapService service;

    @GetMapping("/get/string-operation")
    @Operation(summary = "Получить выписку по всем пользователям")
    public String getAllOprationWithUsersString() {
        return service.getAllOprationWithUsersString();
    }

    @GetMapping("/get/string-operation/full")
    @Operation(summary = "Получить выписку по всем пользователям без пропусков")
    public String getAllOprationByUsersString(List<Long> userIds) {
        return service.getAllOprationByUsersString(userIds);
    }

    @GetMapping("/check/operations")
    @Operation(summary = "Проверить соответствие операций")
    public boolean checkOperations() {
        return service.checkOperations();
    }

    @PostMapping("/actualize/operations")
    @Operation(summary = "Актуализировать операции")
    public void actualizeOperations() {
        service.actualizeOperations();
    }

}
