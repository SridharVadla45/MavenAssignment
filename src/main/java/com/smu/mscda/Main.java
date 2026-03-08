package com.smu.mscda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String input = scanner.nextLine();

        String capitalized = StringUtils.capitalize(input);
        String md5Hex = DigestUtils.md5Hex(input);

        System.out.println("Capitalized String: " + capitalized);
        System.out.println("MD5 Hex: " + md5Hex);

        scanner.close();
    }
}