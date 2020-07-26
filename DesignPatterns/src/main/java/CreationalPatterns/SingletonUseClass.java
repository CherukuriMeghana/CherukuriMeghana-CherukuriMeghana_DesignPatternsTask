package CreationalPatterns;
public class SingletonUseClass {

	public static void main(String[] args) 
	{
		SingletonPattern singleObject=SingletonPattern.get();
		System.out.print(singleObject.show());
	}
}
