
public class FactoryScanner extends Factory {

	@Override
	Reader createReader() 
	{
		ReaderScanner reader = new ReaderScanner();
		reader.init();
		
		return reader;
	}

}
