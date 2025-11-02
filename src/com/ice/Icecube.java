package src.com.ice;

public class Icecube extends Icebox {

    // Icecube is the sub-class of Icebox
    private int quant;

    // Constructor
    public Icecube(int quant, int temp) {
        super("color", temp);
        this.quant = quant;
    }

    // Melts the icecubes
    public void melt() {
        System.out.println("There are " + quant + " icecubes melting from " + temp + "°.");
    }

    // Calculates the square root of the icecube quantity
    public void icecubeMath() {
        System.out.println("The square root of the number of ice cubes is " + Math.sqrt(quant) + ".");
    }

}