package com.company;

public class MyFunctionTopLevel {
    public static int f(int n){
        return n == 0 ? 1 : n * f(n - 1);
    }
}
