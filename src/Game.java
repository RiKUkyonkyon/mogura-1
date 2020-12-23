import java.util.*;
import static constants.Constants.*;
import enemy.Enemy;

class Game{
	public static void main(String []args){

		System.out.println("陳子toマンホールポンプ");

		Enemy e = new Enemy();

		



		Scanner scan=new java.util.Scanner(System.in);
	
		/*ここから導入*/
		System.out.println("\nランダム＆ドラゴンズの世界にようこそ！");
		
		System.out.println("あなたの名前は何ですか？");
		String userName=scan.next();
		System.out.println(userName+"さん");
		System.out.println("世界を救ってください");
		System.out.println("あなたのパラメータは以下のようになります。\n");
		/*ここまで導入*/
	
		
		/*
		int[] parametersUser={hitpoint,attack,defence,magic_attack,magic_defence};
		*/
		for(int i=0;i<=4;i++){
			// Random random=new Random();
			/*
			parametersUser[i] = random.nextInt(10);
			*/
		}
		/*
		System.out.println("\n体力は"  + (parametersUser[hitpoint_index]+1));
		System.out.println("攻撃力は"  + (parametersUser[attack_index]+1));
		System.out.println("防御力は"  +( parametersUser[defence]+1));
		System.out.println("特攻は"  + (parametersUser[magic_attack]+1));
		System.out.println("特防は"  + (parametersUser[magic_defence]+1));
		/*終わり*/
		
		
		int enemy[][] = e.makeMatrix(enemy_size, parameter_size,enemy_rand_min,enemy_rand_max); //敵の情報を取得
		e.printMatrix(enemy, enemy_size, parameter_size); //敵の情報を仮に表示
		
		System.out.print("\n");
		

		int user[][] = e.makeMatrix(1,parameter_size,30,50);
		e.printMatrix(user,1,parameter_size);	

		

	System.out.println("\n");
	e.enemyName();
	


	}
}