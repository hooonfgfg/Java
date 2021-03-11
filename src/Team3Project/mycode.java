package Team3Project;

import java.util.Scanner;

public class mycode {

	public static void main(String[] args) {
		
		//ê¸?ë²ˆí˜¸, ? œëª?, ?‚´?š©, ê¸??“´?´, ì¡°íšŒ?ˆ˜
		String[][] boardArray = new String[100][5];
		
		int listNum=0; //?˜„?ž¬ ëª©ë¡ ê°œìˆ˜
		boolean run=true;
		
		//ë©”ë‰´?„ ?ƒ
		while(run) {
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("1.	ëª©ë¡ | 2. ?ƒ?„±(Create) | 3. ?½ê¸?(Read) | 4. ?ˆ˜? •(Update) | 5.?‚­? œ(Delete) | 6.ì¢…ë£Œ");
			System.out.println("---------------------------------------------------------------------------------------------");
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("ë©”ë‰´?„ ?ƒ: ");
			String select = scanner.nextLine();
			
			//1.ëª©ë¡, 2.C, 3.R, 4.U, 5.D, 6.ì¢…ë£Œ
			if(Integer.parseInt(select)==1) { //LIST
				
				//ëª©ë¡ì¶œë ¥
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("ë²ˆí˜¸          ? œëª?                 ?‚´?š©                 ê¸??“´?´      ì¡°íšŒ?ˆ˜");
				System.out.println("----------------------------------------------------------------------------");
				for(int i=listNum-1;i>=0;i--) {
					if(boardArray[i][0]==null) {
						continue;
					}
					System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "
										+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
				}
				
			}else if(Integer.parseInt(select)==2) { //CREATE
				
				int nullLocation=listNum;
				for(int i=0;i<listNum;i++) {
					if(boardArray[i][0]==null) {
						nullLocation=i;
						break;
					}
				}
				boardArray[nullLocation][0] =  Integer.toString(listNum+1);
				System.out.print("? œëª?: ");
				boardArray[nullLocation][1] = scanner.nextLine();
				System.out.print("?‚´?š©: ");
				boardArray[nullLocation][2] = scanner.nextLine();
				System.out.print("ê¸??“´?´: ");
				boardArray[nullLocation][3] = scanner.nextLine();
				boardArray[nullLocation][4] = Integer.toString(0);
				
				//ëª©ë¡ì¶œë ¥
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("ë²ˆí˜¸          ? œëª?                 ?‚´?š©                 ê¸??“´?´      ì¡°íšŒ?ˆ˜");
				System.out.println("----------------------------------------------------------------------------");
				for(int i=listNum;i>=0;i--) {
					if(boardArray[i][0]==null) {
						continue;
					}
					System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "
										+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
				}
				listNum++;

			}else if(Integer.parseInt(select)==3) { //READ
				
				System.out.print("ë²ˆí˜¸: ");
				int readNum=Integer.parseInt(scanner.nextLine());
				int viewNum=Integer.parseInt(boardArray[readNum-1][4])+1;
				
				for(int i=0;i<listNum;i++) {
					if(Integer.parseInt(boardArray[i][0])==readNum) {
						boardArray[i][4]=Integer.toString(viewNum);
						System.out.println("? œëª?: "+boardArray[readNum-1][1]);
						System.out.println("?‚´?š©: "+boardArray[readNum-1][2]);
						System.out.println("ê¸??“´?´: "+boardArray[readNum-1][3]);
						System.out.println("ì¡°íšŒ?ˆ˜: "+boardArray[readNum-1][4]);
						break;
					}
				}
				
			}else if(Integer.parseInt(select)==4) { //UPDATE
				
				System.out.print("ë²ˆí˜¸: ");
				int updateNum=Integer.parseInt(scanner.nextLine());
				
				//? œëª? ?ˆ˜? •
				System.out.println("ê¸°ì¡´? œëª?: "+boardArray[updateNum-1][1]);
				System.out.print("?ˆ˜? •? œëª?: ");
				String updateTitle=scanner.nextLine();
				if(updateTitle.length()==0) { //?ž…? ¥X
					continue;
				}
				
				for(int i=0;i<listNum;i++) {
					if(Integer.parseInt(boardArray[i][0])==updateNum) {
						boardArray[i][1]=updateTitle;
						break;
					}
				}
				
				//?‚´?š© ?ˆ˜? •
				System.out.println("ê¸°ì¡´?‚´?š©: "+boardArray[updateNum-1][2]);
				System.out.print("?ˆ˜? •?‚´?š©: ");
				String updateContent=scanner.nextLine();
				if(updateContent.length()==0) { //?ž…? ¥X
					continue;
				}

				for(int i=0;i<listNum;i++) {
					if(Integer.parseInt(boardArray[i][0])==updateNum) {
						boardArray[i][2]=updateContent;
						break;
					}
				}
				
			}else if(Integer.parseInt(select)==5) { //DELETE
				
				System.out.print("ë²ˆí˜¸: ");
				int deleteNum=Integer.parseInt(scanner.nextLine());
				for(int i=0;i<listNum;i++) {
					if(Integer.parseInt(boardArray[i][0])==deleteNum) {
						for(int j=0;j<5;j++) {
							boardArray[i][j]=null;
						}
						break;
					}
				}
				
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("ë²ˆí˜¸         ? œëª?                 ?‚´?š©                 ê¸??“´?´      ì¡°íšŒ?ˆ˜");
				System.out.println("----------------------------------------------------------------------------");
				for(int i=listNum-1;i>=0;i--) {
					if(boardArray[i][0]==null) {
						continue;
					}
					System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "
										+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
				}
				
				
			}else if(Integer.parseInt(select)==6) { //END
				
				run=false;
				
			}
			
		}
		
		System.out.println("?”„ë¡œê·¸?ž¨ ì¢…ë£Œ");
		
	}

}
