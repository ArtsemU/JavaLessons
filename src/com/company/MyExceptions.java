package com.company;

public class MyExceptions {
    public static void main(String[] args) {


        int a = 1;
        int b = 0;

        try
        {
            System.out.println("--- block TRY");
            int s;
            s = a/b;
            System.out.println("Result: " + s);
        }
        catch (ArithmeticException e)
        {
            System.out.println("--- Block CATCH 1");
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Hey!");
            System.out.println("Do something");
            System.out.println("Do something again");
        }
        catch (Exception e)
        {
            System.out.println("--- Block CATCH 2");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
