package me.ivan.collectionexamples.model;

import lombok.Builder;

import java.time.LocalDateTime;

public class Operation {
    private final long id = ++operationIdCounter;
    private final int amount;
    private final OperationalType type;
    private final long userId;
    private final LocalDateTime date = LocalDateTime.now();
    private static long operationIdCounter = 0;

    @Builder
    public Operation(int amount, OperationalType type, long userId) {
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
