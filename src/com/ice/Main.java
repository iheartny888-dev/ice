package src.com.ice;

public class Main {

    // Run main program
    public static void main(String[] args) {

        Icebox fridge = new Icebox("blue", 12);
        fridge.iceboxColor();
        fridge.iceboxTemp();
        fridge.iceboxOwner();

        Icecube cube = new Icecube(47, 12);
        cube.melt();
        cube.icecubeMath();


    }

}