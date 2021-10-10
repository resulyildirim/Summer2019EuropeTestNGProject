package com.cybertek.tests.day13propertiesDriverTestbase;

public class singleton {
    //singleton class willm have private constructor
    //it means other classes creat object of this class
    private singleton() {
    }

    private static String str;

    public static String getInstance() {
        //if str has no value,initialize it and return it
    if(str==null){
        System.out.println("str is null.assingning value to it");
        str="somevalue";
    }else {
        System.out.println("it has value just return it");
    }
        return str;

        //if it has value just return it
    }


}
