import java.util.Scanner;
public class TD3{
    public static void main(String[] args){
        //Exo_6();
        //Exo_6_3();
        //Exo_7_1();
        Exo_8_1();
    }

//////////////////////////////////////////////////////////////////////////////////////////////////

    public static void Exo_6(){ // Exercice 6.1 
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez la taille");
        n = in.nextInt();
        in.close();
        for (int row = 1; row <= n; ++row) {  // row = 1, 2, 3, ..., size
         // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= n; ++col) {  // col = 1, 2, 3, ..., size
                System.out.print    ("#");   // Use print() without newline inside the inner loop
            }
         // Print a newline after printing all the columns
        System.out.println();
        }       
    }

//////////////////////////////////////////////////////////////////////////////////////////////////

    public static void Exo_6_3(){ // Exercice 6.3
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez la taille");
        n = in.nextInt();
        in.close();
        System.out.print("   *");
        System.out.print(" |");
        for( int col2 = 1; col2 <=n; ++col2){
            System.out.printf("%4d", col2);
             
        }
        System.out.println(); 
        System.out.print("------");   
        for( int col3 = 1; col3 <=n; ++col3){
            System.out.print("----");
        }
        System.out.println();
              
        for (int row = 1; row <= n; ++row) {  // row = 1, 2, 3, ..., size
            System.out.printf("%4d", row);
            System.out.print(" |");
         // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= n; ++col) {  // col = 1, 2, 3, ..., size
                
                System.out.printf("%4d", col*row);   // Use print() without newline inside the inner loop
            }
         // Print a newline after printing all the columns
        
            System.out.println();
        }  
    }

//////////////////////////////////////////////////////////////////////////////////////////////////

    public static void Exo_7_1(){
    // Print factorial of n
        int n = 20;
        long factorial = 1;

    // n! = 1*2*3...*n
        for (int i = 1; i <= n; i++) {  // i = 1, 2, 3, ..., n
                factorial = factorial * i;   // *
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
   }

//////////////////////////////////////////////////////////////////////////////////////////////////

    public static void Exo_8_1(){
        String n;
        Scanner in = new Scanner(System.in);
        System.out.println("Entrez la chaine :");
        n = in.nextLine();
        for(int len = n.length()-1; len >= 0; --len){
            System.out.print(n.charAt(len));
        }
        in.close();       
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////