package com.github.csvparser;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import com.github.csvparser.models.BasicCsvReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;




public class Main {

    public static void main(String[] args) throws Exception
    {


            BasicCsvReader a =new BasicCsvReader();
            //a.readcsv();
            a.csvread();




    }
}


















