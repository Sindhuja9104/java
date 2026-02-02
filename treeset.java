import java.util.TreeSet;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> highScores = new TreeSet<>();
        highScores.add(100);
        highScores.add(50);
        highScores.add(89);
        highScores.add(91);
        highScores.add(77);
        System.out.println(highScores);
        System.out.println(highScores.first());
        System.out.println(highScores.last());
        //method to see the less than any specific element
        System.out.println(highScores.headSet(91));
        //method to  see the greater than any specific element
        System.out.println(highScores.tailSet(91));

        }
    
}
