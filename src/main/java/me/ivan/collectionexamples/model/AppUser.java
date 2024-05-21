package me.ivan.collectionexamples.model;


import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;
public class AppUser {
    private final long id = ++userIdCounter;
    private String name;
    private final List<UserOperation> list = new ArrayList<>();
    private static long userIdCounter = 0;

    public AppUser(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserOperation> getList() {
        return unmodifiableList(list);
    }

    public void setOperation(UserOperation userOperation) {
        this.list.add(userOperation);
    }
}
