package com.mobita.aether.test;

import com.mobita.aether.model.Type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCharacter {
    @Test
    public void toStringTest(){
        Character ch = new Character("A", "B", Type.NETHER);
        Assertions.assertEquals(ch.toString(), "Name: A\nDescription: B\nType: NETHER");
    }
}
