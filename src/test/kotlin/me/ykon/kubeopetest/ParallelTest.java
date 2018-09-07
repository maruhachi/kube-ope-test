package me.ykon.kubeopetest;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ykonno.
 * @since 2018/09/07.
 */
public class ParallelTest {

    @Test
    public void add_1() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(2 , 1 + 1);
    }
    @Test
    public void add_2() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(3 , 2 + 1);
    }
    @Test
    public void add_3() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(4 , 3 + 1);
    }
    @Test
    public void add_4() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(5 , 4 + 1);
    }
}
