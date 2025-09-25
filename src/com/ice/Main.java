package src.com.ice;

public class Main {

    public static void main(String[] args) {

        Icebox fridge = new Icebox("blue", 12);
        fridge.iceboxColor();
        fridge.iceboxTemp();

        Icecube cube = new Icecube(47, 12);
        cube.melt();

    }

}