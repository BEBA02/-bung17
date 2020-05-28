package com.company;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public interface MyFunction {
    int apply(int i);

    //Lamda = implemeniterun eines funktionalen interfaces, d.h wir benötigen ein Objekt MyFunction
    default MyFunction conditionateInput (IntPredicate intPredicate){
        return i-> intPredicate.test(i) ? apply (i) : 0;
    }
}
