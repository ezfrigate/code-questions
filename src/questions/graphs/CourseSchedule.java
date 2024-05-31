package questions.graphs;

import java.util.*;

/**
 * <div class="_1l1MA"><p>There are a total of <code>numCourses</code> courses you have to take, labeled from <code>0</code> to <code>numCourses - 1</code>. You are given an array <code>prerequisites</code> where <code>prerequisites[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that you <strong>must</strong> take course <code>b<sub>i</sub></code> first if you want to take course <code>a<sub>i</sub></code>.</p>
 *
 * <ul>
 * 	<li>For example, the pair <code>[0, 1]</code>, indicates that to take course <code>0</code> you have to first take course <code>1</code>.</li>
 * </ul>
 *
 * <p>Return <code>true</code> if you can finish all courses. Otherwise, return <code>false</code>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> numCourses = 2, prerequisites = [[1,0]]
 * <strong>Output:</strong> true
 * <strong>Explanation:</strong> There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> numCourses = 2, prerequisites = [[1,0],[0,1]]
 * <strong>Output:</strong> false
 * <strong>Explanation:</strong> There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= numCourses &lt;= 2000</code></li>
 * 	<li><code>0 &lt;= prerequisites.length &lt;= 5000</code></li>
 * 	<li><code>prerequisites[i].length == 2</code></li>
 * 	<li><code>0 &lt;= a<sub>i</sub>, b<sub>i</sub> &lt; numCourses</code></li>
 * 	<li>All the pairs prerequisites[i] are <strong>unique</strong>.</li>
 * </ul>
 * </div>
 */
public class CourseSchedule {
    class Node{
        int val;
        int level;
        Set<Integer> comesFrom;
        List<Integer> goesTo;
        Node(int val){
            this.val = val;
            this.level = -1;
            this.comesFrom = new HashSet<>();
            this.goesTo = new ArrayList<>();
        }
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Node[] graph = new Node[numCourses];
        for(int i=0; i<numCourses; i++){
            graph[i] = new Node(i);
        }
        for(int i=0; i<prerequisites.length;i++){
            graph[prerequisites[i][0]].comesFrom.add(prerequisites[i][1]);
            graph[prerequisites[i][1]].goesTo.add(prerequisites[i][0]);
        }
        Queue<Node> bfsQ = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(graph[i].comesFrom.isEmpty()){
                graph[i].level = 0;
                bfsQ.add(graph[i]);
            }
            if(graph[i].comesFrom.contains(i) || graph[i].goesTo.contains(i)){
                return false;
            }
        }
        if(bfsQ.isEmpty()) return false;
        else {
            return bfs(bfsQ, graph, new HashSet<>());
        }
    }

    private boolean bfs(Queue<Node> bfsQ, Node[] graph, Set<Integer> visited){
        Node currentNode = bfsQ.poll();
        if(!visited.contains(currentNode.val)) {
            visited.add(currentNode.val);
            for (int i = 0; i < currentNode.goesTo.size(); i++) {
                if (graph[currentNode.goesTo.get(i)].level < currentNode.level && graph[currentNode.goesTo.get(i)].level != -1) {
                    return false;
                } else {
                    graph[currentNode.goesTo.get(i)].level = currentNode.level + 1;
                    bfsQ.add(graph[currentNode.goesTo.get(i)]);
                }
            }
        }
        if(bfsQ.isEmpty()) return visited.size()==graph.length;
        else return bfs(bfsQ, graph, visited);
    }
}
