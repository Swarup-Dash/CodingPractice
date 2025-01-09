public class MaxMeetingRoom {
    public static void main(String[] args) {
        int[][] time = {{0, 20},{0, 5},{5, 10}};

        int res = findMaxRoom(time);
        System.out.println(res);
        
    }
    static int findMaxRoom(int[][] time){
        if (time == null || time.length == 0) {
            return 0;
        }

        int maxRooms = 0;

        for (int i = 0; i < time.length; i++) {
            int currentRooms = 1; 
            for (int j = i + 1; j < time.length; j++) {
                if (!(time[i][1] <= time[j][0] || time[i][0] >= time[j][1])) {
                    currentRooms++; 
                }
            }
            maxRooms = Math.max(maxRooms, currentRooms);
        }

        return maxRooms;
    }
}
