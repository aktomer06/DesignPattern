package Flyweight.CounterStrike;

public class CounterTerrorist implements Player{
    private String task;
    private String weapon;
    CounterTerrorist() {
        task = "Defuse BOMB";
        System.out.println("Counter Terrorist is created");
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + " | Task is " + task);
    }
}
