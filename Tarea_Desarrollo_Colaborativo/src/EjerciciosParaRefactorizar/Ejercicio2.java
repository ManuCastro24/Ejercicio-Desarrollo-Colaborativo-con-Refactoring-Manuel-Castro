package EjerciciosParaRefactorizar;

import java.util.Scanner;

public class Ejercicio2 {
	
public static String numComprendidos(int n1, int n2) {
String numeroscomprendidos = ""; for (int i = n1; i<= n2; i++) { numeroscomprendidos = numeroscomprendidos + " " + i;
}return numeroscomprendidos;}
public static void main(String[] args) {
var sc = new Scanner(System.in);
System.out.println("Introduce un n�mero: ");
int primernumero = sc.nextInt();
System.out.println("Introduce un n�mero mayor al anterior: ");
int segundonumero = sc.nextInt();
if(segundonumero < primernumero){System.out.println("Error. Introduce un n�mero mayor al anterior: ");
segundonumero = sc.nextInt();
}System.out.println("Los n�meros comprendidos entre " + primernumero + "y" + segundonumero + " son " + numComprendidos(primernumero,segundonumero));
sc.close();
	}}



