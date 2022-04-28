package com.mobita.aether.message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Observer {
    private Map<String, ArrayList<IWatcher<?>>> watchers;

    public Observer(){
        this.watchers = new HashMap<>();
    }

    public Observer registerWatcher(String event, IWatcher<?> watcher){
        ArrayList<IWatcher<?>> eventWatcher =  watchers.get(event);

        if(eventWatcher == null){
            eventWatcher = new ArrayList<>();
        }

        eventWatcher.add(watcher);
        watchers.put(event, eventWatcher);
        return this;
    }

    public Observer notifyEvent(String event, IMessage message) {
        if(watchers.get(event) != null){
            for(IWatcher watcher: watchers.get(event)){
                watcher.notify(message);
            }
        }

        return this;
    }
}
