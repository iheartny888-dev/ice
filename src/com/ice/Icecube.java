package src.com.ice;

public class Icecube extends Icebox {

    private int quant;

    public Icecube(int quant, String color, int temp) {
        super(color);
        super(temp);
        this.quant = quant;
    }

    public void melt() {
        System.out.println("There are " + quant + "icecubes melting from " + temp + "°.");
    }

}