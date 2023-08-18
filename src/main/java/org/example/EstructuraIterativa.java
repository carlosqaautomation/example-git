package org.example;

public class EstructuraIterativa {
    public static void main(String[] args) {
       /* for (int i = 0; i < 10; i++) {
            System.out.println("i es igual: " + i);
        }*/


        int var1 = 0;
        int var2 = 10;

        /*while (var1 == var2 || var1<var2){
            System.out.println("var 1 es: " + var1 + "var2 es: "+var2);
            var1++;
            var2--;
        }*/
        String abc;

        abc = "En valor de var1: ";

        /*do{
            System.out.println(abc + var1) ;
            var1++;
        } while(var1<10);


        System.out.println(abc.substring(3,10)) ;*/


        int arreglo[] = new int[5];
        System.out.println("Tamaño del arreglo");
        System.out.println(arreglo.length);

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+5;
            System.out.println("valor indice");
            System.out.println(i);
            System.out.println(arreglo[i]);
        }

    }
}
