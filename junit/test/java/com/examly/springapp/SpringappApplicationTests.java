package com.examly.springapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	// user signup
	@Test
	@Transactional
	public void test_case1() throws Exception {
		String newUser = "{\"email\":\"test@gmail.com\",\"password\":\"Test@123\",\"username\":\"test123\",\"mobileNumber\":\"9876543210\",\"userRole\":\"user\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/user/signup")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// admin signup
	@Test
	@Transactional
	public void test_case2() throws Exception {
		String newUser = "{\"email\":\"testad@gmail.com\",\"password\":\"Testad@123\",\"username\":\"testad123\",\"mobileNumber\":\"9876543210\",\"userRole\":\"admin\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/admin/signup")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// add service center
	@Test
	@Transactional
	public void test_case3() throws Exception {
		String newService = "{\"serviceCenterID\":\"01\",\"serviceCenterName\":\"printer Service\",\"serviceCenterPhone\":\"9876543210\",\"serviceCenterAddress\":\"cross street road\",\"serviceCenterImageUrl\":\"mobile.png\",\"serviceCentermailId\":\"mobemail@gmail.com\",\"serviceCenterDescription\":\"good service\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/admin/addServiceCenter")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newService)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// - get all service center details
	@Test
	@Transactional
	public void test_case4() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/admin/getServiceCenter")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
				.andReturn();
	}

	// update service center details
	@Test
	@Transactional
	public void test_case5() throws Exception {
		String newService = "{\"serviceCenterID\":\"01\",\"serviceCenterName\":\"Mob&prin Service\",\"serviceCenterPhone\":\"9876543210\",\"serviceCenterAddress\":\"cross street road\",\"serviceCenterImageUrl\":\"mobile.png\",\"serviceCentermailId\":\"mobemail@gmail.com\",\"serviceCenterDescription\":\"good service\"}";
		mockMvc.perform(MockMvcRequestBuilders.put("/admin/editServiceCenter")
				.param("serviceCenterID", "01")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newService)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// delete service center
	@Test
	@Transactional
	public void test_case6() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/admin/deleteServiceCenter/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// add appointment
	@Test
	@Transactional
	public void test_case7() throws Exception {
		String newService = "{\"productName\":\"printer\",\"productModelNo\":\"567\",\"dateOfPurchase\":\"2023-01-01\",\"contactNumber\":\"9876543210\",\"problemDescription\":\"print repair\",\"availableSlots\":\"12:00:00.9999999\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/admin/addServiceCenter")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newService)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// delete appintment
	@Test
	@Transactional
	public void test_case8() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete(" /user/cancelappointment/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

}
