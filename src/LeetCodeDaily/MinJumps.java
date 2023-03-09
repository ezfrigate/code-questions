package LeetCodeDaily;

import java.util.*;

public class MinJumps {
    public int minJumps(int[] arr) {
        int steps=0;
        Map<Integer, List<Integer>> minimap = new HashMap<>();
        int n= arr.length;
        for(int i = 0; i<arr.length; i++){
            List<Integer> set;
            if(minimap.containsKey(arr[i])){
                set = minimap.get(arr[i]);
            } else {
                set = new ArrayList<>();
            }
            set.add(i);
            minimap.put(arr[i], set);
        }
        boolean[] vis =new boolean[n];
        vis[0]=true;
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int currentIndex=queue.poll();
                if(currentIndex==n-1)
                    return steps;
                List<Integer> jumptoindexes=minimap.get(arr[currentIndex]);
                jumptoindexes.add(currentIndex+1);
                jumptoindexes.add(currentIndex-1);
                for(int q:jumptoindexes){
                    if(q>=0 && q<n && !vis[q]){
                        vis[q]=true;
                        queue.add(q);
                    }
                }
                jumptoindexes.clear();
            }
            steps++;
        }
        return 0;
    }
}
