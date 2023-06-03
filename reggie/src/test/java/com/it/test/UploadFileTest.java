package com.it.test;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UploadFileTest {
    @Test
    public void test1(){
        String fileName = "erere.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);

    }
}
