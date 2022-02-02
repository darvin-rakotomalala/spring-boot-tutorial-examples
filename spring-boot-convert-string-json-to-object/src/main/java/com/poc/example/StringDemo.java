package com.poc.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringDemo {
    public void stringToDto() throws ParseException {
        String str = "[Emp id=1, name=Darvin, dateNaiss=2010-01-02, salary=1900.00";
        String[] fields = str.split(", "); // delimiter is ,&space

        Employe e = new Employe();
        DateFormat fmt = new SimpleDateFormat("yyyy-mm-dd");
        for (int i = 0; i < fields.length; i++) {
            String[] fieldValue = fields[i].split("=");
            System.out.println(fieldValue[1]);

            if (i==0) e.setId(Integer.valueOf(fieldValue[1]));
            if (i==1) e.setName(fieldValue[1]);
            if (i==2) e.setDateNaiss(fmt.parse(fieldValue[1]));
            if (i==3) e.setSalary(Float.valueOf(fieldValue[1]));
        }

        System.out.println(e.getId() + " " + e.getName()+ " " + e.getDateNaiss()+ " " + e.getSalary());
    }
}
