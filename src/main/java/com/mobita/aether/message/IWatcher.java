package com.mobita.aether.message;

import java.net.URISyntaxException;

public interface IWatcher<T> {
    void notify(IMessage<T> message) throws URISyntaxException;
}
