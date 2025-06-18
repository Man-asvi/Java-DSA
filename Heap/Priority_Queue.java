package Heap;
import java.util.*;

public class Priority_Queue {

    static class Student implements Comparable<Student> { //overriding
        String Name;
        int Rank;

        public Student(String Name, int Rank) {
            this.Name = Name;
            this.Rank = Rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.Rank - s2.Rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(4);
        // pq.add(3);
        // pq.add(1);
        // pq.add(7);

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 3));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 7));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().Name + " -> " + pq.peek().Rank);
            pq.remove();
        }
    }
}
