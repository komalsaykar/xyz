package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReaderClass extends BaseClass{
	XSSFWorkbook workbook;
public  void ExcelReader(String path) throws IOException
{
	File f=new File(path);
	FileInputStream fs=new FileInputStream(f);
	 workbook=new XSSFWorkbook(fs);
	 
}
















}
