package lesson2;

public class Task4_print{
	public static void main(String[] args)
	{
		int a = 10;
		short bS = 12;
		long cL = 10000;
		double d = 9.00;
		float eF = 9.99F;
		char f = 'm';
		boolean g = true;
		
		int result1 = a + bS;
		double result2 = cL - d;
		double result3 = d * eF;
		System.out.print("result1: " +  result1);
		System.out.print(" result2: " +  result2);
		System.out.print(" result3: " + result3);
	
		if (cL > d)	
		{
		System.out.print(" result4: long > double");
		}
		else
		{
		System.out.print(" result4: long <= double");
		}
		
		if (eF < a)	
		{
		System.out.print(" result5: float < int");
		}
		else
		{
		System.out.print(" result5: float >= int");
		}	
		if (a == bS)	
		{
		System.out.print(" result6: a и b равны ");
		}
		else
		{
		System.out.print(" result6: a и b не равны");
		}		
	}
}

