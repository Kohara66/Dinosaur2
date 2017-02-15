package com.happy;
import java.util.Scanner;
//this program displays a square of character&
//outer loop will print one row per loop
public class Main {
static Scanner stringScanner = new Scanner(System.in);
static Scanner numberScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number1;
	{
        System.out.println("Enter a size number of the square");
        Scanner number1 = new Scanner(System.in);
          number1= Scanner.nextInt();
        System.out.println()
        for (int x = 1; x<=number1; ++x)
            for (int y = 2; y<=number1;++ y)
            {
                System.out.print("&");
            }
            System.out.println("&");
        }
    }}

