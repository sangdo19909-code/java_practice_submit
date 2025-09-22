package com.ohgiraffers.shop;

public class OderItem {
    private final String name;    //삼품명
    private final int quantity;   //구매수량
    private final int unitPrice;  //개당가격

    public OderItem(String name, int quantity, int unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }


    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int lineTotal() {
        return quantity * unitPrice;


    }





}
