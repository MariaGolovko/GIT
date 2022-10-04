package pizza.test.dto;

import pizza.test.api.IOrder;
import pizza.test.api.ISelectedItem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {
    private List<ISelectedItem> selected = new ArrayList<>();

    public Order(List<ISelectedItem> selected) {
        this.selected = selected;
    }

    @Override
    public List<ISelectedItem> getSelected() {
        return selected;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Заказ: ");
        for (ISelectedItem selectedItem: selected){
            builder.append(selectedItem.toString());
        }
        return builder.toString();
    }
}
