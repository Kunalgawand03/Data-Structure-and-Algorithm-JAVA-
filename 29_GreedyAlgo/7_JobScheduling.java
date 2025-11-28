import java.lang.reflect.Array;
import java.util.Collection;

package 29_GreedyAlgo;

public class 7_JobScheduling {
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String args[]) {
        int jobsInfo[][]= {{4,20} , {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i< jobsInfo.length; i++){     //add jobs to list
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        //Sorting jobs based on profit in descending order
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);  //***

        ArrayList<Integer> scheduledJobs = new ArrayList<>();
        int time = 0;

        for(int i=0; i< jobs.size(); i++){
            Job currJob = jobs.get(i);
            if(time < currJob.deadline){
                scheduledJobs.add(currJob.id);
                time++;
            }
        }

        System.out.println("Scheduled Jobs IDs: " + scheduledJobs);
        for(int i=0; i< scheduledJobs.size(); i++){
            System.out.print("J" + scheduledJobs.get(i) + " ");
        }
    }
}

//Output:
//Scheduled Jobs IDs: [2, 3, 0]
//J2 J3 J0
//Explanation: The selected jobs are J2 (profit 40), J3 (profit 30), and J0 (profit 20) within their deadlines.
// Note: Job J1 is not selected as it has lower profit and cannot fit within the deadlines of other jobs.
