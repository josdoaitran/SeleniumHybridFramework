package executionEngine;

import config.Constants;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import static support.ExecuteTestcase.execute_TestCase;

/**
 * Created by josdo on 07-Dec-16.
 */
public class RunTestNG {
    public static Properties OR;
    @BeforeMethod
    public void setUp() throws Exception{
    }
    @Test
    public void main() throws Exception {
        System.out.println("Run");
        DOMConfigurator.configure("log4j.xml");
        String Path_OR = Constants.Path_OR;
        File file = new File(Path_OR);
        FileInputStream fs = new FileInputStream(file);
        //System.out.println(file.getAbsolutePath());
        OR = new Properties(System.getProperties());
        OR.load(fs);
        execute_TestCase(".\\src\\test\\java\\testing\\dataEngine\\TestSuite1.xlsx",".\\src\\test\\java\\testing\\reports\\TestResult_TestSuite1.xlsx","TestSuite1");
    }
    @AfterMethod
    public void tearDown() {
    }
}
