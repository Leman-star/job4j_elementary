package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
       int resultat1 = MathFunc.func1(100);
       int resultat2 = MathFunc.func2(5);
       int total = resultat1 + resultat2;
       System.out.println(total);
    }
}
