package main.randomChallenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainStations {

    /*
    Given the arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits. We are given two arrays that represent the arrival and departure times of trains that stop.
    Examples:
    Input: arr[] = {9:10, 9:35, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:25, 12:00, 11:20, 11:30, 19:00, 20:00}
    Output: 3
    Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)
    Input: arr[] = {9:00, 9:40}, dep[] = {9:10, 12:00}
    Output: 1
    Explanation: Only one platform is needed.
     */
    public static void main(String[] args) {
        System.out.println(solution(new int[]{900, 940, 950, 1100, 1500, 1800},
                                    new int[] {910, 1200, 1120, 1130, 1900, 2000}));

        System.out.println(solution(new int[]{900, 940}, new int[] {910, 940}));
    }

    public static int solution(int arrivals[], int departures[]){
        List<Integer> usedIndexes = new ArrayList<>();
        List<Integer> minStationsList = new ArrayList<>();
        int minStations = 1;

        for(int indexArray = 0; indexArray < arrivals.length; indexArray++){
            for(int indexComparison = indexArray; indexComparison < arrivals.length; indexComparison++){

                if(arrivals[indexComparison] > arrivals[indexArray]
                        && arrivals[indexComparison] < departures[indexArray]
                        && !usedIndexes.contains(indexComparison)){
                    minStations++;
                    usedIndexes.add(indexComparison);
                }
                if(arrivals[indexComparison] > arrivals[indexArray]
                        && arrivals[indexComparison] > departures[indexArray]){
                    minStationsList.add(minStations);
                    minStations = 1;
                }
            }
        }

        return minStationsList.stream().sorted(Comparator.reverseOrder()).findFirst().get();
    }
}
