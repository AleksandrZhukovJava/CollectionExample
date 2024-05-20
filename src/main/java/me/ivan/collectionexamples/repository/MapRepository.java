package me.ivan.collectionexamples.repository;

import jakarta.annotation.PostConstruct;
import me.ivan.collectionexamples.model.AppUser;
import me.ivan.collectionexamples.model.Operation;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static me.ivan.collectionexamples.model.OperationalType.DECREASE;
import static me.ivan.collectionexamples.model.OperationalType.INCREASE;
import static me.ivan.collectionexamples.model.OperationalType.TRANSFORM;

@Repository
public class MapRepository {

    private final Map<AppUser, List<Operation>> repository = new HashMap<>();


    @PostConstruct
    private void setUp() {
        List<AppUser> appUsers = getAppUsersWithOperations();
    }

    /**
     * Генерирует трёх сотрудников c тремя операциями у каждого
     */
    private List<AppUser> getAppUsersWithOperations() {
        AppUser aleksandr = new AppUser("Aleksandr");
        Operation operationA = Operation.builder().amount(100).userId(aleksandr.getId()).type(INCREASE).build();
        Operation operationA2 = Operation.builder().amount(200).userId(aleksandr.getId()).type(DECREASE).build();
        Operation operationA3 = Operation.builder().amount(300).userId(aleksandr.getId()).type(TRANSFORM).build();
        aleksandr.setOperation(operationA);
        aleksandr.setOperation(operationA2);
        aleksandr.setOperation(operationA3);

        AppUser ivan = new AppUser("Ivan");
        Operation operationI = Operation.builder().amount(150).userId(ivan.getId()).type(INCREASE).build();
        Operation operationI2 = Operation.builder().amount(250).userId(ivan.getId()).type(DECREASE).build();
        Operation operationI3 = Operation.builder().amount(350).userId(ivan.getId()).type(TRANSFORM).build();
        ivan.setOperation(operationI);
        ivan.setOperation(operationI2);
        ivan.setOperation(operationI3);

        AppUser dmitriy = new AppUser("Dmitriy");
        Operation operationD = Operation.builder().amount(90).userId(dmitriy.getId()).type(INCREASE).build();
        Operation operationD2 = Operation.builder().amount(190).userId(dmitriy.getId()).type(DECREASE).build();
        Operation operationD3 = Operation.builder().amount(240).userId(dmitriy.getId()).type(TRANSFORM).build();
        dmitriy.setOperation(operationD);
        dmitriy.setOperation(operationD2);
        dmitriy.setOperation(operationD3);

        return List.of(aleksandr, ivan, dmitriy);
    }
}
