package com.sparta.eng_28;

import com.sparta.eng_28.SinglePostcodeDTO;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultiplePostCodeDTO {

    private JSONObject multipleJSONPostCodes;
    private ArrayList<JSONObject> postCodesDetailsInArray;
    private Map<String, SinglePostcodeDTO> postCodeMap;

    public MultiplePostCodeDTO(JSONObject multipleJSONPostCodes){
        this.multipleJSONPostCodes = multipleJSONPostCodes;
        postCodesDetailsInArray = (ArrayList<JSONObject>) this.multipleJSONPostCodes.get("result");
        createPostCodeMap();
    }

    public int getStatus(){
        return (int) multipleJSONPostCodes.get("status");
    }

    private void createPostCodeMap(){
        postCodeMap = new HashMap<>();
        for (JSONObject postCodeQuery : postCodesDetailsInArray){
            String postCode = (String) postCodeQuery.get("query");
            postCodeMap.put(postCode, new SinglePostcodeDTO((JSONObject) postCodeQuery.get("result")));
        }
    }

    public Map<String, SinglePostcodeDTO> getPostCodeHashMap(){
        return postCodeMap;
}
}
