import java.util.Scanner;

public class leap {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("궁금한 년도를 입력하세요 : ");
       
        int iYear = scanner.nextInt();
       
       if(iYear % 4 == 0)
        	
            if(iYear%100==0)
            	
                if(iYear%400==0)                               	                	
                		PrintLeap();
       				       
                else
                	
                    PrintNotLeap();        
            else
            	
                PrintLeap();        
        else
        	
            PrintNotLeap();             
       BR();
        
    }
   
    public static void PrintLeap()
    
    {
        System.out.println("윤년이 맞습니다.");     
        
    }
    public static void PrintNotLeap()
    
    {
        System.out.println("윤년이 아닙니다.");
    }
    public static void BR()
    {
    	System.out.print("프로그램을 종료하겠습니다.");
    	System.exit(0);  	
   }   
}