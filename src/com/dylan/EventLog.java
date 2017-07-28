package com.dylan;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.dylan.Event.*;

public class EventLog {


    private static List<Event> eventList = new ArrayList<>();
    public static boolean addEvent(Event event){

        if(event == null || name == null || action == null ) {
            throw new IllegalArgumentException();
        }
        else if (Objects.equals(action, "Face2Face") || Objects.equals(action, "PhoneCall") || Objects.equals(action, "TextMessaging") || Objects.equals(action, "Unknown")) {
            System.out.println(event);
            return true;

        }
        else {
//            eventList.add(event);
            throw new IllegalArgumentException();

//            System.out.println(event);
        }


    }
    public int getNumEvents (){
        return eventList.size();
    }
    public EventLog (){
        Event event = new Event();
    }


}
