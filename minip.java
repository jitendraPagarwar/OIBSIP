
//  number guessing game 
import java.util.*;

public class minip{

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int myNumber=(int) (Math.random()*100);
        int userNumber=0;

        do{
            System.out.println("guess number(1-100): ");
            userNumber=sc.nextInt();

            if(userNumber==myNumber){
                System.out.println("its.. correct number");
            }
            else if(userNumber>myNumber){
                System.out.println("your number is large");
            }
else{
    System.out.println("your number is small");
}

        }while (userNumber>=0);
        System.out.println("my number was: ");
        System.out.println(myNumber);
    }
}