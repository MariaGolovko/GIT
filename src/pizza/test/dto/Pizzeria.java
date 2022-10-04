package pizza.test.dto;

import pizza.test.api.*;

public class Pizzeria implements IPizzeria {
    private IMenu menu;


    public Pizzeria(IMenu menu) {
        this.menu = menu;
    }

    public IMenu takeMenu(){
        return menu;
    }
    public ITicket create(IOrder order){
        Ticket ticket = new Ticket(Ticket.generateNumber(), order);
        return ticket;
    }
    public IOrderStatus check(ITicket ticket){

        return new OrderStatus(ticket);
    }
    public IDoneOrder pickup(ITicket ticket){
        return new DoneOrder(ticket);
    }

}
