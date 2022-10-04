package pizza.test.api;

import java.time.LocalDateTime;

/**
 * Ticket issued under the order
 */
public interface ITicket {
    /**
     * uniq order number
     * @return
     */
    String getNumber();

    /**
     * time of receiving the order
     * @return
     */
    LocalDateTime getCreateAt();

    /**
     * Order according to the ticket
     * @return
     */
    IOrder getOrder();

}
