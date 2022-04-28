package com.mobita.aether.message;

public interface IMessage<T> {
    T getMessage();
    void setMessage(T message);
}
