package packageone.test.two;

import java.util.Random;

public class Blabla {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Hello World!");

        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(100);
            //System.out.println(list[i]);
        }
        System.out.println("Master");
        print(list);
        System.out.println("------------buble serting--------------------");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int x = list[i];
                    list[i] = list[j];
                    list[j] = x;
                    System.out.println( "test" );
                }
            }
        }
        System.out.println(sum(1,2));
        print(list);
        int inteferMy = Integer.MAX_VALUE;
        System.out.println(inteferMy);
        System.out.println(inteferMy + 1);
    }

    public static void print(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
        System.out.println();
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }
}
