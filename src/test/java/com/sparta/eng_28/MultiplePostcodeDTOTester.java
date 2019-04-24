package com.sparta.eng_28;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultiplePostcodeDTOTester
{
    private static final String FILE_LOC3 = "resources/multiplepostcodessize3.json";
    private static final String FILE_LOC10 = "resources/multiplepostcodessize10.json";
    private static PostcodeJsonParser parserThree;
    private static PostcodeJsonParser parserTen;
    private static MultiplePostCodeDTO multiDTOThree;
    private static MultiplePostCodeDTO multiDTOTen;

    @BeforeClass
    public static void init()
    {
        parserThree = new PostcodeJsonParser(FILE_LOC3);
        parserTen = new PostcodeJsonParser(FILE_LOC10);
        multiDTOThree = new MultiplePostCodeDTO(parserThree.getPostcodeJson());
        multiDTOTen = new MultiplePostCodeDTO(parserTen.getPostcodeJson());
    }


    //test for map size small.
    @Test
    public void parserThreeTest()
    {
        Assert.assertEquals(multiDTOThree.getPostCodeHashMap().size(), 3);
    }

    @Test
    public void parserTenTest()
    {
        Assert.assertEquals(multiDTOTen.getPostCodeHashMap().size(), 10);
    }

    @Test
    public void checkParishTen()
    {
        Assert.assertEquals(multiDTOTen.getPostCodeHashMap().get("OX49 5NU").getParish(),"Brightwell Baldwin");
    }

    @Test
    public void checkIncodeThree()
    {
        Assert.assertEquals(multiDTOThree.getPostCodeHashMap().get("M32 0JG").getIncode(), "M32");
    }






}
