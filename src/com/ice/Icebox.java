import java.util.Scanner;

package src.com.ice;

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
        private String name = scanner.nextLine();
        System.out.println("The Icebox is owned by " + name + ".");
    }

}