
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestCase {
    public static String excelPath="G:\\testcase.xlsx";
    public static Workbook workbook=null;
    //获得sheet页签
    public static Sheet get_sheet(){
        try {
            workbook= new XSSFWorkbook(new FileInputStream(excelPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet=workbook.getSheetAt(0);
        return sheet;
    }
    //获得行数
    public static int get_lines(){
        Sheet sheet=get_sheet();
        return sheet.getPhysicalNumberOfRows();
    }
    //获取单元格内容
    public static Object  get_cell_value(int x,int y){
        Sheet sheet=get_sheet();
        //单元格值类型
        Cell cell=sheet.getRow(x).getCell(y);
        if(cell == null) {
            return null;
        }
        switch (cell.getCellType()){
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue();
                } else {
                    return cell.getNumericCellValue();
                }
            default:
                return null;
        }

    }
    //将excel 中数据读取到类中
    public static List<ExcelVo> get_cases(){

        List<ExcelVo> list=new ArrayList<>();

        //用例行数
        int rows=get_lines();
        for(int i=1;i<rows;i++){
            ExcelVo excelVo=new ExcelVo();
            excelVo.setCaseid((String)get_cell_value(i,0));
            excelVo.setExecute_name((String)get_cell_value(i,1));
            excelVo.setExecute_method((String)get_cell_value(i,2));
            list.add(excelVo);
        }
        return list;
    }

    public static void main(String args[]){
        List<ExcelVo> list=TestCase.get_cases();
        for(ExcelVo excelVo:list){
            System.out.println(excelVo.toString());
        }
    }
}
