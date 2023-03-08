package application.orders2.services;

import application.orders2.entities.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderService {
    List<Order> getAll();
    Order getById(Long id);
    Order updateOrder(Long id, Order order);
    void deleteById(Long id);
    Order create(Order order);

}
