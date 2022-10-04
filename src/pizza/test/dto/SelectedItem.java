package pizza.test.dto;

import pizza.test.api.IMenuRow;
import pizza.test.api.ISelectedItem;

public class SelectedItem implements ISelectedItem {
    private IMenuRow row;
    private int count;

    public SelectedItem(IMenuRow row, int count) {
        this.row = row;
        this.count = count;
    }

    @Override
    public IMenuRow getRow() {
        return row;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return "Выбрано{" +
                " номер - " + getRow() +
                ", кол-во - " + getCount() + '}';
    }
}
