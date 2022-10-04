package pizza.test.api;

import java.util.List;

/**
 * The order is created by the Client
 */
public interface IOrder {
    /**
     * the list of selected items in the menu
     * @return list of selected items
     */
    List<ISelectedItem> getSelected();


}
