package com.sparta.eng_28;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PostcodeSinglePostcodeDTOTest {

    private static PostcodeJsonParser postcodeJsonParser;
    private static SinglePostcodeDTO singlePostcodeDTO;

    @BeforeClass
    public static void chooseTestFile()
    {
        postcodeJsonParser = new PostcodeJsonParser("resources/singlepostcode.json");
        singlePostcodeDTO = new SinglePostcodeDTO(postcodeJsonParser.getPostcodeJson());
    }

    @Test
    public void isAdminDistrict(){
        Assert.assertEquals(singlePostcodeDTO.getCodes().get("admin_district"),
                "E06000043");
    }

    @Test
    public void isAdminCounty(){
        Assert.assertEquals(singlePostcodeDTO.getCodes().get("admin_county"),
                "E99999999");
    }

    @Test
    public void isAdminWard(){
        Assert.assertEquals(singlePostcodeDTO.getCodes().get("admin_ward"),
                "E05002426");
    }

    @Test
    public void isParish(){
        Assert.assertEquals(singlePostcodeDTO.getCodes().get("parish"),
                "E43000034");
    }

    @Test
    public void isParliamentaryConstituency(){
        Assert.assertEquals(singlePostcodeDTO.getCodes().get("parliamentary_constituency"),
                "E14000598");
    }

    @Test
    public void isCcg(){
        Assert.assertEquals(singlePostcodeDTO.getCodes().get("ccg"),
                "E38000021");
    }

    @Test
    public void isCed(){
        Assert.assertEquals(singlePostcodeDTO.getCodes().get("ced"),
                "E99999999");
    }

    @Test
    public void isNuts(){
        Assert.assertEquals(singlePostcodeDTO.getCodes().get("nuts"),
                "UKJ21");
    }






}
