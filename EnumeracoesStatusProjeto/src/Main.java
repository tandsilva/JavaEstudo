import Entities.Order;
import Entities_enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //as duas classes esta escutando aguardando ser instanciada
        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);
        //foi definida este obj para que fosse alterado o estado do objeto
        OrderStatus  os1 = OrderStatus.DELIVERED;

        //obs nao eh uma string qualquer existe um processo de conversao
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(order);
        System.out.println(os1);
        System.out.println(os2);
    }
}