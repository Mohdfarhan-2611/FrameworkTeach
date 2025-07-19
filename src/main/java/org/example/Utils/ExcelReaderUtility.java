package org.example.Utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.POJO.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReaderUtility {

    public static Iterator<User> readDataFromExcel() {

        File file = new File(System.getProperty("user.dir")+"/src/main/resources/QKartLoginTestData.xlsx");
        FileInputStream fis = null;
        XSSFWorkbook xssfWorkbook;
        XSSFSheet xssfSheet;
        Iterator<Row> rowIterator;
        Row row;
        Cell emailAddress=null;
        Cell password=null;
        List<User> userList=null;
        User user;

        try {
            fis = new FileInputStream(file);
            xssfWorkbook = new XSSFWorkbook(fis);
            xssfSheet = xssfWorkbook.getSheet("QKARTLOGIN");
            rowIterator = xssfSheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext()){
                row  =  rowIterator.next();
                emailAddress = row.getCell(0);
                password = row.getCell(1);
                userList = new ArrayList<User>();
                user = new User(emailAddress.toString(), password.toString());
                userList.add(user);
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        return userList.iterator();

    }
}
