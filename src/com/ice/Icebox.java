package src.com.ice;

import java.util.Scanner;

public class Icebox {

    public String color;
    public int temp;

    public Icebox(String color, int temp) {
        this.color = color;
        this.temp = temp;
    }

    public void iceboxColor() {
        System.out.println("The Icebox is " + color + ".");
    }

    public void iceboxTemp() {
        System.out.println("The Icebox is running at " + temp + "°.");
    }

    public void iceboxOwner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("The Icebox is owned by " + name + ".");
        scanner.close();
    }

}