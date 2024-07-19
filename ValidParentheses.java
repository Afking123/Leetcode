public class ValidParentheses {
    public static void main(String[] args) {
        String a="]";
        System.out.println(isValid(a));
    }
    public static boolean isValid(String s)
    {
        while(s.contains("()") || s.contains("[]") || s.contains("{}"))
        {
            s=s.replace("()","");
            s=s.replace("[]","");
            s=s.replace("{}","");
        }
        return s.isEmpty();
    }
}
