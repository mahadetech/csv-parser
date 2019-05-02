package com.github.csvparser.models;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BasicCsvReader
        {


           public void readcsv() throws IOException


            {
                BufferedReader reader = Files.newBufferedReader(Paths.get("/Users/jothi/Projects/Private/java-projects/maha/csv-parser/src/main/java/com/github/csvparser/models/users.csv"));
                //CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("name","id","age","height","weight","color","country").withIgnoreHeaderCase().withTrim());
                CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(reader);
                for (CSVRecord csvRecord : csvParser)
                {

                    // Accessing Values by Column Index
                    String name = csvRecord.get("name");
                    String id=csvRecord.get("id");

                    //Accessing the values by column header name
                    String  age = csvRecord.get("age");

                    //Printing the record
                    System.out.println("Record Number - " + csvRecord.getRecordNumber());
                    System.out.println("Name : " + name);
                    System.out.println("id : " + id);
                    System.out.println(" age: " + age);
                    System.out.println("\n\n");
                }
            }
            public void csvread()
            {
               final String COMMA_DELIMITER = ",";



                    BufferedReader br = null;
                    try
                    {
                        //Reading the csv file
                        br = new BufferedReader(new FileReader("/Users/jothi/Projects/Private/java-projects/maha/csv-parser/src/main/java/com/github/csvparser/models/users.csv"));

                        //Create List for holding Employee objects
                        List<User> userList = new ArrayList<User>();

                        String line = "";
                        //Read to skip the header
                        br.readLine();
                        //Reading from the second line
                        while ((line = br.readLine()) != null)
                        {
                            String[] userDetails = line.split(COMMA_DELIMITER);

                            if(userDetails.length > 0 )
                            {
                                //Save the employee details in Employee object
                                User use = new User(Integer.parseInt(userDetails[0]),
                                                                    userDetails[1],
                                                                    Integer.parseInt(userDetails[2]),
                                                                    Integer.parseInt(userDetails[3]),
                                                                    Integer.parseInt(userDetails[4]),
                                                                    (userDetails[5]),

                                                                    userDetails[6]);
                               


                               userList.add(use);
                            }
                        }

                        //Lets print the Employee List
                        for(User e : userList)
                        {
                            System.out.println(e.getId()+"   "+e.getName()+"   "
                                    +e.getAge()+"   "+e.getHeight()+ "  " +e.getWeight()+ "  "+e.getColor()+ "  "
                                    +e.getCountry());
                        }
                    }
                    catch(Exception ee)
                    {
                        ee.printStackTrace();
                    }
                    finally
                    {
                        try
                        {
                            br.close();
                        }
                        catch(IOException ie)
                        {
                            System.out.println("Error occured while closing the BufferedReader");
                            ie.printStackTrace();
                        }
                    }
                }

            }


        
