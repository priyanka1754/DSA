// Problem Statement:
// "Employees of a company are planning a trip for all its teams. 
// The company wants to use the minimum number of cars so that all eligible members can join.
// Teams with 2 or fewer members cannot participate and their cars are not counted. 
// Each eligible team provides a car with a given seat count, and all eligible members can be seated in any available car.
// Your task is to determine the minimum number of cars required, or return -1 
// if it is not possible for all eligible members to go on the trip."
// Input:N (number of teams)
//   Array A (number of members in each team)
//   Array C (number of seats in each team's car)
// Output:Minimum number of cars required for the trip, or -1 if it's not possible.

import java.util.*;
public class EconomicalTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] members = new int[n];
        int[] seats = new int[n];
        List<Integer> validSeats = new ArrayList<>();
        int totalMembers = 0;

        // Read members and filter eligible teams
        for (int i = 0; i < n; i++) {
            members[i] = sc.nextInt();
            if (members[i] > 2) {
                totalMembers += members[i];
            }
        }

        // Read seats and filter only eligible cars
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
            if (members[i] > 2) {
                validSeats.add(seats[i]);
            }
        }

        // If no eligible teams, return -1
        if (totalMembers == 0) {
            System.out.println(-1);
            return;
        }

        // Sort available seats descending
        Collections.sort(validSeats, Collections.reverseOrder());
        int carsUsed = 0;

        // Allocate seats greedily
        for (int seat : validSeats) {
            totalMembers -= seat;
            carsUsed++;
            if (totalMembers <= 0) break;
        }

        // If members remain, impossible
        if (totalMembers > 0)
            System.out.println(-1);
        else
            System.out.println(carsUsed);
    }
}
