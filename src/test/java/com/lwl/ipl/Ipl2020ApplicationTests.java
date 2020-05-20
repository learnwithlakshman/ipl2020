package com.lwl.ipl;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lwl.ipl.service.IplStatService;

@SpringBootTest
class Ipl2020ApplicationTests {

		@Autowired
		private IplStatService iplStatService;

		@Test
		public void getTeamLabelsTest() {
			List<String> list = iplStatService.allTeamsLables();
			list.stream().forEach(e->{
				System.out.println(e);
			});
			Assertions.assertEquals(list.size(), 8);
		}

}
