import java.util.Scanner;

public class ReaderScanner extends Reader 
{
	Scanner scanner;
	
	public void init()
	{
		scanner = new Scanner(System.in);
	}
	
	@Override
	void doRead() 
	{
		a = scanner.nextInt();
		b = scanner.nextInt();

	}

}
