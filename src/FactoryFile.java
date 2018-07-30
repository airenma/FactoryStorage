
public class FactoryFile extends Factory {

	@Override
	Reader createReader() 
	{
		ReaderFile reader = new ReaderFile();
		reader.init("number.txt");
		return reader;
	}

}
