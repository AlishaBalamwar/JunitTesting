import java.util.Scanner;
public class tempconversion {
	double Celsius(double Farhenite)
	{
	return (Farhenite - 32)*5/9;	
	}
	double Farhenite(double Celsius)
	{
	return (Celsius * 9/5)+32;
	}
	public static void main(String[] args) {
	double Celsius;
	double Farhenite;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Type of Conversion 1.Farhenite to celsius 2.Celsius to Farhenite");
	int ch = s.nextInt();
	switch(ch) {
	case 1: System.out.println("Enter Temperature in Farhenite");
	Farhenite = s.nextDouble();
	tempconversion ftoc = new tempconversion();
	double result1=ftoc.Celsius(+Farhenite);
	System.out.println("Temperature in Celsius = " +result1);
	break;
	case 2: System.out.println("Enter Temperature in Celsius");
	Celsius = s.nextDouble();
	tempconversion ctof = new tempconversion();
	double result2 = ctof.Farhenite(+Celsius);
	System.out.println("Temperature in Farhenite= "+result2);
	break;
	default: System.out.println("Enter valid choice");
	}
	}
}
