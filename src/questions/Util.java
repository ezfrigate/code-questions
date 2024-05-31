package questions;

public class Util {
    public static void sort(int l, int h, int[] arr){
        if(l<h){
            int m = (l+h)/2;
            sort(l, m, arr);
            sort(m+1, h, arr);
            merge(l,m,h,arr);
        }
    }

    private static void merge(int l, int m, int h, int[] arr){
        int n1= m-l+1;
        int n2= h-m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for(int i=0; i<n2; i++){
            right[i] = arr[m+1+i];
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<m-l+1 && j< h-m){
            if(left[i] < right[j]){
                arr[l+k] = left[i];
                i++;
                k++;
            } else {
                arr[l+k] = right[j];
                j++;
                k++;
            }
        }

        while(i<m-l+1){
            arr[l+k] = left[i];
            i++;
            k++;
        }

        while(j<h-m){
            arr[l+k] = right[j];
            j++;
            k++;
        }
    }

    public static int search(int x, int[] arr){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(arr[m]==x) return m;
            if(arr[m] > x) l=m+1;
            else h=m-1;
        }
        return -1;
    }

    public static int nearestSearch(int x, int[] arr){
        int l = 0;
        int h = arr.length-1;
        int m = 0;
        while(l<=h){
            m = (l+h)/2;
            if(arr[m]==x) return m;
            if(arr[m] < x) l=m+1;
            else h=m-1;
        }
        return m;
    }
}
