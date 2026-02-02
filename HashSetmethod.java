import java.util.HashSet;
public class HashSetmethod {
    public static void main(String[] args) {
        HashSet<String> uniqueAttendees = new  HashSet<>();
        uniqueAttendees.add("Alice");
        uniqueAttendees.add("charlie");
        uniqueAttendees.add("Mani");
        uniqueAttendees.add("Rahul");
        System.out.println(uniqueAttendees);

        //size of the set
        System.out.println(uniqueAttendees.size());

        //contains
        System.out.println(uniqueAttendees.contains("Alice"));

        uniqueAttendees.remove("Charlie");
        System.out.println(uniqueAttendees);

        //for iterating over the set
        for(String name: uniqueAttendees){
            System.out.println(name);
        }
            //clar method  to clear the set
            uniqueAttendees.clear();
            System.out.println(uniqueAttendees);
        

    }
    
}
