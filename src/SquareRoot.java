import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        double n=10;
        findSquare(n);
    }

    private static void findSquare(double n) {
        double i=1;
        boolean flag=false;
        while(!flag){
            if(i*i==n){
                flag=true;
                System.out.println("Square root of "+n +" is :" +i);

            }
            else if(i*i>n){
                double res= SquareOfRoot(n,i-1,i);
                System.out.printf(" %.5f ",res);
                flag=true;

            }
            i++;
        }

    }

    private static double SquareOfRoot(double x,double i,double j) {
        double mid=(i+j)/2;
        double mul=mid*mid;
        if(mul==x||Math.abs(mul-x)<.00001){
           return mid;

        }
        else if(mul<x){
            return SquareOfRoot(x,mid,j);
        }
        else
        {
            return SquareOfRoot(x,i,mid);
        }
    }

}
