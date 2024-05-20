package me.ivan.collectionexamples.model;

import java.time.LocalDateTime;

public class Operation {
    private long id;
    private final int amount;
    private final OperationalType type;
    private final long userId;
    private final LocalDateTime date = LocalDateTime.now();
    private static long operationIdCounter = 0;

    public Operation(int amount, OperationalType type, long userId) {
        this.amount = amount;
        this.type = type;
        this.userId = userId;
        this.id = ++operationIdCounter;
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
