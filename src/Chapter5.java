import java.io.IOException;
import java.util.*;

    public class Chapter5 {
        public static void main(String[] args) throws Exception {
            taskList();
            taskSet();
            taskMap();
            taskPriorityQueue();
        }

        public static void taskList() {
            LinkedList<String> myList = new LinkedList();
            myList.add("dron");
            myList.addFirst("jedi");
            myList.addLast("jedi");
            System.out.println(myList);
        }

        public static void taskSet() {
           HashSet<String> myHSet = new HashSet();
           myHSet.add("dron");
           myHSet.add("galaxy");
           myHSet.add("jedi");
            for (String s : myHSet) {
              System.out.println(s);
            }
        }

        public static void taskMap() {
            HashMap<String, Integer> myHashMap = new HashMap();
            myHashMap.put("jedi", 15);
            myHashMap.put("galaxy", 144);
            myHashMap.put("dron", 10);
            System.out.println("Do we have jedi?" + myHashMap.containsKey("jedi"));
            System.out.println("How many drons we have?" + myHashMap.get("dron"));
            System.out.println(myHashMap);
        }

        public static void taskPriorityQueue() {
            PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();
            myPriorityQueue.add(1);
            myPriorityQueue.add(2);
            myPriorityQueue.add(3);
            for (int pq : myPriorityQueue) {
                System.out.println(pq);
            }
        }

    }
