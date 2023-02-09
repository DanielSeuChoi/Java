public class Bat extends Mammal {

    public int energyLvl = 300;

    public void printEnergy() {
        System.out.println("Energy level:" + energyLvl);

    }

    public void attackTown() {
        System.out.println("*FWOOOOSH* *BOOOM* *CRACKLE*");
        energyLvl -= 100;
        printEnergy();
    }

    public void fly() {
        System.out.println("FLY MY PRETTY");
        energyLvl -= 50;
        printEnergy();
    }

    public void eatHoomans() {
        System.out.println("Big Bat, use bite!");
        energyLvl += 25;
        printEnergy();
    }

}
