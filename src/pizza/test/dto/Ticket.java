package pizza.test.dto;

import pizza.test.api.IOrder;
import pizza.test.api.ITicket;

import java.time.LocalDateTime;
import java.util.Random;

public class Ticket implements ITicket {
    private String number;
    private LocalDateTime createAt;
    private IOrder order;

    public Ticket(String number, LocalDateTime createAt, IOrder order) {
        this.number = number;
        this.createAt = createAt;
        this.order = order;
    }

    public Ticket(String number, IOrder order) {
        this.number = number;
        this.order = order;
    }

    @Override
    public String getNumber() {
        return generateNumber();
    }

    public static String generateNumber(){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 3; i++){
            int number = random.nextInt(26);
            sb.append(str.charAt(number));
        }
        sb.append(random.nextInt(9));
        return sb.toString();
    }


    @Override
    public LocalDateTime getCreateAt() {
        LocalDateTime createAt = LocalDateTime.now();
        return createAt;
    }

    @Override
    public IOrder getOrder() {
        return order;
    }
    @Override
    public String toString(){
        return "Квиток{" +
                "Заказ № " + getNumber() + '\'' +
                ", Заказ принят в " + getCreateAt() + '\'' +
                ", Заказ: " + getOrder() + '}';
    }
}
