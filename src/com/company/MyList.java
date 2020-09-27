package com.company;

import java.util.*;

public class MyList {

    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = new int[3];
        myArr[0] = random.nextInt(10);
        myArr[1] = random.nextInt(10);
        myArr[2] = random.nextInt(10);

        for ( int i = 0; i < myArr.length; i++)
        {
            System.out.println(myArr[i]);
        }
        System.out.println("- - - - - - - - ");
        List<Integer> myList = new ArrayList<>();
        myList.add(5);

        myList.get(0);
        //myList.get(1);
        myList.add(20);
        myList.add(30);

        System.out.println(myList.size());
        myList.add(3, 40);
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 5; i++)
        {
            int check = random.nextInt(10);
            System.out.println(check);
            System.out.println(myList.contains(check));
        }
        // Iterator
        System.out.println("- - - Iterator - - - ");
        Iterator<Integer> iterator = myList.iterator();
        //System.out.println(iterator.next());

        while (iterator.hasNext())
        {
            System.out.println(iterator);
            System.out.println(iterator.next());
        }

        // - - - Set - - -
        System.out.println("- - - Set - - -");
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(10);
        mySet.add(10);
        System.out.println(mySet.size());
        //System.out.println(mySet.);

        // - - - Map - - -
        System.out.println("- - - Map - - -");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "black");
        map.put(2, "white");
        map.put(3, "yellow");
        System.out.println("1 : " + map.get(1));
        Set<Integer> x = map.keySet();
        // - - - foreach - - -
        System.out.println("foreach: ");
        for (int item: myList)
        {
            System.out.println(item);
        }
        System.out.println(Sum(5, 7));
    }

    static void PrintList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();
    }

    /**
     * @param x
     * @param y
     * @return x + y
     */
    static int Sum(int x, int y)
    {
        System.out.println("Method Sum will return sum 'a' and 'b'");
        return x + y;
    }
}
