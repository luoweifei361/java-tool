package weifei.lwf.comm.tool;

import java.io.BufferedReader;

import org.junit.Assert;
import org.junit.Test;

public class FileToolTest {

    private static String file = "/Users/weifeilwf/workspace/weifei.lwf.comm.tool/test/weifei/lwf/comm/tool/test.txt";

    @Test
    public void test() {
        BufferedReader br = FileTool.open(file);
        Assert.assertTrue(br != null);
        String str = FileTool.readLine(br);
        System.out.println(str);
        Assert.assertTrue("hello file;".equals(str));
    }
}
