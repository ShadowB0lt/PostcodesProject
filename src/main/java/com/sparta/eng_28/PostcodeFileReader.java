package com.sparta.eng_28;

import java.io.FileReader;

public class PostcodeFileReader {

    private FileReader postCodeFile;

    public PostcodeFileReader(String fileLocation)
    {
        try {
            postCodeFile = new FileReader(fileLocation);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public FileReader getPostCodeFile()
    {
        return postCodeFile;
    }

}
