import java.util.ArrayList;
import java.util.List;

/**
 * Created by KPS on 7/27/2020.
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Blue");
        stringList.add("Green");
        stringList.add("Gray");
        List<String> stringList2 = new ArrayList<>();
        stringList2.addAll(stringList);
        for (String s : stringList2){
            System.out.println(s);
        }
    }
}
