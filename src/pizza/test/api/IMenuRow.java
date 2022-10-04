package pizza.test.api;

/**
 * The row in the Menu
 */
public interface IMenuRow {
    /**
     * Pizza Information
     * @return
     */
    IPizzaInfo getInfo();

    /**
     * Price of Pizza
     * @return
     */
    double getPrice();
}
