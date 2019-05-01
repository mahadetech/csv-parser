package com.github.csvparser;

// MY ist project
public class Main {

    // 0. Add apache commons csv as a maven dependency

    // 1. Read the CSV file using apache commons csv

    // 2. Read each line and convert it to the java object (User)

    // 3. Print the Java object

    // 4. Find the User who has the maximum age and height and print this object
    public static final String SAMPLE_CSV_FILE_PATH = "./users.csv";
    public static void csvreadfie()
    {
        try {
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

        }catch(Exception e)
        {
            System.out.print("error");
        }
        for (CSVRecord csvRecord : csvParser) {
            String name = csvRecord.get(0);
            double age = csvRecord.get(1);
            double height = csvRecord.get(2);
            double weight = csv.get(3);
            String color =csv.get(4);
            String country = csvRecord.get(5);

            System.out.println("Record No - " + csvRecord.getRecordNumber());
            System.out.println("---------------");
            System.out.println("Name : " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("Color: " + color);
            System.out.println("Country : " + country);
            System.out.println("---------------\n\n");


        }


}



}
