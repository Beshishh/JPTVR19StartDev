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
class Task1 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Задача 1 ------");
        System.out.println("Введите число градусов по Цельсию: ");
        double gCel = scanner.nextDouble();
        // решение задачи
        double gFar = (gCel * 9/5)+ 32;
        System.out.println("По Фарингейту это будет: " + gFar + "°F");
        System.out.println("----- конец задачи 1 ------");

        
    }
}
