package com.hms;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class A {
    public static void main(String[] args) {
        System.out.println(BCrypt.hashpw("Ajay@123",BCrypt.gensalt(5)));
    }
}
