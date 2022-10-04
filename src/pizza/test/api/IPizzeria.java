package pizza.test.api;

/**
 * Pizzeria
 */
public interface IPizzeria {
    /**
     * get Menu
     * @return Menu with available items to order
     */
    IMenu takeMenu();

    /**
     * create the Order
     * @param order
     * @return the ticket for searching
     */
    ITicket create(IOrder order);

    /**
     * check the status on the base of ticket
     * @param ticket
     * @return Order status info
     */
    IOrderStatus check(ITicket ticket);

    /**
     * get the created order
     * @param ticket
     * @return done order with selected items
     */
    IDoneOrder pickup(ITicket ticket);
}
