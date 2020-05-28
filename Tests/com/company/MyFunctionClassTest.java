package com.company;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFunctionClassTest {
        @Test
        public void applyAndPrintQuadratTest1() {
            int actual =  MyFunctionClass.applyAndPrint(1, 2, 1);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 1);
            int expected = 30;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 1);
            int expected = 25;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetTest1() {
            int actual = MyFunctionClass.applyAndPrint(1, 2, 2);
            int expected = 3;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetTest2(){
            int actual = MyFunctionClass.applyAndPrint(4, 1, 2);
            int expected = 33;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 2);
            int expected = 30;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3Test1(){
            int actual = MyFunctionClass.applyAndPrint(1, 2, 3);
            int expected = 9;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3Test2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 3);
            int expected = 1114;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3Test3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 3);
            int expected = 1105;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboTest1(){
            int actual = MyFunctionClass.applyAndPrint(1, 2, 4);
            int expected = 2;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 4);
            int expected = 7;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 4);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratLambdaTest1() {
            int actual = MyFunctionClass.applyAndPrint(1, 2, 11);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratLambdaTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 11);
            int expected = 30;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratLambdaTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 11);
            int expected = 25;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetLambdaTest1() {
            int actual = MyFunctionClass.applyAndPrint(1, 2, 21);
            int expected = 3;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetLambdaTest2(){
            int actual = MyFunctionClass.applyAndPrint(4, 1, 21);
            int expected = 33;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetLambdaTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 21);
            int expected = 30;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3LambdaTest1(){
            int actual = MyFunctionClass.applyAndPrint(1, 2, 31);
            int expected = 9;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3LambdaTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 31);
            int expected = 1114;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3LambdaTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 31);
            int expected = 1105;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboLambdaTest1(){
            int actual = MyFunctionClass.applyAndPrint(1, 2, 41);
            int expected = 2;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboLambdaTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 41);
            int expected = 7;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboLambdaTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 41);
            int expected = 5;
            assertEquals(expected, actual);
        }

}