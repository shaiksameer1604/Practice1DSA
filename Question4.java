import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        n2.add(0);
        for (int i=0;i<n;i++){
            int d =s.nextInt();
            arr.add(d);
            for(int j=0;j<d;j++){
                arr.add(s.nextInt());
            }
            n2.add(arr.size());
        }
        int q = s.nextInt();
        for(int i=0;i<q;i++){
            n2.add(s.nextInt());
            n2.add(s.nextInt());
            if(arr.get((n2.get(n2.get(n2.size()-2)-1)))==0 || (n2.get(n2.get(n2.size()-2))-n2.get(n2.get(n2.size()-2)-1)) <= n2.get(n2.size()-1) ){
                System.out.println("ERROR!");
            }else{
            System.out.println( arr.get( (n2.get(n2.get(n2.size()-2)-1)) + n2.get(n2.size()-1) ));}
            n2.remove(n2.size()-1);
            n2.remove(n2.size()-1);
            
        }
        
     
    }
}