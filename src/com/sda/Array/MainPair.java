package com.sda.Array;

public class MainPair {

    public static void main(String[] args) {
        LinkedList<Integer> arrList = new LinkedList();
        for(int i = 0; i < 4; ++i)
            arrList.add(i);
             arrList.add(4,50);
            //  arrList.remove(3);
        for (int i = 0; i < arrList.size(); ++i)
            System.out.println(arrList.get(i) + ", ");

    }
}
