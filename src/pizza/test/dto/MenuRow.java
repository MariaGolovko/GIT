package pizza.test.dto;

import pizza.test.api.IMenuRow;
import pizza.test.api.IPizzaInfo;

public class MenuRow implements IMenuRow {
    private IPizzaInfo info;
    private double price;
    public MenuRow(IPizzaInfo info, double price){
        this.info = info;
        this.price = price;
    }

    @Override
    public IPizzaInfo getInfo() {
        return info;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return "Позиции меню: " +
                "Информация - " + getInfo() + '\'' +
                "; Цена - " + getPrice() + '}';

    }
}
