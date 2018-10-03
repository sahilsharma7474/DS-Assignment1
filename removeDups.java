import java.util.*;
class removeDups
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		System.out.println("resultant string is: "+remove(str));
	}
	private static String remove(String input){
    if (input.length() <= 1) return input;
    if (input.charAt(0) == input.charAt(1))
        return remove(input.substring(1));
    else
        return input.charAt(0)+remove(input.substring(1));
	}
}