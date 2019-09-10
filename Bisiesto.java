import java.util.Scanner;

public class Bisiesto {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int year;
        System.out.println("Ingresa año");
        year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 !=0) || year % 400 ==0){
            
            System.out.println("True");
            
        }
        else{
            System.out.println("False");
        }
        }
    }
    
    