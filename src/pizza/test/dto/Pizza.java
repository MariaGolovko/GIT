package pizza.test.dto;

import pizza.test.api.IPizza;

public class Pizza implements IPizza {
    private String name;
    private int size;

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public String toString(){
        return "Пицца{" +
                "наименование - " + getName() + '\'' +
                "; размер " + getSize() + '}';
    }
}
