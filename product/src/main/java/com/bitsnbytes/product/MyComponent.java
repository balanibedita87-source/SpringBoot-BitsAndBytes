package com.bitsnbytes.product;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public MyComponent(){
        System.out.println("Result from MyComponent");

    }

    public void getMessage(){
        System.out.println("Result from get message");
    }
}
