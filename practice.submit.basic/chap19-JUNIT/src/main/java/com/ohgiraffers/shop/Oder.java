package com.ohgiraffers.shop;

import java.util.List;
import java.time.LocalDateTime;

public class Oder {
    private final long id;
    private final List<OrderItem> items;
    private final LocalDateTime createAt;


    public Oder(long id, List<OrderItem> items, LocalDateTime createAt) {
        this.id = id;
        this.items = items;
        this.createAt = createAt;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public long getId() {
        return id;
    }

    public int totalPrice() {
        return items.stream().mapToInt(OrderItem::lineTotal).sum();
    }


    private class OrderItem {
    }
}
