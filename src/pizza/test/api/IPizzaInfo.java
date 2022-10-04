package pizza.test.api;

/**
 * Pizza Info
 */
public interface IPizzaInfo {
    /**
     * Pizza name
     * @return
     */
    String getName();

    /**
     * Description/pizza ingredients
     * @return
     */
    String getDescription();
    /**
     * Final size of selected pizza
     * @return
     */
    int getSize();

}
