package org.example;


public class Main {
    public static void main(String[] args) {
        //Declarar variables
        int var1;
        int var2;


        //Inicializando variables
        var1 = 1;
        var2 = 7;

        if(var1 == var2){
            System.out.println("Var1 es igual a Var2");
        } else {
            System.out.println("Var1 es diferente a Var2");
        }
        example_interfaz exp =new example_interfaz();
        exp.fn1();
        exp.abc();
        //Mostar resultado
        /*System.out.println("Var1 es igual a Var2");
        System.out.println(var1 == var2);

        System.out.println("Var1 es diferente a Var2");
        System.out.println(var1 != var2);

        System.out.println("Var1 es menor a Var2");
        System.out.println(var1 < var2);

        System.out.println("Var1 es mayor a Var2");
        System.out.println(var1 > var2);

        //&&
        if (var1 != var2 && var1 > var2){
            System.out.println("Var1 es diferente y mayor a Var2");
        } else {
            System.out.println("No cumple la condicion");
        }

        //||
        if (var1 != var2 || var1 > var2){
            System.out.println("Var1 es diferente o mayor a Var2");
        } else {
            System.out.println("No cumple la condicion");
        }*/


    }
}