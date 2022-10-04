package pizza.test.dto;

import pizza.test.api.IOrderStatus;
import pizza.test.api.IStage;
import pizza.test.api.ITicket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderStatus implements IOrderStatus {
    private ITicket ticket;
    private List<IStage> history = new ArrayList<>();

    public OrderStatus(ITicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IStage> getHistory() {
        return history;
    }
    public boolean isDone(){
        boolean result = false;
        String done = "Done";
        for (IStage stage: history) {
            if (Objects.equals(getHistory(), done)) {
                result = true;
            }
        }
        return result;
    }
    @Override
    public String toString(){
        return "Статус заказа{" +
                "Квиток - " + getTicket() + '\''+
                ", завершенные стадии готовности -  " + getHistory() + '\'' +
                ", заказ готов 100% - " + isDone() +
                '}';
    }
}
