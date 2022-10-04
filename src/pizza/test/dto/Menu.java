package pizza.test.dto;

import pizza.test.api.IMenu;
import pizza.test.api.IMenuRow;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {
    private List<IMenuRow> items = new ArrayList<>();

    public Menu(List<IMenuRow> items) {
        this.items = items;
    }

    @Override
    public List<IMenuRow> getItems() {
        return items;
    }

    @Override
    public String toString(){
        return "Меню{" + getItems() + '}';
    }
    public void addToMenu(IMenuRow menuRow){
        items.add(menuRow);

    }
}
