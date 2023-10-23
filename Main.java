public class Main {
    public static void main(String[] args) {
        
        Day today = Day.MONDAY;

        switch (today) {
            case SUNDAY:
                System.out.println("Family Time/Rest Day");
                break;
            case MONDAY:
                System.out.println("Working on school works");
                break;
            case TUESDAY:
                System.out.println("Studying for tommorrows report");
                break;
            case WEDNESDAY:
                System.out.println("Advance study in Major subjects");
                break;
            case THURSDAY:
                System.out.println("Advance study in Minor subjects  ");
                break;
            case FRIDAY:
                System.out.println("(Social Life) Connecting with friends");
                break;
            case SATURDAY:
                System.out.println("House Chores Day/Movie Marathon Day");
                break;
            default:
                System.out.println("Invalid day of the week.");
                break;
        }
    }
}
