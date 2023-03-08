package application.orders2.services.impl;

import application.orders2.entities.Order;
import application.orders2.repositories.OrderRepo;
import application.orders2.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;

    @Override
    public List<Order> getAll() {
        return orderRepo.findAll();
    }

    @Override
    public Order getById(Long id) {
        return orderRepo.getReferenceById(id);
    }

    @Override
    public Order updateOrder(Long id, Order order) {
        Order oldOrder = orderRepo.findById(id).get();
        oldOrder.setCitySender(order.getCitySender());
        oldOrder.setAddressSender(order.getAddressSender());
        oldOrder.setCityRecipient(order.getCityRecipient());
        oldOrder.setAddressRecipient(order.getAddressRecipient());
        oldOrder.setWeight(order.getWeight());
        oldOrder.setPickupDate(order.getPickupDate());
        orderRepo.save(oldOrder);
        return oldOrder;
    }

    @Override
    public void deleteById(Long id) {
        orderRepo.deleteById(id);
    }

    @Override
    public Order create(Order order) {
        return orderRepo.save(order);
    }
}
