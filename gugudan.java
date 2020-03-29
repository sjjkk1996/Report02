import java.util.Scanner; 


class gugudan

{
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("구하고싶은 단을 입력하세요 = ");
        
        int num = scanner.nextInt();
 
        for(int j = 1;j <= 9; j++){
            System.out.println(num + " x " + j + " = " + (num * j) + " ");
        }
 
     
    }
}