package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        method1();

        System.out.println("End of program!!!!!!!!!!!!!!!!!!!");

    }

    public static void method1(){
        System.out.println("*****METHOD1 START*****");
        method2();

        System.out.println("*****METHOD1 END*****");
    }

    public static void method2(){
        System.out.println("*****METHOD2 START*****");
        Scanner sc = new Scanner(System.in);
        
        try{ //Aonde pode aver uma exeção 
            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){//se acontecer a exceção. A letra "e" é só um apelido
            System.out.println("Invalide position");
            e.printStackTrace();// VAI IMPRIMIR NA TELA O RASTREAMENTO DO STACK;
            sc.next();
        }

        catch(InputMismatchException e){
            System.out.println("Input error");
        }
        System.out.println("*****METHOD2 END*****");
        sc.close();
    }
}
