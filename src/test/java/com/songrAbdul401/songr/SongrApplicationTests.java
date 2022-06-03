package com.songrAbdul401.songr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {
	@Autowired
	MockMvc mockMvc;
	@Test
	void contextLoads() {
		SongrApplication sut = new SongrApplication();
		assertNotNull(sut, "NUll");
	}
	@Test
	void testAlbumsPage() throws Exception {
		mockMvc.perform(get("/album"))
				.andDo(print())// shows output on server console
				.andExpect(content().string(containsString("<h1>Albums</h1>")))
				.andExpect(status().isOk());
	}

}
