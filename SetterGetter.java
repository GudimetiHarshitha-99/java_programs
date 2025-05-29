package module2_Strings;

public class SetterGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new Set();
		s.setName("abc");
		System.out.println(s.getName());
		s.setAge(34);
		System.out.println(s.getAge());

	}
}
class Set
{
	private String Name;
	private int age;
	public String getName()
	{
		return Name;
	}
	public void setName(String i)
	{
		this.Name=i;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
		this.age=a;
	}
}