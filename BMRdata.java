/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import javax.swing.JOptionPane;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class BMRdata extends User {
    String nki,gender,age,height,weight,bmr;
    String[][]data;
    BMRdata(){
        File inputWorkbook = new File("C:\\Users\\Moffat\\Desktop\\glint-master\\images\\portfolio\\Supporting files for the Assignment 1-20190819\\COIT20256Ass1Data.xls");
        Workbook w;
        try{
            w=Workbook.getWorkbook(inputWorkbook);
            Sheet sheet = w.getSheet(0);
            data = new String[sheet.getColumns()][sheet.getRows()];
            for (int j = 0; j <sheet.getColumns(); j++) 
            {
                for (int i = 0; i < sheet.getRows(); i++) 
                {
                    Cell cell = sheet.getCell(j, i);
                    data[j][i] = cell.getContents();
                   
                }
            }
            JOptionPane.showMessageDialog(null,"Data read Successfully");
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Arrays.binarySearch(data, "Bed Rest");
    }
}
