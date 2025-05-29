package module2_Strings;
public class StringAddMethod {

	public static void main(String[] args) {
		String s1="<<<<>>>",s2="Hello",s3="",s4="";
		System.out.println(s1.length());
		int n=s1.length()/2;
		System.out.println(n);
		s3=s1.substring(0,n);
		s4=s1.substring(n,s1.length());
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3+s2+s4);
	}
}
