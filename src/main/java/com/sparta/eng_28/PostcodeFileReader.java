package com.sparta.eng_28;

import java.io.FileReader;

public class PostcodeFileReader {

    private FileReader postcodeFile;

    public PostcodeFileReader(String fileLocation)
    {
        try {
            postcodeFile = new FileReader(fileLocation);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public FileReader getPostcodeFile()
    {
        return postcodeFile;
    }

}
