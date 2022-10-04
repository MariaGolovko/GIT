package pizza.test.api;

import java.util.List;

/**
 * Order is done
 */
public interface IDoneOrder {
    /**
     * The order will be cooked according to this ticket
     * @return ticket, that was issued after creating the order
     */
    ITicket getTicket();
    /**
     * done pizza cooked under the order
     * @return list of pizzas
     */
    List<IPizza> getItems();

}
