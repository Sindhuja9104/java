import java.util.Queue;
import java.util.ArrayList;

import java.util.LinkedList;
public class queue2{
    public static void main(String[] args) {
        Queue<String> employee = new LinkedList<>();
        employee.add("rohith");
        employee.add("rahul");
        employee.add("Ankush");
        System.out.println(employee);
        String topLevelElement =employee.peek();
        System.out.println(topLevelElement);
        employee.remove();
        System.out.println(employee);
        employee.poll();
        System.out.println(employee);
    }
}