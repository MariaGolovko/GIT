package pizza.test.api;

import java.util.List;

/**
 * The status of the order according to the ticket
 */
public interface IOrderStatus {
    /**
     * the ticket according to the order
     * @return
     */
    ITicket getTicket();
    /**
     * get the list of done stages
     * @return completed states of the order
     */
    List<IStage> getHistory();

    /**
     * the status of the order
     * @return true - is ready, false - is not ready;
     */
    boolean isDone();
}
