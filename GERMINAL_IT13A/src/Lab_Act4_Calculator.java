/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author User
 */
public class Lab_Act4_Calculator {
    
       public static int add(int jum1,int jum2){
        return jum1 + jum2;
    }
    public static int sub(int jum1,int jum2){
        return jum1 - jum2;
    }
    public static int Mult(int jum1,int jum2){
        return jum1 * jum2;
    }
    public static int Div(int jum1,int jum2){
        return jum1 / jum2;
    }
    public static float per(float jum1,float jum2){
        return jum1 * (jum2/100);
        
    }
    
    public static void main(String[] args) {
        
        int result1 = add(5,5);
        System.out.println("Addition: " + result1);
        int result2 = sub(5,5);
        System.out.println("Subtraction: " + result2);
        int result3 = Mult(5,5);
        System.out.println("Multiplication: " + result3);
        int result4 = Div(5,5);
        System.out.println("Division: " + result4);
        float result5 = per(100,50);
        System.out.println("Percentage: " + result5 );
    }
    
}
