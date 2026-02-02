import java.util.LinkedList;
public class LinkedListdemo {
    public static void main(String[] args) {
        LinkedList<String> customers = new LinkedList<>();
        customers.add("Rahul");
        customers.add("Anil");
        customers.add("Ankush");
        customers.add("Rashmi");
        customers.add("Honey");
        System.out.println("Customers:" + customers);

        customers.add(2 ,"Rahul");
        System.out.println("Customers:" + customers);

        String firstCustomer = customers.getFirst();
        System.out.println("First customer:" + firstCustomer);

        System.out.println("Last customer" + customers.getLast());

        //get any specifi index element
        System.out.println(customers.get(3));

        //set any element on any specific  index
        System.out.println(customers.set(1,"Ankith"));

        System.out.println(customers.removeFirst());
        System.out.println(customers.removeLast());

        //you can remove any specific element  by using remove method
        System.out.println(customers.remove("Ankush"));
        
    }
    
}
