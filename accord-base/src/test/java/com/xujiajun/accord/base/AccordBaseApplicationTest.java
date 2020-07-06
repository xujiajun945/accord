package com.xujiajun.accord.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@ActiveProfiles(value = "test")
public class AccordBaseApplicationTest {

	@Test
	public void context() {

	}
}
