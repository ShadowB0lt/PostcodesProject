package com.sparta.eng_28;

import org.junit.Test;

public class PostcodeJsonParserTest {

    @Test
    public void parseJsonCheck(){
        PostcodeJsonParser postcodeJsonParser = new PostcodeJsonParser("resources/multiplepostcodessize3.json");
        System.out.println(postcodeJsonParser.getPostcodeJson());
    }
}
