package EjerciciosParaRefactorizar;
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduzca el n�mero de kil�metros recorrido: ");
		int km = sc.nextInt();
		System.out.println("�Es usted usuario VIP de la compa��a? Indique s�, con un 1 y 0 si es no: ");
		int vip = sc.nextInt();
		double iva = 0.21;
		int cuotafija = 200;
		double descuentovip = 0.05;
		
		
		
switch(vip) {
			
case 0 : 
if (km < 300) {
double precio = km * cuotafija;
double precioiva = precio * iva;
double preciototal= precio + precioiva;
System.out.println("Usted debe pagar por el alquiler del veh�culo: " + preciototal );
					} 
else if ( km >= 300 && km < 1000) {
double impuesto1 = 0.30;
double precio = (km - 300) * impuesto1;
double precioiva= precio * iva;
double preciototal= precio + precioiva;
System.out.println("Usted debe pagar por el alquiler del veh�culo: " + preciototal);
					}
else if ( km >= 1000) {
double impuesto2 = 0.15;
double precio = (km - 1000) * impuesto2;
double precioiva = precio * iva;
double preciototal= precio + precioiva;
System.out.println("Usted debe pagar por el alquiler del veh�culo: " + preciototal);}
break;
case 1 : 
if (km < 300) {
double precio = km * cuotafija;
double precioiva = precio * iva;
double preciovip = (precio + precioiva) * descuentovip;
double preciototal= precio + precioiva - preciovip;
System.out.println("Usted debe pagar por el alquiler del veh�culo: " + preciototal );} 
else if ( km >= 300 && km < 1000) {
double impuesto1 = 0.30;
double precio = (km - 300) * impuesto1;
double precioiva= precio * iva;
double preciovip = (precio + precioiva) * descuentovip;
double preciototal= precio + precioiva - preciovip;
System.out.println("Usted debe pagar por el alquiler del veh�culo: " + preciototal);
}
else if ( km >= 1000) {
double impuesto2 = 0.15;
double precio = (km - 1000) * impuesto2;
double precioiva = precio * iva;
double preciovip = (precio + precioiva) * descuentovip;
double preciototal= precio + precioiva - preciovip;
System.out.println("Usted debe pagar por el alquiler del veh�culo: " + preciototal);
}
break;
default : System.out.println("Introduzca 0 o 1 por favor");}
sc.close();	
}}
