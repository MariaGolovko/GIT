package pizza.test.dto;

import pizza.test.api.IDoneOrder;
import pizza.test.api.IPizza;
import pizza.test.api.ITicket;

import java.util.ArrayList;
import java.util.List;

public class DoneOrder implements IDoneOrder {
    private ITicket ticket;
    private List<IPizza> items = new ArrayList<>();

    public DoneOrder(ITicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IPizza> getItems() {
        return items;
    }
    @Override
    public String toString(){
        return "Заказ готов к выдаче{" +
                "Квиток - " + getTicket() + '\'' +
                ", Пицца - " + getItems() + '}';
    }
}
