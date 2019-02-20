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
        data.add("sahar");
        data.add("roma");
        data.add("roma");
        data.add("oleg");
        data.add("oleg");

        // intData = 2;
    }

    @Test
    public void testMyMainMethod() {
        List<String> result = CheckService.myMainMethod(data, intData);
        assertNotNull(result);
        assertEquals(4, result.size()); // перевіряє що розмір отриманого ліста 4
        assertTrue(result.contains("roma"));
        assertTrue(result.contains("oleg"));
        Set<String> set = new HashSet<String>(result);
        assertEquals(2, set.size());
    }

    @Test(expected = Exception.class)
    public void testMyMainMethodWithFewDigitsInString() {
        data.add("ivan1234");
        data.add("ivan1234");
        CheckService.myMainMethod(data, intData);
    }


}
