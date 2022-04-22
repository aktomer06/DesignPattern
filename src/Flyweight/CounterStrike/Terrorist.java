package Flyweight.CounterStrike;

public class Terrorist implements Player{
    //Intrinsic attribute
    private String task;
    //Extrinsic attribute
    private String weapon;

    Terrorist() {
        task = "Plant a bomb";
        System.out.println("Terrorist is created");
    }
    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " | Task is " + task);
    }
}
