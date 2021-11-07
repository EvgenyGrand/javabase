package com.company;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int j=0; j<arr.length;j++){
            arr[j]=j*10;
            System.out.println(arr[j]);
        }
        System.out.println();
        String [] names = {"Ilia", "Janna", "Nikita","Jenia","Aleksey"};
        names[3]="Kirill";
        for(int i =0; i<names.length-1;i++){
            System.out.println(names[i]);
        }
        }
    }

