package enemy;
import java.util.*;


public class Enemy {

    public void enemyName(){
        Random kindOfEnemy=new Random();
        int noProMenber = kindOfEnemy.nextInt(4);
    
        if(noProMenber==0){
            System.out.print("りく");
        }
        if(noProMenber==1){
            System.out.print("きょんきょん");
        }
        if(noProMenber==2){
            System.out.print("ひびき");
        }
        if(noProMenber==3){
            System.out.print("かれん");
        }
        if(noProMenber==4){
            System.out.print("のぞみ");
		}
		System.out.println("が出現しました。");

		
		System.out.println("行動を選択せよ！");
		System.out.println("整数を入力してください。偶数で物理攻撃、奇数で魔法攻撃を行います。");
		Scanner action=new Scanner(System.in);
		int actionSelect=action.nextInt();
		if(actionSelect%2==0){
			System.out.println("あなたは力の限り暴力を振りかざした！");
		}if(actionSelect%2==1){
			System.out.println("あなたは魔法で攻撃した！");
		}else{
			System.out.println("整数を入力してください。");
		}

		action.close();
		  
	}
	
	


    /*
	(row)行(column)列の配列を行列で表示するメソッド
	引数１：int型配列
	引数２：行数
	引数３：列数
	戻り値：なし
	*/
	public void printMatrix(int[][] array, int row,int column) {
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		return;
    }
    
    /*
	行列をランダムに初期化するメソッド
	引数１：行数
	引数２：列数
	戻り値：int型2次元配列
	*/
	public int[][] makeMatrix(int row,int column,int rand_min,int rand_max){
		int[][] enemy=new int[row][column];
		/*列が敵の名前になります。
		行がそれぞれのパラメーターになります。*/
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				Random randomEnemy=new Random();
				enemy[i][j]=rand_min+randomEnemy.nextInt(rand_max-rand_min);
			}
		}

		return enemy;
	}
	
	//public int[] makeArray(int size, int rand_min, int rand_max){
		//int[] aray = 
	//}

    /*　作成中
    static int calcDamage(int[][] array,int player[][] int enemy_number){
		array[enemy_number][hitpoint_index] = array[enemy_number][hitpoint_index] - array[][];

		return 0;
	} 
	*/
    
}
