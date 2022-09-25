package org.solid.SingleResponsibility;

import java.util.Map;

public class Converter {

    public String ConvertToCSV(Map<String,Integer> area){
        String json =null;
        for (Map.Entry<String,Integer> entry:area.entrySet()) {
            json =json +  entry.getKey() + ","  + entry.getValue() + "\n";
        }
        return json;
    }
}
