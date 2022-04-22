package Flyweight.CounterStrike;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    static Map<PlayerType, Player> playerMap = new HashMap<>();

    public static Player getPlayer(PlayerType playerType) {
        if(playerMap.get(playerType) == null) {
            Player player = null;
            switch (playerType) {
                case TERROR -> {
                    player = new Terrorist();
                    break;
                }
                case COUNTER_TERROR -> {
                    player = new CounterTerrorist();
                    break;
                }
            }
            if(player == null) {
                throw new InvalidParameterException();
            }
            playerMap.put(playerType, player);
        }
        return playerMap.get(playerType);
    }
}
