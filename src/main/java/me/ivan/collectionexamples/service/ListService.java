package me.ivan.collectionexamples.service;

import lombok.RequiredArgsConstructor;
import me.ivan.collectionexamples.model.UserOperation;
import me.ivan.collectionexamples.model.OperationalType;
import me.ivan.collectionexamples.repository.ListRepository;
import me.ivan.collectionexamples.repository.MapRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ListService {
    private final ListRepository repository;
    private final MapRepository mapRepository;

    public List<UserOperation> getHigherThan(int amount) {
        return repository.getHigherThan(amount);
    }

    public int getOperationAmountByUser(long id){
        return repository.getOperationAmountByUser(id);
    }

    public Map<User, Integer> getAmountPerUser(long id){
        return repository.getAmountPerUser(id);
    }

    public List<UserOperation> getLastOperations(int amount){
        return repository.getLastOperations(amount);
    }
    public List<Long> removeLastOperations(int amount){
        return repository.removeLastOperations(amount);
    }

    public  Map<OperationalType, UserOperation> getAllPerOperationType() {
        return repository.getAllPerOperationType();
    }

    public List<UserOperation> getAllUntilType(long userId, OperationalType type){
        return repository.getAllUntilType(userId, type);
    }

    /**
     * Добавление операции, функционал:
     * 1) проверка что такой юзер существует
     * 2) Проверка что сумма больше 0
     * 3) Проверка что такая операция юзера не была произведена в ближайшие 5 секунд
     * 4) Добавление в общий список операций
     * 5) Дoбавление в список операций по юзерам в MapRepository
     * @return - идентификатор новой операции
     */
    public long addOperation(){
        return repository.addOperation();
    }
}
