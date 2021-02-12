package main;
import character.*;
import battle.*;
import desplay.*;
import item.Equip;

import java.io.IOException;



public class Main{
	public static void main(String []args) throws IOException {

		Equip equip = new Equip();
		System.out.println(equip.name);

		Enemy hibiki = new Enemy();
		hibiki.setName("ひびき");
		hibiki.setSpeed(10);
		Player kyoichi = new Player();
		kyoichi.armor = equip;
		kyoichi.arms = equip;
		Title.printTitle(kyoichi);
		kyoichi.setSpeed(30);



		PrintBattle.runBattle(kyoichi,hibiki);
	}
	
}



	

