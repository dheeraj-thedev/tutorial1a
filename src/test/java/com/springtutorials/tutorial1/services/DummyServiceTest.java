package com.springtutorials.tutorial1.services;

import com.springtutorials.tutorial1.config.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author amit@springtutorials.com
 *
 * testing the dummy service
 */
public class DummyServiceTest extends BaseTest {

    @Autowired
    private DummyService dummyService;

    @Test
    public void test(){
        Assert.assertEquals(dummyService.test(), "OK");
    }
}
