package com.mobita.aether.message;

public interface IWatcher<T> {
    void notify(IMessage<T> message);
}
