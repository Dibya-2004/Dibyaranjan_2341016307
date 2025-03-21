package polimorphism;
class TimeConverter {

    public double convert(double seconds) {
        return seconds / 60;
    }
    public double convert(int minutes) {
        return minutes / 60.0; 
    }
    public float convert(long hours) {
        return hours / 24.0f; 
    }
}
public class Q3 {

	public static void main(String[] args) {
        TimeConverter converter = new TimeConverter();

        
        double seconds = 120; 
        double minutes = converter.convert(seconds);
        System.out.println(seconds + " seconds is " + minutes + " minutes.");

        int minutesInput = 120; 
        double hours = converter.convert(minutesInput);
        System.out.println(minutesInput + " minutes is " + hours + " hours.");

        long hoursInput = 48; 
        double days = converter.convert(hoursInput);
        System.out.println(hoursInput + " hours is " + days + " days.");
    }
}
