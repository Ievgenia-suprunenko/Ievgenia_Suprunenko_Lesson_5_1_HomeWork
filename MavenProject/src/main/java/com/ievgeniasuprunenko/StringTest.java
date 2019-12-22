package com.ievgeniasuprunenko;

import org.apache.commons.lang3.StringUtils;

public class StringTest {
    public static void main(String[] args) {
        String stringAge= "text";
        if (StringUtils.isNumeric(stringAge)){
            System.out.println("age value is  " + Integer.parseInt(stringAge));
        }else{
            System.out.println("Age value is not valid");
        }
    }
}
