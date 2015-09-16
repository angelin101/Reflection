/**
 * Created by Ангелин on 15.09.2015.
 */


import java.lang.reflect.Field;
import java.util.Map;

public class CreateNewClass {

    public static Object getObject(String className, Map<String, Object> fields) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class classForName = Class.forName(className);
        Object obj = classForName.newInstance();
        Field[] publicFields = classForName.getFields();
        for(Field fillableFields : publicFields){
            for (Map.Entry entry : fields.entrySet()){
                if(fillableFields.getName().equals(entry.getKey())){
                    fillableFields.set(obj, entry.getValue());
                }
            }
        }
        return obj;
    }
}
