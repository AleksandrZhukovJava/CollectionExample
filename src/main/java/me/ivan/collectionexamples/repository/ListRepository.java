package me.ivan.collectionexamples.repository;

import me.ivan.collectionexamples.model.Operation;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository
public class ListRepository {

    private final Deque<Operation> list = new LinkedList<>();

    /**
     * получить все операции на сумму больше чем определенная
     *
     * @param amount - порог
     * @return - операции
     */
    public List<Operation> getHigherThan(int amount) {
        return null;
    }

    /**
     * получить количество операций юзера
     *
     * @param id - идентификатор юзера
     * @return - количество операций
     */
    public int getOperationAmountByUser(long id) {
        return 0;
    }

    /**
     * получить сумму всех трат по юзерам
     *
     * @param id - идентификатор юзера
     * @return - мапа - пользователь / сумма всех операций
     */
    public Map<User, Integer> getAmountByUser(long id) {
        return null;
    }

    /**
     * получить список последних добавленных операций
     *
     * @return - список последних добавленных операций
     */
    public List<Operation> getLastOperations(int amount) {
        return null;
    }

    /**
     * удалить операции с конца списка
     *
     * @param amount - количество операций к удалению
     * @return - иентификаторы удаленных операций
     */
    public List<Long> removeLastOperations(int amount) {
        return null;
    }
}
