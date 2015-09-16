import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ангелин on 15.09.2015.
 */
public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args){
        String className = "People";
        People p1 = new People();
        People p2 = new People("Vova", 4, 25, 105);
        Map<String, Object> fields = new HashMap<>();
        fields.put("name", "Sveta");
        fields.put("age", 28);
        fields.put("weight", 65);
        fields.put("height", 175);
        System.out.println(p1);
        System.out.println(p2);
        try {

            p1 = (People) CreateNewClass.getObject(className, fields);

        } catch (ClassNotFoundException e) {
            LOG.error("Class "+className+" not found!", e);
        } catch (IllegalAccessException e) {
            LOG.error(e);
        } catch (InstantiationException e) {
            LOG.error(e);
        }
        System.out.println(p1);
        System.out.println(p2);
    }
}
