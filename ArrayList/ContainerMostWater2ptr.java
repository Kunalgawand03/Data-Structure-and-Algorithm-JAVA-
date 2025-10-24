package ArrayList;

public class ContainerMostWater2ptr {
    public static int storewater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));  // height is decided by shorter line
            int width = rp - lp;
            int currwater = ht * width;
            maxwater = Math.max(maxwater, currwater);         // update maxwater if current water is more
            // move the pointer pointing to shorter line towards center

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("max water that can be stored is = " + storewater(height));
    }
}

// Output: max water that can be stored is = 49
// Explanation: The code defines a method to calculate the maximum amount of water that can be contained between two lines represented by an ArrayList of heights.
// It uses a two-pointer technique to efficiently evaluate potential container boundaries, calculating the area formed by
// each pair and updating the maximum area found.
// The main method demonstrates the usage of this function with a sample list of heights and prints the
// result.
