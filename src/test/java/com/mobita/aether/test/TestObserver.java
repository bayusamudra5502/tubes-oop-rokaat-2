package com.mobita.aether.test;

import com.mobita.aether.message.IMessage;
import com.mobita.aether.message.IWatcher;
import com.mobita.aether.message.Observer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TestObserver {
    private class DummyWatcher<T> implements IWatcher<T> {
        Queue<T> answer = new ArrayDeque<>();

        public DummyWatcher<T> addAnswer(T answer){
            this.answer.add(answer);
            return this;
        }

        @Override
        public void notify(IMessage<T> message) {
            T data = answer.poll();
            Assertions.assertEquals(data, message.getMessage());
        }
    }

    private class DummyMessage<T> implements IMessage<T> {
        T data;

        public DummyMessage(){
            data = null;
        }

        public DummyMessage(T data){
            this.data = data;
        }

        @Override
        public T getMessage() {
            return this.data;
        }

        @Override
        public void setMessage(T message) {
            this.data = message;
        }
    }

    @Test
    public void test_notify() {
        ArrayList<Integer> angka = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            angka.add(new SecureRandom().nextInt());
        }

        Observer o = new Observer();

        for(int i = 0; i < 3; i++){
            DummyWatcher<Integer> watcher = new DummyWatcher<>();
            for(Integer j: angka){
                watcher.addAnswer(j);
            }
            o.registerWatcher("Kijang", watcher);
        }

        o.registerWatcher("Kuda", new DummyWatcher<String>()
                .addAnswer("Halo")
                .addAnswer("dunia")
        );

        o.notifyEvent("Kuda", new DummyMessage<>("Halo"));
        o.notifyEvent("Kuda", new DummyMessage<>("dunia"));

        for(Integer i: angka){
            o.notifyEvent("Kijang", new DummyMessage<>(i));
        }

    }
}
