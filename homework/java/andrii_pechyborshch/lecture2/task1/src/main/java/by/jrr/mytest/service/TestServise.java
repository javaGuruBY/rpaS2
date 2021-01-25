package by.jrr.mytest.service;

import by.jrr.mytest.beam.Dog;
import com.sun.prism.shader.Mask_TextureSuper_AlphaTest_Loader;

public class TestServise {
    public void run() throws Exception {
        dogServiceTest();
        dogServiceUtilTest();
    }

    public void dogServiceTest() throws Exception {

    }

    public void dogServiceUtilTest() throws Exception {

    }

    public void assertEquals(String expected, String actual, String testName) throws Exception {
        boolean isPassed = expected.equals(actual);
        if(!isPassed) {
            throw new Exception(testName + " NOT PASSED");
        }
    }
}
