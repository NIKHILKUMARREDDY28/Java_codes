package Algorithms;

import java.util.Arrays;

public class MergeSort {
    static private void ms(int[] arr,int l,int r){
        if(l<r){
            int m = (l+r)/2;
            ms(arr,l,m);
            ms(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    static void merge(int[] a,int l,int m,int r){
        int a1 = m-l+1;
        int a2 = r-m;
        int[] arr1 = new int[a1];
        int[] arr2 = new int[a2];
        for(int i=0;i<a1;i++) arr1[i] = a[l+i];
        for(int j=0;j<a2;j++) arr2[j] = a[m+1+j];
        int lp = 0, rp =0;
        int mp = l;
        while(lp < a1 && rp < a2){
            if(arr1[lp] <= arr2[rp]){
                a[mp++] = arr1[lp++];
            }else{
                a[mp++] = arr2[rp++];
            }
        }
        while(lp < a1 ) a[mp++] = arr1[lp++];
        while (rp < a2) a[mp++] = arr2[rp++];
    }
    public static void main(String[] args) {
        int[] arr = {9,4,7,6,3,1,5};
        ms(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
