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

}