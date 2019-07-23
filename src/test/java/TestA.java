import org.junit.Assert;
import org.junit.Test;

public class TestA {
    @Test
    public void test1() {
        System.out.println(ProcessHandle.current().pid() + " " + Thread.currentThread().getId() +  " A test1");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println(ProcessHandle.current().pid() + " " + Thread.currentThread().getId() + " A test2");
        Assert.assertTrue(true);
    }

    @Test
    public void test3() {
        System.out.println(ProcessHandle.current().pid() + " " + Thread.currentThread().getId() + " A test3");
        Assert.assertTrue(true);
    }
}
