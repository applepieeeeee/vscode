import java.util.*;

public class speeding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] road = new int[100];
        int[] bessie = new int[100];

        int n = s.nextInt();
        int m = s.nextInt();

        int currMile = 0;
        for (int i = 0; i < n; i++){
            int length = s.nextInt(); // length of segment
            int limit = s.nextInt(); // take in speed limit

            for (int j = 0; j < length; j++){
                road[currMile] = limit;
                currMile++;
            }
        }

        // same for bessie
        currMile = 0;
        for(int i = 0; i < m; i++){
            int length = s.nextInt();
            int bSpeed = s.nextInt();

            for(int j = 0; j < length; j++){
                bessie[currMile] = bSpeed;
                curMile++;
            }
        }
        s.close();

        int currMax = 0;
        // find max val
        for(int i = 0; i < bessie.length; i++){
            if(bessie[i] - road[i] > currMax){
                currMax = bessie[i] - road[i];
            }
        }
        System.out.print(currMax);
    }
}
