package helpers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;


public class ReadDataFile {


    public String readJsonFile(String filePath, Object type, Object key) {
        String rootPath = System.getProperty("user.dir");
        String value = null;
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {

            Object obj = parser.parse(new FileReader(rootPath + filePath));
            jsonObject = (JSONObject) obj;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Map abc = ((Map) jsonObject.get(type));
        String temp;

        Iterator<Map.Entry> itr1 = abc.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            temp = pair.getKey().toString();
            if (temp.equals(key)) {
                value = pair.getValue().toString();
            }
        }
        return value;
    }

}
