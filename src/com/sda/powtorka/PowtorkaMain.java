package com.sda.powtorka;


import java.util.Scanner;

public class PowtorkaMain {
    public static void main(String[] args) {

        System.out.println("To write rectangle type 1:");
        System.out.println("To write square type 2:");
        System.out.println("To write triangle type 3:");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sideA;
        int sideB;
        int sideC;
        switch(number) {

            case 1:
                System.out.println("Please insert length od sideA");
                sideA = scanner.nextInt();
                System.out.println("Please insert length od sideB");
                sideB = scanner.nextInt();
                Rectangle rec = new Rectangle(sideA, sideB);
                rec.draw();
                break;
            case 2:
                System.out.println("Please insert length od side");
                int side = scanner.nextInt();
                Square square = new Square(side);
                square.draw();
                break;
            case 3:
                System.out.println("Please insert length of side");
                sideC = scanner.nextInt();
                Triangle triangle = new Triangle(sideC);
                triangle.draw();
                break;


        }
    }
}
