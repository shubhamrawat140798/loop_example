/*
 Write a program to read words from the keyboard until the word done is entered. For each word except done, 
report whether its first character is equal to its last character. For the required loop, use 
awhile statementdo-while statement
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner=null;
        try{
            scanner = new Scanner(System.in);
            System.out.println("\nCompile by Shubham Singh Rawat");
            System.out.print("\nchoice: \n1. While \n2. Do While\n\nEnter your choice: ");
            int choice= scanner.nextInt();
            if(choice==1)
                WhileFunction();
            else if(choice==2)
                DoWhileFunction();
            else 
                System.out.println("Wrong Input");
        }
        finally{
            if(scanner!=null)
                scanner.close();
        }
        
    }

    static void WhileFunction(){
        Scanner scanner=null;
        try{
            scanner=new Scanner(System.in);
            String inputFromUser="";
            System.out.println("\nDo While Loop");
            while(!inputFromUser.equals("done")){
                System.out.print("\nEnter a String: ");
                inputFromUser =scanner.nextLine();
                if(!inputFromUser.equals("done")){
                    if(inputFromUser.charAt(0)==inputFromUser.charAt(inputFromUser.length()-1)){
                        System.out.println("First and last character of the string " + inputFromUser + " : is matched");
                    }
                    else
                    System.out.println("First and last character of the string " + inputFromUser + " : does not match");
                }
            }
        }
        finally{
            if(scanner!=null)
                scanner.close();
        }
        
    }

    static void DoWhileFunction(){
        Scanner scanner=null;
        try{
            scanner=new Scanner(System.in);
            String inputFromUser="";
            System.out.println("\nDo While Loop");
            do{
                System.out.print("\nEnter a String: ");
                inputFromUser =scanner.nextLine();
                if(!inputFromUser.equals("done")){
                    if(inputFromUser.charAt(0)==inputFromUser.charAt(inputFromUser.length()-1)){
                        System.out.println("First and last character of the string " + inputFromUser + " : is matched");
                    }
                    else
                    System.out.println("First and last character of the string " + inputFromUser + " : does not match");
                }
            }while(!inputFromUser.equals("done"));
        }
        finally{
            if(scanner!=null)
                scanner.close();
        }
    }
}
