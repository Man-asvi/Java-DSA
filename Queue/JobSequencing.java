package Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class JobSequencing {
    static class Job {
        char job_id;
        int deadline;
        int profit;

        Job(char job_id, int deadline, int profit) {
            this.deadline = deadline;
            this.job_id = job_id;
            this.profit = profit;
        }
    }

    static void printJobScheduling(ArrayList<Job> arr) {
        int n = arr.size();

        // Sort jobs by deadline
        Collections.sort(arr, (a, b) -> a.deadline - b.deadline);

        ArrayList<Job> result = new ArrayList<>();
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a, b) -> b.profit - a.profit);

        for (int i = n - 1; i >= 0; i--) {
            int slot_available;
            if (i == 0) {
                slot_available = arr.get(i).deadline;
            } else {
                slot_available = arr.get(i).deadline - arr.get(i - 1).deadline;
            }

            maxHeap.add(arr.get(i));

            while (slot_available > 0 && !maxHeap.isEmpty()) {
                Job job = maxHeap.remove();
                result.add(job);
                slot_available--;
            }
        }

        // Sort result by deadline or any preferred order
        Collections.sort(result, (a, b) -> a.deadline - b.deadline);

        for (Job job : result) {
            System.out.print(job.job_id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));

        System.out.println("Following is maximum profit sequence of jobs:");
        printJobScheduling(arr);
    }
}
