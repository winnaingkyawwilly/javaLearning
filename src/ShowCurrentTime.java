public class ShowCurrentTime {
    public static void main(String[] args) {
        //Current Time in Millisecond
        long currentTime = System.currentTimeMillis();

        long totalSecond = currentTime/1000;
        long currentSecond = totalSecond%60;

        long totalMinute = totalSecond/60;
        long currentMinute = totalMinute%60;

        long totalHour = totalMinute/60;
        long currentHour = totalHour%24;

        System.out.println("The time in GMT 00 in hour minute second is " + currentHour + " " + currentMinute + " " +  currentSecond);

    }
}
