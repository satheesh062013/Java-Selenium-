
public class TestClass2
{
	private String name;
	public void init_name()
	{
		TestClass cla = new TestClass();
		name=cla.settName("Pandian");
	}
	
	public String nameRet()
	{
		return name;
	}
}
