/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class StartDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

       Task1 task1 = new Task1();
       
       Task2 task2 = new Task2();

       Task3 task3 = new Task3();

       Task4 task4 = new Task4();
       
       Task5 task5 = new Task5();
       
       Task6 task6 = new Task6();
       
       Task7 task7 = new Task7();
       
       Scanner scanner = new Scanner(System.in);
        boolean Loop = true;
        while(Loop){
            System.out.println("Выберите программу от 1 до 7, или введите 0, чтобы закончить работу.");
            int task = scanner.nextInt();
            switch (task){
                case 1:
                    task1.run();
                    break;
                case 2:
                    task2.run();
                    break;
                case 3:
                    task3.run();
                    break;
                case 4:
                    task4.run();
                    break;
                case 5:
                    task5.run();
                    break;
                case 6:
                    task6.run();
                    break;
                case 7:
                    task7.run();
                    break;
                default:
                    break;
                case 0:
                    Loop = false;
                    System.out.println("Завершение работы...");
                    break;
                    
            }
        }
    }
}
