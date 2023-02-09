public class Gorilla extends Mammal {

    public void throwBanana() {
        System.out.println("Gorilla threw banana");
        this.energyLvl -= 5;
        displayEnergy();
    }

    public void eatBanana() {
        System.out.println("Gorilla eat banana");
        energyLvl += 10;
        displayEnergy();
    }

    public void climbWall() {
        System.out.println("Gorilla Climb");
        energyLvl -= 10;
        displayEnergy();
    }
}
