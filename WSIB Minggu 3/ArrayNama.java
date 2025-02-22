import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayNama {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ramadhan");
        list.add("Rahmatullah");

        for(String x : list) {
            System.out.println(x);
        }
    }
}