package me.ivan.collectionexamples.model;


import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class AppUser {
    private final long id;
    private String name;
    private final List<Operation> list = new ArrayList<>();
    private static long userIdCounter = 0;

    public AppUser(long id, String name) {
        this.id = ++userIdCounter;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Operation> getList() {
        return unmodifiableList(list);
    }

    public void setOperation(Operation operation) {
        this.list.add(operation);
    }
}
