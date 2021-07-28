package com.titaniumalloy.util;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TitaniumToolBox {
    public static String readFromFile(String filePath)
    {
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }
}
