package com.cybertek.tests.day17_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {

    @Test
    public  void readExcel(){
        //create an object from ExcelUtil
        //it accepts two argument
        //Argument 1: location of the file(path)
        //Argument 2: sheet that we want to open (sheet)

        ExcelUtil qa3short = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");
        System.out.println("Row count :"+qa3short.rowCount());
        // how many column in the sheet
        System.out.println("Column count:"+qa3short.columnCount());
        //get column names
        System.out.println("Column names: "+qa3short.getColumnsNames().get(0));
        //get all columns
        System.out.println("Column names: "+qa3short.getColumnsNames());


        List<Map<String, String>> dataList = qa3short.getDataList();

        System.out.println(dataList.get(0).get("firstname"));
        //print them one by one for each row
        for (Map<String, String> onerow :dataList){
            System.out.println(onerow);
        }
    //get all data in 2d array
        String [][] dataArray = qa3short.getDataArray();
        //print the array
        System.out.println(Arrays.deepToString(dataArray));


    }
}
