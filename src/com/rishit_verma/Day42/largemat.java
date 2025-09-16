package com.rishit_verma.Day42;

public class largemat {
    public static  void main(String args[]){
        int [][]mat= {{1,2,3},{2,3,4},{3,4,5}};
        int l=0;
        for(int i=0;i<3;i++){
            l=0;
            for(int j=0;j<3;j++){
                if(mat[i][j]>l){
                    l=mat[i][j];
                }
            }
            System.out.println("largest in row "+i+" is "+l);
        }
    }
}
