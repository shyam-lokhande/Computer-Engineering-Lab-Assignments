import java.util.*;
class Item implements Comparable<Item>{
    int wt,val;

    public Item(int w,int v){
        wt=w;
        val=v;
    }

    public int compareTo(Item i){
        return i.val*wt-val*i.wt;
    }
}

public class A3{
    public static void main(String[] args){
        Item[] arr={new Item(10,60), new Item(40,40),new Item(20,100),new Item(30,120)};
        int w=50;
        System.out.println(fracKnapsack(arr,w));
    }

    public static double fracKnapsack(Item arr[],int weight){
        Arrays.sort(arr);
        double res=0.0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].wt<=weight){
                res+=arr[i].val;
                weight=weight-arr[i].wt;
            }
            else{
                res=res+arr[i].val*(double)weight/(double)arr[i].wt;
                break;
            }
        }
        return res;
    }
}

// Time Complexity = O(nlog(n))
