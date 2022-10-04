package pizza.test;

import pizza.test.api.IMenuRow;
import pizza.test.dto.Menu;
import pizza.test.dto.MenuRow;
import pizza.test.dto.PizzaInfo;
import pizza.test.dto.Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaInfo pizzaWithMashrooms = new PizzaInfo(
                "Грибная",
                "чесночный соус, ветчина, свежие шампиньоны, сыр моцарелла, базилик",
                36);
        PizzaInfo pizzaHiwaii = new PizzaInfo(
                "Гавайская",
                "сырный соус, ветчина, филе цыпленка, ананасы, сыр моцарелла, базилик",
                36);
        PizzaInfo pizzaItaliano = new PizzaInfo(
                "Итальянская",
                "пицца-соус, пепперони, свежие шампиньоны, грудинка (свинина), маслины, сыр моцарелла, базилик",
                25);

        MenuRow row1 = new MenuRow(pizzaWithMashrooms, 22.90);
        MenuRow row2 = new MenuRow(pizzaItaliano, 22.90);
        MenuRow row3 = new MenuRow(pizzaHiwaii, 18.90);

        Menu menu = new Menu(new ArrayList<>());
        menu.addToMenu(row1);
        menu.addToMenu(row2);
        menu.addToMenu(row3);

        Pizzeria pizzeria = new Pizzeria(menu);



    }
}
