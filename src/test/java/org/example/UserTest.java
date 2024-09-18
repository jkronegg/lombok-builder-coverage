package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {
    @Test
    void test() {
        assertNotNull(new User());
        assertNotNull(User.builder().build());
    }

}
