class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {   
            int temp = start;
            start = destination;
            destination = temp;
        }

        int count = 0;
        for (int i = start; i < destination; i++) {
            count += distance[i];   
        }

        int vlaues = 0;
        for (int j = 0; j < start; j++) {
            vlaues += distance[j];
        }
        for (int j = destination; j < distance.length; j++) {
            vlaues += distance[j]; 
        }

        if (count < vlaues) {
            return count;
        } else {
            return vlaues;
        }
    }
}
