public class Rev {
    void reverse(String str) {
        if ((str.length() <= 1) || (str == null))
            System.out.print(str);
        else
        {
            System.out.print(str.charAt(str.length() - 1));
            reverse(str.substring(0,str.length() - 1));
    }
    }
    public static void main(String[] args) {
        String str="hello";
        Rev r=new Rev();
        r.reverse(str);
    }


}
