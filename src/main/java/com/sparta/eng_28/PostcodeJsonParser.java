package com.sparta.eng_28;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class PostcodeJsonParser {
    private JSONObject postcodeJson;

    //transfers postcode json file to postcode json object
    public PostcodeJsonParser(String filepath) {
        try {
            PostcodeFileReader reader = new PostcodeFileReader(filepath);
            JSONParser parser = new JSONParser();
            postcodeJson = (JSONObject) parser.parse(reader.getPostCodeFile());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getPostcodeJson() {
        return postcodeJson;
    }
}
