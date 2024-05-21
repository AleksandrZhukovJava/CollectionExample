package me.ivan.collectionexamples.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.time.LocalDateTime;

public class UserOperation {
    @Schema(name = "идентификатор", title = "идентификатор операции")
    private final long id = ++operationIdCounter;
    @Schema(name = "сумма", title = "сумма затраченная на операцию")
    private final int amount;
    @Schema(name = "тип операции", title = "тип операции")
    private final OperationalType type;
    @Schema(name = "пользователь", title = "идентификатор пользователя совершившего операцию")
    private final long userId;
    @Schema(name = "дата", title = "дата операции")
    private final LocalDateTime date = LocalDateTime.now();
    private static long operationIdCounter = 0;

    @Builder
    public UserOperation(int amount, OperationalType type, long userId) {
        this.amount = amount;
        this.type = type;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public OperationalType getType() {
        return type;
    }

    public long getUserId() {
        return userId;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
