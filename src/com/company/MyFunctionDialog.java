package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class MyFunctionDialog {
    //Scannerdeklaration
    private static Scanner input;

    //Funktionen
    private static final int FUNKTION_1             = 5;
    private static final int FUNKTION_2             = 6;
    private static final int FUNKTION_3             = 7;
    private static final int FUNKTION_4             = 8;
    private static final int FUNKTION_1_ANONYM      = 1;
    private static final int FUNKTION_2_ANONYM      = 2;
    private static final int FUNKTION_3_ANONYM      = 3;
    private static final int FUNKTION_4_ANONYM      = 4;
    private static final int FUNKTION_1_LAMBDA      = 11;
    private static final int FUNKTION_2_LAMBDA      = 21;
    private static final int FUNKTION_3_LAMBDA      = 31;
    private static final int FUNKTION_4_LAMBDA      = 41;
    private static final int FUNKTION_2_NESTED      = 32;
    private static final int FUNKTION_2_TOP_LEVEL   = 33;
    private static final int PREADIKAT              = 9;
    private static final int ENDE                   = 99;

    private static int verfahren = 0;



    //Fehlermeldungen und Ausgaben
    private static final String MSG_PROGRAMM_AUSWAHL = "Bitte wählen Sie einen der oben aufgelisteten Möglichkeiten aus!";
    private static final String MSG_FEHLER = "Ein Fehler wurde abgefangen";
    private static final String MSG_NEGATIV = "Die Zahl muss größer als 0 sein!";
    private static final String MSG_UNGUELTIGER_TYP = "Ungültiger Typ";


    public MyFunctionDialog() {
        input = new Scanner(System.in);
    }

    private void start() {
        int funktion = -1;
        while (funktion != ENDE) {
            try {
                funktion = einlesenFunktion();
                if(verfahren == 0 && funktion != 7){
                    System.out.println("Bitte erst das Verfahren angeben!");
                    ausfuehrenFunktion(7);
                }else {
                    ausfuehrenFunktion(funktion);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(MSG_UNGUELTIGER_TYP);
                input.next();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(MSG_FEHLER + e);
                e.printStackTrace(System.out);
            }
        }
    }

    private int einlesenFunktion() {
        int eingabe;
        String dialog = "Was möchten Sie als nächstes machen?\n\n" +
                FUNKTION_1 + ": Quadrat - Funktion benutzen" + "\n" +
                FUNKTION_2 + ": Fakultät - Funktion benutzen" + "\n" +
                FUNKTION_3 + ": x^(x+1) Funktion benutzen" + "\n" +
                FUNKTION_4 + ": Fibonacci - Funktion benutzen" + "\n" +
                PREADIKAT + ": Ein Prädikat als Argument übergeben\n" +
                ENDE + ": Programm beenden" + "\n"
                + "==>";
        System.out.println(dialog);
        eingabe = input.nextInt();
        return eingabe;
    }

    private void ausfuehrenFunktion(int funktion) {
        int i;
        switch (funktion) {
            case FUNKTION_1:
                System.out.println("Wie soll die Quadrat-Funktion berechnet werden?\n" +
                        FUNKTION_1_ANONYM + ": Anonym\n" +
                        FUNKTION_1_LAMBDA + ": Lambda\n");
                verfahren = input.nextInt();
                input.nextLine();
                if(verfahren == FUNKTION_1_ANONYM) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.applyAndPrint(i,j,1);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,1));

                }else if(verfahren == FUNKTION_1_LAMBDA){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.applyAndPrint(i,j,11);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,11));
                }else{
                    System.out.println("Es wurde noch kein Verfahren gewählt!\n");
                }
                break;

            case FUNKTION_2:
                System.out.println("Wie soll die Fakultät-Funktion berechnet werden?\n" +
                        FUNKTION_2_ANONYM + ": Anonym\n" +
                        FUNKTION_2_LAMBDA + ": Lambda\n" +
                        FUNKTION_2_NESTED + ": Nested\n" +
                        FUNKTION_2_TOP_LEVEL + ": Top-Level\n");
                verfahren = input.nextInt();
                input.nextLine();
                if(verfahren == FUNKTION_2_ANONYM) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.applyAndPrint(i,j,2);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,2));

                }else if(verfahren == FUNKTION_2_LAMBDA){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.applyAndPrint(i,j,21);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,21));
                }else if(verfahren == FUNKTION_2_NESTED) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.Funktion2Nested.f(i);
                    System.out.println(MyFunctionClass.Funktion2Nested.f(i));
                } else if(verfahren == FUNKTION_2_TOP_LEVEL){
                        System.out.println("Geben Sie den i ein:\n");
                        i = input.nextInt();
                        input.nextLine();
                        System.out.println("Geben Sie den j ein:\n");
                        int j = input.nextInt();
                        input.nextLine();
                        MyFunctionTopLevel.f(i);
                        System.out.println(MyFunctionTopLevel.f(i));
                } else{
                    System.out.println("Es wurde noch kein Verfahren gewählt!\n");
                }
                break;

            case FUNKTION_3:
                System.out.println("Wie soll die Quadrat-Funktion berechnet werden?\n" +
                        FUNKTION_3_ANONYM + ": Anonym\n" +
                        FUNKTION_3_LAMBDA + ": Lambda\n");
                verfahren = input.nextInt();
                input.nextLine();
                if(verfahren == FUNKTION_3_ANONYM) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.applyAndPrint(i,j,3);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,3));

                }else if(verfahren == FUNKTION_3_LAMBDA){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.applyAndPrint(i,j,31);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,31));
                }else{
                    System.out.println("Es wurde noch kein Verfahren gewählt!\n");
                }
                break;
            case FUNKTION_4:
                System.out.println("Wie soll die Quadrat-Funktion berechnet werden?\n" +
                        FUNKTION_4_ANONYM + ": Anonym\n" +
                        FUNKTION_4_LAMBDA + ": Lambda\n");
                verfahren = input.nextInt();
                input.nextLine();
                if(verfahren == FUNKTION_1_ANONYM) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.applyAndPrint(i,j,4);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,4));

                }else if(verfahren == FUNKTION_1_LAMBDA){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    MyFunctionClass.applyAndPrint(i,j,41);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,41));
                }else{
                    System.out.println("Es wurde noch kein Verfahren gewählt!\n");
                }
                break;
            case PREADIKAT:
                System.out.println("\n1: even\n2: odd");
                int praedikat = input.nextInt();
                input.nextLine();
                if(praedikat == 1){
                    System.out.println("Bitte geben Sie die zu testende Zahl ein:");
                    int zahl = input.nextInt();
                    input.nextLine();
                    MyFunctionClass mfc new MyFunctionClass().conditionateInput(zahl);// kein epasmkdn asfbjsdökfn aäöisbvhärfd b
                    System.out.println("Geben Sie die Funktion ein:" +
                            "\nAnonyme Klassen"+
                            "\n1: x^2\n2: x!\n3:x^(x+1)\n4:fib(x)");
                    System.out.println("\nLambda Ausdrücke"+
                            "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
                    System.out.println("\nStatic Nested Class"+
                            "\n32: x!");
                    System.out.println("\nTop Level Class"
                            + "\n33: x!");
                    funktion = input.nextInt();
                    input.nextLine();
                    System.out.println(MyFunctionClass.conditionateInput(zahl));

                } else if(praedikat == 2) {
                    System.out.println("Bitte geben Sie die zu testende Zahl ein:");
                    int zahl = input.nextInt();
                    input.nextLine();
                    IntPredicate odd = test -> zahl % 2 == 1;
                    System.out.println("Geben Sie die Funktion ein:" +
                            "\nAnonyme Klassen" +
                            "\n1: x^2\n2: x!\n3:x^(x+1)\n4:fib(x)");
                    System.out.println("\nLambda Ausdrücke" +
                            "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
                    System.out.println("\nStatic Nested Class" +
                            "\n32: x!");
                    System.out.println("\nTop Level Class" +
                            "\n33: x!");

                    funktion = input.nextInt();
                    input.nextLine();
                    System.out.println(MyFunctionClass.conditionateInput(odd));
                }
                break;
            case ENDE:
                System.out.println("Das Programm wird beendet!");
                break;
            default:
                System.out.println(MSG_PROGRAMM_AUSWAHL);
                break;
        }
    }


    public static void main(String[] args) {
        new MyFunctionDialog().start();
    }
}
