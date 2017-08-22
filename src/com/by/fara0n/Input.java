package com.by.fara0n;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите любой текст");
        String string = scn.nextLine();
        System.out.println("Вы ввели : "+string);
    }
}
