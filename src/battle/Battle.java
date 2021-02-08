package battle;
import java.util.*;

public class Battle {
    public void printTitle(){
        Scanner scan=new java.util.Scanner(System.in);
	
		/*ここから導入*/
		System.out.println("\nランダム＆ドラゴンズの世界にようこそ！");
		
		System.out.println("あなたの名前は何ですか？");
		String userName=scan.next();
		System.out.println(userName+"さん");
		System.out.println("世界を救ってください");
		System.out.println("あなたのパラメータは以下のようになります。\n");
        /*ここまで導入*/
        
        scan.close();
    }
}
