package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner (System.in);

        int count = 0;
        while(sc.hasNext() && count < 5) {
            String s = sc.nextLine();
            if("exit".equals(s)) {
                break;
            }
            count++;
        }
        String[] masOfProducts = new String[5];
        Integer [] masOfCosts = new Integer [5];
        Integer[] masOfCounts = new Integer[5];

        int count = 0;
        while(sc.hasNext() && count < 5) {
…



            while(sc.hasNext() && count < 5) {
  …
	…
	…
            count++;

            String[] parts = s.split(" ");

            String productName = parts[0];
            Integer productCost = Integer.parseInt(parts[1]);
            Integer productCount = Integer.parseInt(parts[2]);


        }
}
