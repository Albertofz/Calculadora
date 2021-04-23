import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int a=0, b=0, res=0;
		float a1=0, b2=0, res1=0;	
		
		String sele=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("SELECCIONE UNA OPCIÓN");
		System.out.println("1: SUMA");
		System.out.println("2: RESTA");
		System.out.println("3: MULTIPLICACION");       
		System.out.println("4: DIVISION");
		
		sele=tec.next();
		switch(sele) {
		
		case "1":
			
			System.out.println("HAZ SELECCIONADO SUMA\n");
			System.out.println("INGRESE EL PRIMER VALOR");
			a=tec.nextInt();
			System.out.println("INGRESE EL SEGUNDO VALOR");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
			
		
		case "2":
			
			System.out.println("HAZ SELECCIONADO RESTA\n");
			System.out.println("INGRESE EL PRIMER VALOR");
			a=tec.nextInt();
			System.out.println("INGRESE EL SEGUNDO VALOR");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
			
			
		case "3":

			System.out.println("HAZ SELECCIONADO MULTIPLICACION\n");
			System.out.println("INGRESE EL PRIMER VALOR");
			a=tec.nextInt();
			System.out.println("INGRESE EL SEGUNDO VALOR");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
			
		
		case "4":
			
			System.out.println("HAZ SELECCIONADO DIVISION\n");
			System.out.println("INGRESE EL PRIMER VALOR");
			a1=tec.nextFloat();
			System.out.println("INGRESE EL SEGUNDO VALOR");
			b2=tec.nextFloat();
			res1=a1/b2;
			System.out.println(a1+"/"+b2+"="+res1);
			break;
	
			
		default:
			System.out.println("ERROR, ESTA OPCION NO EXISTE");
			
		}

	}

}
