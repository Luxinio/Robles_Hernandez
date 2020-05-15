/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea15;
import java.util.Scanner;


public class Tarea15 
{
 
   public static void main(String args[])
   {
      System.out.println("Juego piedra-papel-tijera");
      Scanner teclado = new Scanner(System.in);
 
      int seleccionCompu = (int)(Math.random() * 3) + 1;
      System.out.println("La computadora ya escogio...");
 
      System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
      int seleccionUsuario = teclado.nextInt();
 
      System.out.print("La computadora habia escogido: ");
      switch ( seleccionCompu )
      {
         case 1:
            System.out.println("Piedra");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Empate!"); break;
               case 2: System.out.println("Usted gana!"); break;
               case 3: System.out.println("La computadora gana!"); break;
               default: System.out.println("Seleccion invalida >:v");
               
               
            }
            break;
 
         case 2:
            System.out.println("Papel");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("La computadora gana!"); break;
               case 2: System.out.println("Empate!"); break;
               case 3: System.out.println("Usted gana!"); break;
               default: System.out.println("Seleccion invalida >:v");
            }
            break;
 
         case 3:
            System.out.println("Tijera");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Usted gana!"); break;
               case 2: System.out.println("La computadora gana!"); break;
               case 3: System.out.println("Empate!"); break;
               default: System.out.println("Seleccion invalida >:v");
            }
            break;
      }
   }
}