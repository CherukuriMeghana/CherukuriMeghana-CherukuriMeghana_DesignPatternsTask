package BehavioralPatterns;
public class IteratorPattern implements Iterator
{
	int num[]= {1,2,3,4,5,6,7,8,9,10};
	int index;
	public Boolean contains()
	{
		if(index<10)
			return true;
		else
			return false;
	}
	public int nextElement()
	{
		if(index<10)
			return num[index++];
		else
			return 0;
	}
}
