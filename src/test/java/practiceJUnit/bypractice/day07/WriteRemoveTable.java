package practiceJUnit.bypractice.day03.day07;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteRemoveTable  {

    @Test
    public void name() throws IOException {

        //Data isimli excel dosyasına yeni kullanıcı adı ve password ekliyelim


        String filePath = "C:\\Users\\sevin\\OneDrive\\Desktop\\data.xlsx";

        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        workbook.getSheet("Sayfa1").createRow(3).createCell(0).setCellValue("2.Kullanici Bilgileri");
        workbook.getSheet("Sayfa1").createRow(3).createCell(0).setCellValue("email");
        workbook.getSheet("Sayfa1").createRow(3).createCell(0).setCellValue("password");

        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);

    }


    @Test
    public void test() throws IOException {

        //Yeni bir methodda kullanıcı bilgileri başlığını silelim

        String filePath = "C:\\Users\\sevin\\OneDrive\\Desktop\\data.xlsx";

        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheet("Sayfa1");

        Row row = sheet.getRow(3);
        Cell cell = row.getCell(0);
        row.removeCell(cell);

        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);


    }
}
