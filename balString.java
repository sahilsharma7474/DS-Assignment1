import java.util.*;
class balString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the expression: ");
        String str=sc.nextLine();
        System.out.println(isBal(str));
    }
    public static boolean isBal(String str)
{
    if (str.isEmpty()) {
        return true;
    }
    else if (str.charAt(0) == '(') {
        return str.charAt(str.length() - 1) == ')'
            && isBal(str.substring(1, str.length()));
    }
    else if (str.charAt(0) == '[') {
        return str.charAt(str.length() -  1) == ']'
            && isBal(str.substring(1, str.length()));
    }
    else if (str.charAt(0) == '{') {
        return str.charAt(str.length() - 1) == '}'
            && isBal(str.substring(1, str.length()));
    }
    else {
        return true;
    }
}
}