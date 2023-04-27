package com.jk.azure.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class OrderController {
    private final Map<String, String> orders = new HashMap<>();

    @GetMapping("/v1/orders")
    public Map<String, String> getOrders()
    {
        return orders;
    }

    @PostMapping("/v1/orders")
    //@PreAuthorize("hasAuthority('Scope_Orders.User'")
    public String postOrders(@RequestParam("orderNo") String orderNo, @RequestParam("orderItem") String orderItem)
    {
        orders.put(orderNo,orderItem);
        return "Add Order - Success";
    }

    @DeleteMapping("/v1/orders/{orderNo}")
    public String deleteOrders(@PathParam("orderNo") String orderNo)
    {
        orders.remove(orderNo);
        return "Delete Order - Success";
    }
}
