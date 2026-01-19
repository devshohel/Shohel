
package evidenceproblemsolve.logic;

import java.util.HashSet;
import java.util.Random;


public class UniqueRandomNumber {
    public static void main(String[] args) {
        Random ran = new Random();
        HashSet<Integer> set = new HashSet<>();
        
        while(set.size() < 10){
           int num = ran.nextInt(50)+1; // 1 to 50
           //int num = rand.nextInt(401) + 100; // 100 to 500
           set.add(num); // duplicate hole nije thekei bad dibe
        }
        
        System.out.println("Random numbers: ");
        for(int n : set){
            System.out.println(n);
        }
    }
}
