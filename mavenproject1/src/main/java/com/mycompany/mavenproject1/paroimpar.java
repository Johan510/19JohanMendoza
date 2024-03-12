/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author jopoh
 */
public class paroimpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("el numero ingresado es impar");
        }
        sc.close();
        }
    }
