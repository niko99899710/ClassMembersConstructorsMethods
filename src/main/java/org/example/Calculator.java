package org.example;

public class Calculator {
   private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b= b;
    }

    public  Calculator (){
        a = 10;
        b = 2;
    }


    public int summ() {
        final int a = 10;
        final int b = 2;
        int result = a+b;
        System.out.println(result);
        return result;
    }
    public int differece(final int a, final int b) {
        int result = a-b;
        System.out.println(result);
        return result;
    }
    public void multiplication(final int a, final int b) {
        int result = a * b;
        System.out.println(result);
    }
    public void separation(final int a, final int b) {
        int result = a/b;
        System.out.println(result);
    }

   @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
