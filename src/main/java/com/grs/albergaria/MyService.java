package com.grs.albergaria;

@MyAnnotation(value = "This is MyService class annotation")
public class MyService {
    @MyAnnotation(value = "This is a method annotation")
    public void performService() {
        System.out.println("Service is being performed.");
    }
}
