package com.sparta.eng_28;

import static org.junit.Assert.assertTrue;

import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileReader;


/**
 * Unit test for Postcode File Reader
 */
public class PostcodeFileReaderTest
{
    private static PostcodeFileReader reader;

    @BeforeClass
    public static void createFile()
    {
        reader = new PostcodeFileReader("resources/singlepostcode.json");
    }

    @Test
    public void testReader(){
        Assert.assertTrue(reader.getPostcodeFile() instanceof FileReader);
    }

    @Test
    public void testReaderNull(){
        Assert.assertTrue(reader != null);
    }




    @AfterClass
    public static void destroyFileReader(){
        reader = null;
    }

}
