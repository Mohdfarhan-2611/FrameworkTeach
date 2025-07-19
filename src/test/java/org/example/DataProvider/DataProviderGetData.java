package org.example.DataProvider;

import org.example.POJO.User;
import org.example.Utils.ExcelReaderUtility;
import org.testng.annotations.DataProvider;

import java.util.Iterator;

public class DataProviderGetData {


    @DataProvider(name = "QKARTDATAFROMEXCEL")
    public static Iterator<User> getData() {
        return ExcelReaderUtility.readDataFromExcel();
    }


}
