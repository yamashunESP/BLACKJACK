import java.util.Scanner;

/**
 * 
 */

/**
 * @author yamaguchishun
 *
 */
public class BlackJack {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str=null;
		//はじめに整数を2個受け取る
		
			int player_random1=11;
			int player_random2=11;
			
			{
				player_random1=(int)(Math.random()*11);
				player_random2=(int)(Math.random()*11);//0~11までの数値が出る乱数を取得
			}
			
			int player_score=player_random1+player_random2;//はじめに２枚受け取った時の合計値
			System.out.println("あなたの点数は"+player_random1+"と"+player_random2);
			
			if(player_score==21) {
				System.out.println("BlackJack!!");
				return;
			}
			if(player_score>21) {
				System.out.println("pig");
				return;
			}
				 //プレイヤーがhit,standの選択を行う
		        
		        String player_preference="hitかstand";
		        Scanner sc = new Scanner(System.in);
		        System.out.println(" hit or stand");
		        System.out.println(sc.next());
		        
		         player_preference = sc.nextLine();
		      // while文で16を超えるまでの条件を記入
					
					// 超えていない場合Math.random()から値を取得
					
					// while文を抜けてplayer_scoreを出力
					
		         int player_random= 11;
		         while(player_score<16) {
		        	 player_random  = (int)(Math.random()*11);
		         }
		         System.out.println("あなたの点数は"+player_score+player_random);
		         
		        	 
		        	 
		         
		         player_random  = (int)(Math.random()*11);
		         {
		       do {
		    	   player_score = player_score + player_random;
		            System.out.println("あなたのカードは"+player_random);
		            System.out.println("あなたの点数は "+player_score);
		       }while(player_score<=16);
		               
		       {
		            if(player_score>21)
		            {
		              str="Pig!!";
		                return;
		            }
		            else if(player_score==21)
		                {
		                   str="BlackJack!!";
		                    return;
		                }
		            
		            else if(player_score>=16) 
		            {
		           str="Stand!!";
		            player_preference = sc.nextLine();
		            return;
		         }
		        
		        
		            else if (player_score<=16)
		        {
		            str="Hit!!";
		            return;
		        }
		        }
		        }
	}	
}