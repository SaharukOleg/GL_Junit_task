import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> inputData = new ArrayList<String>();

        inputData.add("dog");
        inputData.add("cat");
        inputData.add("dog");
        inputData.add("dog");
        inputData.add("cat");
        inputData.add("bird");
        inputData.add("oleg");
        inputData.add("oleg");
        inputData.add("oleg");
        inputData.add("oleg");

        List<String> res = CheckService.myMainMethod(inputData, 2);

        for (String x : res) {
            System.out.println(x);
        }
    }
}
