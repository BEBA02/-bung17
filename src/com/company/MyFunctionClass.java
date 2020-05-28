package com.company;

import java.util.function.IntPredicate;

public class MyFunctionClass implements MyFunction{




    @Override
    public int apply(int i) {

        int j = 0;
        int funktion = 0;
        return applyAndPrint(i, j, funktion);
        }

    /**
     * Methode zum Ausfuehren und Ausgeben der Funktionen
     *
     * @param i        -   Start der Funktion
     * @param j        -   Ende der Funktion
     * @param funktion -   Funktion die ausgefuehrt werden soll    -   Muss zwischen 1 und 4 sein
     * @return int     ergebnis
     */
    public static int applyAndPrint(int i, int j, int funktion) {
        int ergebnis = 0;

        /* Tauschen der Variablen falls j kleiner als i ist */
        if (j < i) {
            int temp = i;
            i = j;
            j = temp;
        }


        /* Auswahl der Funktion */
        /* Realisierung mit anonymen Klassen */
        if (funktion == 1) {
            MyFunction mf = new MyFunction() {
                @Override
                public int apply(int i) {
                    return i * i;
                }
            };
            ergebnis = mf.apply(i);

        } else if (funktion == 2) {
            MyFunction mf = new MyFunction() {
                @Override
                public int apply(int i) {
                    return f(i);
                }
            };
            ergebnis = mf.apply(i);
        } else if (funktion == 3) {
            MyFunction mf = new MyFunction() {
                @Override
                public int apply(int i) {
                    return xHochXPlusEins(i);
                }
            };
            ergebnis = mf.apply(i);
        } else if (funktion == 4) {
            MyFunction mf = new MyFunction() {
                @Override
                public int apply(int i) {
                    return fibonacci(i);
                }
            };
            ergebnis = mf.apply(i);
        }
        /* Realisierung mit Lambda */
        else if(funktion == 11) {
            MyFunction mf = i1 -> i1 * i1;
            ergebnis = mf.apply(i);

        } else if (funktion == 21) {
            MyFunction mf = MyFunctionClass::f;
            ergebnis = mf.apply(i);
        } else if (funktion == 31) {
            MyFunction mf = MyFunctionClass::xHochXPlusEins;
            ergebnis = mf.apply(i);
        } else if (funktion == 41) {
            MyFunction mf = MyFunctionClass::fibonacci;
            ergebnis = mf.apply(i);

            /* Realisierung mit Nested Class */
        } else if (funktion == 32){
            ergebnis = Funktion2Nested.f(i);
            /* Realisierung mit Top Level Class */
        } else if (funktion == 33){
            ergebnis = MyFunctionTopLevel.f(i);
        }

        /* Schleife zum Ausfuehren der Funktion von i bis j */
        if (i < j) {
            ergebnis += applyAndPrint(i + 1, j, funktion);
        }
        return ergebnis;
    }

    /**
     * Hilfsmethode zum Berechnen der Fakultaet
     * @param n =   Zahl deren Fakultaet berechnet werden soll
     * @return  int     Fakultaet
     */
    private static int f(int n) {
        return n == 0 ? 1 : n * f(n - 1);
    }

    /**
     * Hilfsmethode zum Berechnen der Formel x^(x+1)
     * @param x =   Zahl mit der die Formel berechnet wird
     * @return  int     Ergebnis der Formel
     */
    private static int xHochXPlusEins(int x) {
        int ergebnis;
        ergebnis = (int) Math.pow(x, x + 1);
        return ergebnis;
    }

    /**
     * Hilfsmethode zum Berechnen der Fibonacci Folge
     * @param i =   Zahl deren Fibonacci Folge berechnet werden soll
     * @return  int     Ergebnis der Folge
     */
    private static int fibonacci(int i) {
        if (i == 1 || i == 2) return 1;

        else return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static class Funktion2Nested{
        public static int f(int n){
            return n == 0 ? 1 : n * f(n - 1);
        }
    }

    @Override
    public MyFunction conditionateInput(IntPredicate intPredicate) {
        return this::even;
    }

    public  void odd(int zahl){
        IntPredicate odd = test -> zahl %2 == 1;
    }

    public int even(int zahl){
        IntPredicate even = test -> zahl %2 == 0;
        return zahl;
    }
}
