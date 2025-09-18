package com.rishit_verma.Day43;
import java.util.*;
public class cacheee {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of cache ");
        int n=sc.nextInt();
        String[] cache = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("enter cache value for index "+i);
            cache[i]=sc.next();
        }
    }
}
