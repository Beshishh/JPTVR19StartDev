/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author user
 */
public class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int myArr[][] = new int[10][];
        for(int i = 0; i < 10; i++){
            myArr[i]=new int[i+5];
        }
        for(int i = 0; i < 10; i++){
            for(int j=0 ; j < myArr[i].length; j++){
                myArr[i][j] = random.nextInt(19-0+1)-0;
                System.out.print ("["+ myArr[i][j]+ "]");
            }
            System.out.println();
        }
        System.out.println("----- конец задачи 6 ------");
    }
}

