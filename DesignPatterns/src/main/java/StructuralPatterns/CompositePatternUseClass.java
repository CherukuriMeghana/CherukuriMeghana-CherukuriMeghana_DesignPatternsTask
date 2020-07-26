package StructuralPatterns;
public class CompositePatternUseClass
{

	public static void main(String[] args)
	{
		CompositePattern Fteam=new CompositePattern("Meghana",25);
		CompositePattern Steam=new CompositePattern("Ruchitha",2);
		CompositePattern Fmem1=new CompositePattern("Anvila",1);
		CompositePattern Fmem2=new CompositePattern("Vani",7);
		CompositePattern Fmem3=new CompositePattern("Anusha",21);
		CompositePattern Smem1=new CompositePattern("Bhavani",22);
		CompositePattern Smem2=new CompositePattern("Vinitha",67);
		CompositePattern Smem3=new CompositePattern("Bhargavi",23);
		Fteam.add(Fmem1);
		Fteam.add(Fmem2);
		Fteam.add(Fmem3);
		Fteam.add(Steam);
		Steam.add(Smem1);
		Steam.add(Smem2);
		Steam.add(Smem3);
		System.out.println(Fteam);
		for(CompositePattern list:Fteam.getTeam())
		{
			System.out.println(list);
			for(CompositePattern list2:list.getTeam())
				System.out.println(list2);
		}
	}
}
