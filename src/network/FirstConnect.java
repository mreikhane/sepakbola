package network;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.responmodel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstConnect {
    public responmodel getdata(String x) throws IOException {
        String filename = "C:\\Users\\REIKHAN\\IdeaProjects\\tugas3\\src\\brazil.json   ";
        responmodel resModel = new responmodel();
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filename));

            StringBuilder sb = new StringBuilder();
            String json;
            while ((json = reader.readLine()) != null) {
                sb.append(json);
            }
            reader.close();
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonArray = objectMapper.readTree(sb.toString());

            jsonArray = jsonArray.get("clubs");

            for (int i = 0; i < jsonArray.size(); i++) {
                String newx ="\""+x+"\"";

                if (newx.equals(String.valueOf(jsonArray.get(i).get("name")))){
                    resModel.setNama(String.valueOf(jsonArray.get(i).get("name")));
                    resModel.setCode(String.valueOf(jsonArray.get(i).get("code")));
                    resModel.setCountry(String.valueOf(jsonArray.get(i).get("country")));
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return resModel;

    }
}
