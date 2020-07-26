package CreationalPatterns;
public class SingletonPattern 
{
	public static SingletonPattern obj=new SingletonPattern();
	private SingletonPattern() {}
	public static SingletonPattern get()
	{
		return obj;
	}
	public String show()
	{
		return "hi...it is Singleton";
	}
}
