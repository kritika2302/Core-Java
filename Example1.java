import java.util.*;
public class Example1
{
    public static void main(String args[]){
        int num=20;
        int a=1;
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        
        ArrayList<Integer> obj = new ArrayList<Integer>();
        for(int i = 1;i<=x;i++){
            obj.add(num);
            num=num+10;
        }

        System.out.println("While Loop:");
        Iterator itr = obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Advanced For Loop:");
        for(int i:obj){
            System.out.println(i);
        }

        System.out.println("For Loop:");
        for(int i=0;i<x;i++){
            System.out.println(obj.get(i));
        }
    }
}