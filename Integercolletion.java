import java.util.ArrayList;
import java.util.Iterator;
public class Integercolletion {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(21);
        number.add(45);
        number.add(5);
        number.add(8);
        Iterator<Integer> itr = number.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        for(int num: number){
            System.out.println(num);
        }
    }
}