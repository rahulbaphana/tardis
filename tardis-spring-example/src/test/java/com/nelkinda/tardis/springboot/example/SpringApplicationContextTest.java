package com.nelkinda.tardis.springboot.example;

import com.nelkinda.tardis.Tardis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.Clock;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringApplicationContextTest {

    @Autowired
    @Qualifier("applicationClock")
    private Clock tardis;

    @Test
    public void clock_should_be_an_instance_of_tardis() {
        assertTrue(tardis instanceof Tardis);
    }
}
