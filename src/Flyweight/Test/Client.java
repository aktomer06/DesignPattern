package Flyweight.Test;

import Flyweight.Bullet.Bullet;
import Flyweight.Bullet.FlyingBullet;
import Flyweight.CounterStrike.Player;
import Flyweight.CounterStrike.PlayerFactory;
import Flyweight.CounterStrike.PlayerType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    private static PlayerType[] playerType = {PlayerType.COUNTER_TERROR, PlayerType.TERROR};

    private static String[] weapons =
            {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    public static void main(String[] args) {
//        List<FlyingBullet> flyingBulletList = new ArrayList<>();
//        Map<Integer, Bullet> bulletMap = new HashMap<>();
//
//        for(int i = 0; i< 72000; i++) {
//            FlyingBullet flyingBullet = new FlyingBullet();
//            flyingBullet.setSpeed((int)(Math.random()*1000));
//            flyingBullet.setDamage(20);
//            flyingBullet.setDirection((int) (Math.random()*10));
//
//            int caliber = (int) (Math.random()*5);
//            if(bulletMap.get(caliber) == null)
//            {
//                System.out.println("Caliber = " + caliber);
//                Bullet bullet = new Bullet();
//                bullet.setCaliber(caliber);
//                bullet.setColor("Green");
//                bullet.setImage("Sample image");
//                bullet.setWeight((int)(Math.random()*100));
//
//                bulletMap.put(caliber, bullet);
//            }
//            flyingBullet.setBullet(bulletMap.get(caliber));
//            flyingBulletList.add(flyingBullet);
//        }
//        for(int i = 0; i < 20; i++) {
//            flyingBulletList.get(i).showBullet();
//        }

        // Counter strike
        for(int i = 0; i<10; i++) {
            Player player = PlayerFactory.getPlayer(getRandomPlayerType());
            player.assignWeapon(getRandomWeapon());
            player.mission();
        }
    }
    static PlayerType getRandomPlayerType() {
        return playerType[(int) (Math.random()*10)%2];
    }
    static String getRandomWeapon(){
        return weapons[(int) (Math.random()%10)%weapons.length];
    }
}
