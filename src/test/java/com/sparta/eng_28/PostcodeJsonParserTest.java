package com.sparta.eng_28;

import org.junit.Test;

public class PostcodeJsonParserTest {

    @Test
    public void parseJsonCheck(){
        PostcodeJsonParser ratesJsonParser = new PostcodeJsonParser("resources/multiplepostcodessize3.json");
        System.out.println(ratesJsonParser.getPostcodeJson());
    }
}
