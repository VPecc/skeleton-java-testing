package com.example.skeleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyClassTest {
    @Test
    void assert_reverse_returns_reversed_string() {
        MyClass myClass = new MyClass();
        String actual = myClass.reverse("retek");
        String expected = "keter";
        assertEquals(expected, actual);
    }

}
