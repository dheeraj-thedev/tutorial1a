package com.springtutorials.tutorial1.config;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author amit@springtutorials.com
 *
 * All tests will extend from this base test.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Tutorial1Config.class})
public abstract class BaseTest {

}
