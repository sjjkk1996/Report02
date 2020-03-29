import java.util.Scanner;

public class leap3 {

    public static void main(String[] args){
    	
   while(true) {
	   
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("궁금한 년도를 입력하세요 : ");
	   
	   int y = input.nextInt();
	   
	   if(y <=0) {
		   
		  System.out.println("프로그램을 종료하겠습니다.");
		  
		   System.exit(0);
	   }
	   if(y%4==0 && y% 100!=0 || y% 400== 0) {
		   
		   System.out.println(y + "년은 윤년이 맞습니다.");
		   
	   }
	   else {
		   
		   System.out.print(y+"년은 평년입니다.");
	   }
	   
   		}
    }
}
    
        