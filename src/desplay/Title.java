package desplay;

import character.Player;
import java.util.Scanner;


public class Title {



    public static void printTitle(Player player){
        Scanner scan=new java.util.Scanner(System.in);

        /*ここから導入*/
        System.out.println("\nランダム＆ドラゴンズの世界にようこそ！");

        System.out.println("あなたの名前は何ですか？");
        player.setName(scan.next());

        System.out.println(player.getName()+"さん");
        System.out.println("世界を救ってください");
        System.out.println("あなたのパラメータは以下のようになります。\n");
        player.printInf();

        /*ここまで導入*/

    }
}
