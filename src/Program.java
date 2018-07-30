
public class Program {

	public static void main(String[] args) 
	{
//		Reader reader = Factory.create("scanner").createReader();
		Reader reader = Factory.create("file").createReader();
		
		reader.doRead();
		
		int a = reader.getA();
		int b = reader.getB();
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
		
		
		
	}

}
