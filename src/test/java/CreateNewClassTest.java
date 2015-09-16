import org.junit.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Ангелин on 15.09.2015.
 */
public class CreateNewClassTest {

    People p1;
    People p2;
    People p3;
    
    @Before
    public void setUp() throws Exception {
        p1 = new People();
        p2 = new People("Vova", 4, 25, 105);
    }

    @After
    public void tearDown() throws Exception {
        p1 = null;
        p2 = null;
        p3 = null;
    }

    @Test
    public void testGetObject() throws Exception {
        p3 = new People("Sveta", 29, 65, 175);
        Map<String, Object> fields = new HashMap<>();
        fields.put("name", "Sveta");
        fields.put("age", 29);
        fields.put("weight", 65);
        fields.put("height", 175);
        People p4 = (People) CreateNewClass.getObject("People", fields);
        assertEquals(p3, p4);
    }
}