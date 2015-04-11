package com.github.mikegehard.itemLookup;

import com.github.mikegehard.itemLookup.web.ItemLookupApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ItemLookupApplication.class)
@WebAppConfiguration
public class ItemLookupApplicationTests {

	@Test
	public void contextLoads() {
	}

}
