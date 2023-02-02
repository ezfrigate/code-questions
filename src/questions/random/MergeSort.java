package questions.random;

public class MergeSort {

    public static void sort(int l, int r, int[] array){
        if(l<r){
            int m = (l+r)/2;
            sort(l,m, array);
            sort(m+1,r, array);
            merge(l, m, r, array);
        }
    }

    public static void merge(int l, int m, int r, int[] array){
        int i,j,k = l;
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (i = 0; i < n1; ++i)
            L[i] = array[l + i];
        for (j = 0; j < n2; ++j)
            R[j] = array[m + 1 + j];
        i=0;
        j=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            array[k] = L[i];
            i++;
            k++;
        }

        while(j<n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
