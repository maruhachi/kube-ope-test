package me.ykon.kubeopetest;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ykonno.
 * @since 2018/09/07.
 */
public class Parallel2Test {

    @Test
    public void add_5() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(2 , 1 + 1);
    }
    @Test
    public void add_6() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(3 , 2 + 1);
    }
    @Test
    public void add_7() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(4 , 3 + 1);
    }
    @Test
    public void add_8() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(5 , 4 + 1);
    }
}
