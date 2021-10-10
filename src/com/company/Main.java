package com.company;

import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ArrayList<String> colors =new ArrayList<>();
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("White");
//        colors.add("Pink");
//        colors.add("Yellow");
//        System.out.println(colors);
//
//        ArrayList<String> colors2 =new ArrayList<>();
//        colors.add("Brown");
//        colors.add("Blue");
//
//        colors.addAll(colors2);
//        System.out.println(colors);
//
//        Collections.sort(colors);
//        System.out.println(colors);
//
//        Collections.reverse(colors);
//        System.out.println(colors);
//
//        Collections.shuffle(colors);
//        System.out.println(colors);
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы первого списка");
        for (int i = 0; i <5 ; i++) {
            String str = scanner.nextLine();
            arrayList.add(str);
        }
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите элементы второго списка");
        for (int i = 0; i <5 ; i++) {
            String str2 = scanner2.nextLine();
            arrayList2.add(str2);
        }
        System.out.println(arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>();


        arrayList3.add(0,arrayList.get(0));
        arrayList3.add(1,arrayList2.get(4));
        arrayList3.add(2,arrayList.get(1));
        arrayList3.add(3,arrayList2.get(3));
        arrayList3.add(4,arrayList.get(2));
        arrayList3.add(5,arrayList2.get(2));
        arrayList3.add(6,arrayList.get(3));
        arrayList3.add(7,arrayList2.get(1));
        arrayList3.add(8,arrayList.get(4));
        arrayList3.add(9,arrayList2.get(0));

        System.out.println(arrayList3);

        arrayList3.sort(Comparator.comparing(String::length));
        System.out.println("Отсортированный список: " + arrayList3);





    }
}
