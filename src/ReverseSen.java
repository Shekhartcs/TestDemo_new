public class ReverseSen {
    public static void main(String[] args) {
        String str ="I am a java developer";
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(str);
        System.out.println(stringBuilder.reverse());

        //========
        String str1[]=new String[5];
        str1=  str.split(" ");

         for(String st:str1){
             revrse(st);
         }
    }
    private static void revrse(String st) {

           if(st.length()<=1 ||st==null){
               System.out.print(st);
               System.out.print(" ");

           }
           else {
               System.out.print(st.charAt(st.length()-1));
               revrse(st.substring(0,st.length()-1) );
           }

       }

    }

