package src.com.ice;

public class Icecube extends Icebox {

    private int quant;

    public Icecube(int quant, int temp) {
        super("color", temp);
        this.quant = quant;
    }

    public void melt() {
        System.out.println("There are " + quant + "icecubes melting from " + temp + "°.");
    }

}