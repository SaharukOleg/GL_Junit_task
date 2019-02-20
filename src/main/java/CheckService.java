import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckService {
    static List<String> myMainMethod(List<String> data, int intData) throws Exception {
        if (intData < 1) {
            throw new UnsupportedOperationException();
        }
        List<String> result = new ArrayList<String>(); // збереження всіх значень які будуть приходити
        Set<String> uniqueStrings = new HashSet<String>(data); // унікальні дані будуть зберігатись
        int counter;
        for (String x : uniqueStrings) {
            counter = 0;
            for (String inputData : data) {
                if (x.equals(inputData)) {
                    counter++;
                    counter++;
                    //System.out.println(x + " counter - :" + counter);
                }
            }
            if (counter == intData) {
                for (int i = 0; i < intData; i++) {
                    result.add(x);
                }
                System.out.println(x + " - word match acceptance and " + intData + "times. SUCCESS!!!!");
            } else {
                System.out.println(x + " doesn't match acceptance criteria. FAILURE!!!!");
            }
        }
        boolean containsDigit = false;
        for (String x : result) {
            if (checkIfContainsDigit(x)) {
                throw new Exception("Bingo!");
            }
        }

        return result;

    }

    private static boolean checkIfContainsDigit(String word) {
        return word.matches(".*\\d+.*");
    }
}