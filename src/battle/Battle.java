package battle;
import java.util.*;
import character.Enemy;
import character.Player;


public class Battle {
    public Player printTitle(){
        Scanner scan=new java.util.Scanner(System.in);

		Player player = new Player();

	
		/*ここから導入*/
		System.out.println("\nランダム＆ドラゴンズの世界にようこそ！");
		
		System.out.println("あなたの名前は何ですか？");
		player.setName(scan.next());
		System.out.println(player.getName()+"さん");
		System.out.println("世界を救ってください");
		System.out.println("あなたのパラメータは以下のようになります。\n");
        /*ここまで導入*/
        
        scan.close();

		return player;
    }

	public static void performBattle(Player player,Enemy enemy){
		System.out.println(player.getName() + "のHP：" + player.getHp());
		CalcDamage.attackCalc(player,enemy);
		System.out.println(player.getName() + "のHP：" + player.getHp());

		
	}


}
