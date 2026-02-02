import java.util.LinkedHashSet;
public class LinkedSet {
    public static void main(String[] args) {
        LinkedHashSet<String> uniqueAttendees = new  LinkedHashSet<>();
        uniqueAttendees.add("Alice");
        uniqueAttendees.add("John");
        uniqueAttendees.add("Charlie");
        uniqueAttendees.add("rohit");
        uniqueAttendees.add("Alice");
        uniqueAttendees.add("Alice");
        System.out.println(uniqueAttendees);
        
        

            }
    
}


    

