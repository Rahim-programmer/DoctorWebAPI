package com.example.DoctorWebAPI;

import com.example.DoctorWebAPI.controller.ArticlesController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(ArticlesController.class)
class DoctorWebApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testArticles() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/Articles"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("Articles"));
	}

	@Test
	public void testIndex() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("index"));
	}
}


