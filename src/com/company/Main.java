package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[2];
        int[] arr = new int[arr1.length+ arr2.length];
        for(int i =0; i< arr1.length;i++){
            System.out.println("Enter element of arr1 "+i+": ");
            arr1[i] = input.nextInt();
        }
        for(int i =0; i< arr2.length;i++){
            System.out.println("Enter element of arr2 "+i+": ");
            arr2[i] = input.nextInt();
        }
        System.out.println("arr1: ");
        for (int item:
             arr1) {
            System.out.print(item+"\t");
        }
        System.out.println("\narr2: ");
        for (int item:
                arr2) {
            System.out.print(item+"\t");
        }
        for (int i =0;i< arr1.length;i++){
                arr[i]=arr1[i];
        }
        for (int j = 0; j< arr2.length;j++){
            arr[arr1.length+j]=arr2[j];
        }
        System.out.println("\n New array: ");
        for (int item:
             arr) {
            System.out.print(item+"\t");
        }
    }
}
