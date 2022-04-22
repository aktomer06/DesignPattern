package Flyweight.Bullet;

public class FlyingBullet {
    private int direction;
    private int speed;
    private int damage;
    private Bullet bullet;

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public FlyingBullet() {
        //System.out.println("Flying bullet is created");
    }
    public void showBullet() {
        System.out.println("Bullet:: caliber = " + bullet.getCaliber() + " Color = " + bullet.getColor() +
                                " Weight = " + bullet.getWeight() + " Speed = " + speed + " Direction = " + direction);
    }
}
