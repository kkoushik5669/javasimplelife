import java.util.*;
public class lifeishard{
    public static void main(String[] args){
        makelifeissimple ms=new makelifeissimple();
        int a=ms.input(0);
        ms.print(a,true);
    }
}
class makelifeissimple{
    Scanner sc;
    makelifeissimple(){
        sc=new Scanner(System.in);
    }
    int input(int a){
        int x=sc.nextInt();
        return x;
    }
    String input (String a){
        String x=sc.next();
        return x;
    }
    double input (double a){
        double x=sc.nextDouble();
        return x;
    }
    void print(int a,boolean space){
        if(space)System.out.println(a);
        else System.out.print(a);
    }
    void print(String a,boolean space){
        if(space)System.out.print(a);
        else System.out.println(a);
    }
    void print(double a,boolean space){
        if(space )System.out.print(a);
        else System.out.println(a);
    }
    void print(long a,boolean space){
        if(space )System.out.print(a);
        else System.out.println(a);
    }
    void print(int[] a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void print(List<Integer>a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
    }
    
}
//abstract classes ,interfaces,polymorphism
