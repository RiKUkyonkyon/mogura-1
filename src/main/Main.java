package main;
//import java.util.*;
//import static constants.Constants.*;
import character.*;
import battle.*;

public class Main{
	public static void main(String []args){

		
		Enemy hibiki = new Enemy();
	
		Battle title = new Battle();
		Player kyoichi = title.printTitle();
		kyoichi.printInf();
		Battle.performBattle(kyoichi, hibiki);


	}
	
}

	

