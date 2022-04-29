package com.mobita.aether.message.type;

import com.mobita.aether.message.IMessage;

public class IdMessage implements IMessage<String> {
    private String id;

    public IdMessage(String id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return id;
    }

    @Override
    public void setMessage(String id) {
        this.id = id;
    }
}