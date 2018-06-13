package com.weips.designpattern.flyweight;

import android.util.Log;

public class TrainTicket implements Ticket {
    public String from;
    public String to;
    public String bunk;
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        this.price = 73;
        this.bunk = bunk;

        Log.e("TrainTicket", "TrainTicket{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", bunk='" + bunk + '\'' +
                ", price=" + price +
                '}');
    }
}
