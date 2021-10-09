package util;

import net.serenitybdd.rest.SerenityRest;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetResponse {



    public static String ofCreateUser(String field){
        String response="";
        JSONParser parser = new JSONParser();
        try {
            Object obj_response = parser.parse(SerenityRest.lastResponse().body().asString());
            JSONObject array_response = (JSONObject) obj_response;
                String str = array_response.get("data").toString();
            Object obj_response_1 = parser.parse(str);
            JSONObject array_response_1 = (JSONObject) obj_response_1;
            response = array_response_1.get(field.toString()).toString();

        }catch (ParseException pe){

        }

        return response;

    }

    public static String ofAuthenticacion(){
        String temp =SerenityRest.lastResponse().header("Authorization");
        return SerenityRest.lastResponse().header("Authorization");

    }

}
