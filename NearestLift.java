public class NearestLift {
    public static int nearestLift(int totalLift, int personPresent, int firstLift, int secondLift) {
        int nearLift = 0;

        int FirstLiftDist = firstLift - personPresent;
        int SecondLiftDist = secondLift - personPresent;

        if (FirstLiftDist < SecondLiftDist) {
            nearLift = firstLift;
        } else {
            nearLift = secondLift;
        }

        return nearLift;
    }

    public static void main(String[] args) {
        int totalLift = 5;
        int personPresent = 2;
        int firstLift = 5;
        int secondLift = 1;

        int res = nearestLift(totalLift, personPresent, firstLift, secondLift);
        System.out.println("Nearest Lift is"+" "+ res);
    }
}