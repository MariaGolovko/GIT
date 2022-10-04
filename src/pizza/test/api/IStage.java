package pizza.test.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * Description of stage of order cooking
 */
public interface IStage {
    /**
     * Description of the stage
     * @return
     */
    String getDescription();

    /**
     * Time when the stage was beginning
     * @return
     */
    LocalTime getTime();

}
