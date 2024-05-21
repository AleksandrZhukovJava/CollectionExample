package me.ivan.collectionexamples.repository;

import jakarta.annotation.PostConstruct;
import me.ivan.collectionexamples.model.AppUser;
import me.ivan.collectionexamples.model.UserOperation;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static me.ivan.collectionexamples.model.OperationalType.DECREASE;
import static me.ivan.collectionexamples.model.OperationalType.INCREASE;
import static me.ivan.collectionexamples.model.OperationalType.TRANSFORM;

@Repository
public class MapRepository {

    private final Map<AppUser, List<UserOperation>> repository = new HashMap<>();

    /**
     * Получить список всех юзеров и их операций в формате:
     * User1 - Operation1
     * User1 - Operations2
     * User2 - Operations1
     * ...
     * @return - список готовый к печати
     */
    public String getAllOprationWithUsersString(){
        return null;
    }

    /**
     * Получить список переданных юзеров и их операций в формате:
     * User1 - Operation1
     * User1 - Operations2
     * User2 - операций нет
     * User3 - Operations1
     * ...
     * *если юзер не передан формат UserN - операций нет
     * @return - список готовый к печати
     */
    public String getAllOprationByUsersString(List<Long> userIds){
        return null;
    }

    /**
     * Проверяет что количество операций в листе и сумма операций у юзеров совпадают
     * @return - флаг о наличии расхождения
     */
    public boolean checkOperations(){
        return true;
    }

    /**
     * удаляет все несуществующий операции из map на основе list, и добавляет недостающие
     * @link checkOperations()
     */
    public void actualizeOperations(){

    }


//todo не забыть добабвить в List
    @PostConstruct
    private void setUp() {
        List<AppUser> appUsers = getAppUsersWithOperations();
    }

    /**
     * Генерирует трёх сотрудников c тремя операциями у каждого
     */
    private List<AppUser> getAppUsersWithOperations() {
        AppUser aleksandr = new AppUser("Aleksandr");
        UserOperation userOperationA = UserOperation.builder().amount(100).userId(aleksandr.getId()).type(INCREASE).build();
        UserOperation userOperationA2 = UserOperation.builder().amount(200).userId(aleksandr.getId()).type(DECREASE).build();
        UserOperation userOperationA3 = UserOperation.builder().amount(300).userId(aleksandr.getId()).type(TRANSFORM).build();
        aleksandr.setOperation(userOperationA);
        aleksandr.setOperation(userOperationA2);
        aleksandr.setOperation(userOperationA3);

        AppUser ivan = new AppUser("Ivan");
        UserOperation userOperationI = UserOperation.builder().amount(150).userId(ivan.getId()).type(INCREASE).build();
        UserOperation userOperationI2 = UserOperation.builder().amount(250).userId(ivan.getId()).type(DECREASE).build();
        UserOperation userOperationI3 = UserOperation.builder().amount(350).userId(ivan.getId()).type(TRANSFORM).build();
        ivan.setOperation(userOperationI);
        ivan.setOperation(userOperationI2);
        ivan.setOperation(userOperationI3);

        AppUser dmitriy = new AppUser("Dmitriy");
        UserOperation userOperationD = UserOperation.builder().amount(90).userId(dmitriy.getId()).type(INCREASE).build();
        UserOperation userOperationD2 = UserOperation.builder().amount(190).userId(dmitriy.getId()).type(DECREASE).build();
        UserOperation userOperationD3 = UserOperation.builder().amount(240).userId(dmitriy.getId()).type(TRANSFORM).build();
        dmitriy.setOperation(userOperationD);
        dmitriy.setOperation(userOperationD2);
        dmitriy.setOperation(userOperationD3);

        return List.of(aleksandr, ivan, dmitriy);
    }
}
