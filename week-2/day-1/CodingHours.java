public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int CodingHours=17*5*6;
        System.out.println(CodingHours);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        double percentage = (17*5*6)/(52*17.)*100;
        System.out.println(percentage);
    }
}