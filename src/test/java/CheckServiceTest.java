import org.junit.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CheckServiceTest {

    private List<String> data;
    private int intData;

    @Before
    public void setUp() { // це я ініціалізую дані для мого тесту
        data = new ArrayList<String>();
        data.add("sahar"); // 0
        data.add("roma"); // 1
        data.add("roma");
        data.add("oleg"); //2
        data.add("oleg");

        intData = 2;
    }

    @Test
    public void testMyMainMethod() throws Exception {
        List<String> result = CheckService.myMainMethod(data, intData);
        assertNotNull(result); // перевірка чи результат не пустий
        assertEquals(4, result.size()); // перевіряє що розмір отриманого ліста 4
        assertTrue(result.contains("roma"));
        assertTrue(result.contains("oleg"));
        Set<String> set = new HashSet<String>(result);
        assertEquals(2, set.size());  // очікую що в set буде 2 (тобто 3 так як рахунок іду з 0 ) елементи
    }

    @Test(expected = Exception.class)
    public void testMyMainMethodWithFewDigitsInString() throws Exception {
        data.add("ivan123");
        data.add("ivan123");
        CheckService.myMainMethod(data, intData);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testMyMainMethodWithNegativeInputDataRepeats() throws Exception {
        CheckService.myMainMethod(data, -2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testMyMainMethodWithZeroInputDataRepeats() throws Exception {
        CheckService.myMainMethod(data, 0);
    }

    @Test(expected = Exception.class) //  бо тут я написав шо очікується ексершин
    public void testMyMainMethodOneWordWithDigitInString() throws Exception {
        data.add("Pasha1");
        CheckService.myMainMethod(data, 1); // очіку шо коли я буду викликати цей метод то буде ексепшин
    }

}
