package GreedyAlgo;
import java.util.*;

public class 1_ActivitySelection {
    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //End time based sorting
        int maxAct =0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if (start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max Activities: " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}

//Output:
//Max Activities: 4
//A0 A1 A3 A4
//Explanation: The selected activities are A0 (1-2), A1 (3-4), A3 (5-7), and A4 (8-9).
