package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        if(a==b)
            return a;
        else if ( a<b)
            return gcd(a, b-a);
        else
            return gcd(a-b,b);
        }

    public static int fibonacci(int n) {
        int [] f =new int[n];
        f [0] =0;
        f [1] =1;
        if(n==0||n==1){
            return n;
        }
        else{
            f[0]=1;
            for(int i=2;i<n;i++){
                f[i]=f[i-1]+f[i-2];
            }
        }
        return f[n-1];

    }
    public static void main(String[] args){
        int a=69;
        int b=18;
        int n=5;
        System.out.println(gcd(a,b));
        System.out.println(fibonacci(n));
    }
}