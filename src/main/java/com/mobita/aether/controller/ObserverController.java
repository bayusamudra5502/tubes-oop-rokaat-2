package com.mobita.aether.controller;

import com.mobita.aether.message.IMessage;
import com.mobita.aether.message.IWatcher;
import com.mobita.aether.message.Observer;

public class ObserverController {
    private static Observer observer;

    public static void notifyEvent(String eventName, IMessage<?> message){
        if(observer == null){
            observer = new Observer();
        }

        observer.notifyEvent(eventName, message);
    }

    public static void registerWatcher(String eventName, IWatcher<?> watcher){
        if(observer == null){
            observer = new Observer();
        }

        observer.registerWatcher(eventName, watcher);
    }
}
