package pizza.test.dto;

import pizza.test.api.IPizzaInfo;

public class PizzaInfo extends Pizza
        implements IPizzaInfo{

    private String description;


    public PizzaInfo(String name, String description, int size) {
        super(name, size);
        this.description = description;

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String toString(){
        return "Информация{" +
                "наименование - " + getName() + '\'' +
                "; состав - " + getDescription() + '\'' +
                "; размер " + getSize() + '}';
    }
}
