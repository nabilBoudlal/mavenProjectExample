package org.example;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonCreator {

public void jsonCreateFile() {
    JSONObject jsonObject = new JSONObject();

    jsonObject.put("Name", "Nabil");
    jsonObject.put("Age", "23");
    jsonObject.put("City", "Fermo");

    try {
        FileWriter file = new FileWriter("C:\\Users\\nabil\\OneDrive\\Desktop\\jsonExample.json");
        file.write(jsonObject.toJSONString());
        file.close();

    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    System.out.println("JSON file created: "+jsonObject);


}

}
