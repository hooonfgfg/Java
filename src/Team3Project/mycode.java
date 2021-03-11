package Team3Project;

import java.util.Scanner;

public class mycode {

	public static void main(String[] args) {
		
		//�?번호, ?���?, ?��?��, �??��?��, 조회?��
		String[][] boardArray = new String[100][5];
		
		int listNum=0; //?��?�� 목록 개수
		boolean run=true;
		
		//메뉴?��?��
		while(run) {
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("1.	목록 | 2. ?��?��(Create) | 3. ?���?(Read) | 4. ?��?��(Update) | 5.?��?��(Delete) | 6.종료");
			System.out.println("---------------------------------------------------------------------------------------------");
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("메뉴?��?��: ");
			String select = scanner.nextLine();
			
			//1.목록, 2.C, 3.R, 4.U, 5.D, 6.종료
			if(Integer.parseInt(select)==1) { //LIST
				
				//목록출력
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("번호          ?���?                 ?��?��                 �??��?��      조회?��");
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
				System.out.print("?���?: ");
				boardArray[nullLocation][1] = scanner.nextLine();
				System.out.print("?��?��: ");
				boardArray[nullLocation][2] = scanner.nextLine();
				System.out.print("�??��?��: ");
				boardArray[nullLocation][3] = scanner.nextLine();
				boardArray[nullLocation][4] = Integer.toString(0);
				
				//목록출력
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("번호          ?���?                 ?��?��                 �??��?��      조회?��");
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
				
				System.out.print("번호: ");
				int readNum=Integer.parseInt(scanner.nextLine());
				int viewNum=Integer.parseInt(boardArray[readNum-1][4])+1;
				
				for(int i=0;i<listNum;i++) {
					if(Integer.parseInt(boardArray[i][0])==readNum) {
						boardArray[i][4]=Integer.toString(viewNum);
						System.out.println("?���?: "+boardArray[readNum-1][1]);
						System.out.println("?��?��: "+boardArray[readNum-1][2]);
						System.out.println("�??��?��: "+boardArray[readNum-1][3]);
						System.out.println("조회?��: "+boardArray[readNum-1][4]);
						break;
					}
				}
				
			}else if(Integer.parseInt(select)==4) { //UPDATE
				
				System.out.print("번호: ");
				int updateNum=Integer.parseInt(scanner.nextLine());
				
				//?���? ?��?��
				System.out.println("기존?���?: "+boardArray[updateNum-1][1]);
				System.out.print("?��?��?���?: ");
				String updateTitle=scanner.nextLine();
				if(updateTitle.length()==0) { //?��?��X
					continue;
				}
				
				for(int i=0;i<listNum;i++) {
					if(Integer.parseInt(boardArray[i][0])==updateNum) {
						boardArray[i][1]=updateTitle;
						break;
					}
				}
				
				//?��?�� ?��?��
				System.out.println("기존?��?��: "+boardArray[updateNum-1][2]);
				System.out.print("?��?��?��?��: ");
				String updateContent=scanner.nextLine();
				if(updateContent.length()==0) { //?��?��X
					continue;
				}

				for(int i=0;i<listNum;i++) {
					if(Integer.parseInt(boardArray[i][0])==updateNum) {
						boardArray[i][2]=updateContent;
						break;
					}
				}
				
			}else if(Integer.parseInt(select)==5) { //DELETE
				
				System.out.print("번호: ");
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
				System.out.println("번호         ?���?                 ?��?��                 �??��?��      조회?��");
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
		
		System.out.println("?��로그?�� 종료");
		
	}

}
