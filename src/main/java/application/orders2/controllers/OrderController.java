package application.orders2.controllers;

import application.orders2.entities.Order;
import application.orders2.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/orders")
    public String getAllOrders(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orders", orders);
        return "order-list";
    }

    @GetMapping("/order-create")
    public String orderCreateForm(Order order) {
        return "order-create";
    }

    @PostMapping("/order-create")
    public String orderCreate(Order order) {
        orderService.create(order);
        return "redirect:/orders";
    }

    @GetMapping("/order-delete/{id}")
    public String deleteOrder(@PathVariable("id") Long id) {
        orderService.deleteById(id);
        return "redirect:/orders";
    }

    @GetMapping("/order-update/{id}")
    public String orderUpdateForm(@PathVariable("id") Long id, Model model) {
        Order order = orderService.getById(id);
        model.addAttribute("order", order);
        return "order-update";
    }

    @PostMapping("/order-update")
    public String orderUpdate(Order order) {
        orderService.create(order);
        return "redirect:/orders";
    }
}