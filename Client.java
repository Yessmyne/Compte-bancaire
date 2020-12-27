
package javaapplication2;
import java.io.*;
import java.rmi.Naming;
import java.rmi.*;
import java.util.Scanner;
class Client
{
public static void main (String [] args)
{
 Scanner myObj = new Scanner(System.in);  
    System.out.println("operation et valeur:");

    String oper = myObj.nextLine(); 
    String val1 = myObj.nextLine(); 
    int operation=Integer.parseInt(oper);
    double val2=Double.parseDouble(val1);
    

 try {
    MyInterface cpt= (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server"); 

 if (operation==1) 
     cpt.crediter(val2);
 else if (operation ==2) 
     cpt.debiter(val2);
 else 
     System.out.println ("Votre solde = " +cpt.lire_solde());
 


 }catch (Exception e) {
    System.out.println("Erreur d'acces a un objet distant");
    System.out.println(e.toString());
 }
 }}
