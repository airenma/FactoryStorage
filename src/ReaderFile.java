import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile extends Reader 
{
	BufferedReader bufferedReader;
	
	public void init (String filename)
	{
		
		try {
			FileReader fr = new FileReader(filename);
			bufferedReader = new BufferedReader(fr);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			bufferedReader = null;
		}
		
	}
	@Override
	void doRead() 
	{
		try {
			String line1 = bufferedReader.readLine();
			String line2 = bufferedReader.readLine();
			a = Integer.parseInt(line1);
			b = Integer.parseInt(line2);
		}catch (IOException e) {
			a = b = 0;
		}
	}

}
