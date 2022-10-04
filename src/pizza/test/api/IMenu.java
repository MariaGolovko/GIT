package pizza.test.api;

import java.util.List;

/**
 * Menu
 */
public interface IMenu {
    /**
     * items are available to order
     * @return the items are available to order
     */
    List<IMenuRow> getItems();
}
