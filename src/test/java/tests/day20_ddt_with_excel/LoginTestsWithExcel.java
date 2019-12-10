package tests.day20_ddt_with_excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.TestBase;
import utils.ExcelUtil;

public class LoginTestsWithExcel extends TestBase {

    @Test(dataProvider = "credentials",description = "Login")
    public void loginTest(){

    }








    //is a test data supplier
    //as many sets of data it returns
    //as many times exactly same test will run
    @DataProvider(name = "credentials")
    public static Object[][] credentials(){
        ExcelUtil qa2 = new ExcelUtil("vytrack_testusers.xlsx", "QA2-short");
        return qa2.getDataArray();
    }







//    public static void main(String[] args) {
//        ExcelUtil qa2 = new ExcelUtil("vytrack_testusers.xlsx", "QA2-short");
//        System.out.println("Row count: " + qa2.rowCount());
//        System.out.println(qa2.getColumnsNames());
//        //map is a data structure
//        //in map, every value is referenced by key
//        //when we retrieve data from map, we don't specify index, we specify key name
//        //keys must be unique
//        //keys are represented by column names
//        //like in properties file key=value
//        for (Map<String, String> map : qa2.getDataList()) {
//            System.out.println(map.get("username"));
//        }
//    }


}