
public class TestClass3 extends TestClass2
{

	
	public static void main(String[] args) 
	{
		TestClass2 cla2 = new TestClass2();
		cla2.init_name();
		TestClass cla = new TestClass();
		String name=cla.getName();
		System.out.println(name);
	}

}
