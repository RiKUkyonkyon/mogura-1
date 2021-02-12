package battle;
import character.*;

public class CalcDamage {
    public static int damage = 0;



    public static void attackCalc(Player attacked,Enemy attacking){
        int tempHp;
        tempHp = attacked.getHp() - attacking.getAttack() + attacked.getDefence();
        damage = attacked.getHp() - tempHp;
        attacked.setHp(tempHp);

    }
    // 攻撃を実行するメソッド
    // 引数1：攻撃される側のオブジェクト
    // 引数2：攻撃する側のオブジェクト

    public static void attackCalc(Enemy attacked,Player attacking){
        int tempHp;
        tempHp = attacked.getHp() - attacking.getAttack() + attacked.getDefence();
        attacked.setHp(tempHp);
    }

}
