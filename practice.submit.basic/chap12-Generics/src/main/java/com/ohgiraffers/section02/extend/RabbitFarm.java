package com.ohgiraffers.section02.extend;

public class RabbitFarm <T extends Rabbit> {
    pirvate T rabbit;

    public RabbitFarm() {}

    public RabbitFarm(T rabbit) {
        this.rabbit = rabbit;
    }


}
