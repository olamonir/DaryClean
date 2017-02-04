package com.example.ola.dryclean.Objects;

/**
 * Created by ola on 1/30/2017.
 */
public class MySingleton {
    private static MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {}
}
