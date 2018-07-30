
public abstract class Factory {
	
	abstract Reader createReader();
	
	
	public static Factory create (String text)
	{
		if(text.equalsIgnoreCase("scanner"))
			{
				
				return new FactoryScanner();
			}
		
		if(text.equalsIgnoreCase("file"))
			{
				return new FactoryFile();
			}
		return null;
	}
}
