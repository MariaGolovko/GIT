package pizza.test.api;

/**
 * Client's choice
 */
public interface ISelectedItem {
    /**
     * Selected items in the menu
     * @return
     */

    IMenuRow getRow();

    /**
     * Selected quantity
     * @return
     */
    int getCount();
}
