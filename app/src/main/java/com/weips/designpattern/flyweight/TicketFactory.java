package com.weips.designpattern.flyweight;

import android.util.Log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {
    public static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTicketMap.containsKey(key)) {
            Log.e("TicketFactory", "use cache");
            return sTicketMap.get(key);
        } else {
            Log.e("TicketFactory", "create");
            Ticket ticket = new TrainTicket(from, to);
            sTicketMap.put(key, ticket);
            return ticket;
        }
    }
}
