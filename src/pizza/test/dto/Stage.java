package pizza.test.dto;

import pizza.test.api.IStage;

import java.time.LocalTime;

public class Stage implements IStage {
    private String description;
    private LocalTime time;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public LocalTime getTime() {
        time = LocalTime.now();
        return time;
    }
    @Override
    public String toString(){
        return "Стадия готовности{" +
                time + ", " + getDescription() +
                '}';
    }
}
