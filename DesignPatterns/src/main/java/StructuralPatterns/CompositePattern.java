package StructuralPatterns;
import java.util.*;
public class CompositePattern 
{
	private String name;
	private int rollno;
	private List<CompositePattern> team;
	public CompositePattern(String nam,int no)
	{
		name=nam;
		rollno=no;
		team=new ArrayList<CompositePattern>();
	}
	public void add(CompositePattern s)
	{
		team.add(s);
	}
	public List<CompositePattern> getTeam()
	{
		return team;
	}
	public String toString()
	{
		return ("Name:"+name+" "+"RollNo:"+rollno);
	}
}
