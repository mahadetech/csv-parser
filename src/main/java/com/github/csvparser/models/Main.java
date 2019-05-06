package com.github.csvparser.models;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Main {

    public static void main(String[] args) throws Exception {
        Main a = new Main();
        a.readCSV();
    }

    private void readCSV() throws Exception {
        Path fiiePath = Paths.get(ClassLoader.getSystemResource("users.csv").toURI());
        BufferedReader reader = Files.newBufferedReader(fiiePath);
        CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(reader);

        AtomicReference<List<User>> userList = new AtomicReference<>(new ArrayList<User>());

        for (CSVRecord csvRecord : csvParser) {
            // Accessing Values by Column Index
            String name = csvRecord.get("name");
            int id = Integer.parseInt(csvRecord.get("id"));
            int age = Integer.parseInt(csvRecord.get("age"));
            int height = Integer.parseInt(csvRecord.get("height"));
            int weight = Integer.parseInt(csvRecord.get("weight"));
            String color = csvRecord.get("color");
            String country = csvRecord.get("country");

            User user = new User(id, name, age, height, weight, color, country);
            userList.get().add(user);

            System.out.println(user);
        }
    }
}
