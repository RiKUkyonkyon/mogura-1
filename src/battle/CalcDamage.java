package battle;
import character.*;

public class CalcDamage {


    public static void attackCalc(Player player,Enemy enemy){
        int tempHp = 0;
        tempHp = player.getHp() - enemy.getAttack() + player.getDefence();
        player.setHp(tempHp);
        return;
    }
}
