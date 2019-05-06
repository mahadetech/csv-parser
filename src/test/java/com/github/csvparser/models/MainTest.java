package com.github.csvparser.models;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MainTest {

    @Test
    public void readCSVTest() throws Exception {

        AtomicReference<List<User>> userList = new AtomicReference<>(new ArrayList<User>());

        User user = new User(34, "maha", 45,67, 13, "white", "newyork");

        Assert.assertTrue(userList.get().add(user));
    }
}