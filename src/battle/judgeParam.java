package battle;

import character.Enemy;
import character.Player;

public class judgeParam {



    public static boolean zeroHp(Player character){
        if(character.getHp() == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean zeroHp(Enemy character){
        if(character.getHp() == 0){
            return true;
        }else{
            return false;
        }
    }

}
