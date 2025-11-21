//Activity Selection Problem - 2 (With Sorting)

package GreedyAlgo;
import java.util.*;

public class 2_ActivitySelection2 {
    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //Sorting based on end times
        int activities[][] = new int[start.length][2];
        for(int i=0; i<start.length; i++){
            activities[i][0] = start[i];
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function for sorting based on end time
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));   //***

        //end time based sorting
        int maxAct =0;
        ArrayList<Activity> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<activities.length; i++){
            if (activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities: " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A(" + ans.get(i).start + "-" + ans.get(i).end + ") ");
        }
        System.out.println();
    }
}

//Output:
//Max Activities: 4
//A(1-2) A(3-4) A(5-7) A(8-9)
