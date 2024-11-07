import java.util.ArrayList;
import java.util.Arrays;

public class DataFetch extends AData{
    private ArrayList<String> data = new ArrayList<>(Arrays.asList("Name1","name2"));

    ArrayList<String> getData() {
        return data;
    }
}
