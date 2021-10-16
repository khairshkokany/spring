package com.example.songr;

import com.example.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc

@SpringBootTest
class SongrApplicationTests {


	@Autowired
	private MockMvc mockMvc;


	@Test
	void contextLoads() {
	}

	@Test
	public void constructorTest () {
	Album album = new Album("happy day","bille elish",56.5,6,"https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png");
	String title = "happy day";
	String artist = "bille elish";
	double length = 56.5;
	int songCount = 6;

	String imageUrl = "https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png";
	assertEquals(title,album.getTitle());
	assertEquals(artist,album.getArtist());
	assertEquals(imageUrl,album.getImageUrl());
	assertEquals(length,album.getLength());
	assertEquals(songCount,album.getSongCount());
	}

	@Test
	public void gettersTest () {
		Album album = new Album("happy day","bille elish",56.5,6,"https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png");

		assertEquals("happy day",album.getTitle());
	}

	@Test
	public void settersTest () {
		Album album = new Album("happy day","bille elish",56.5,6,"https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png");
		album.setArtist("bille elish");
		assertEquals("bille elish",album.getArtist());
	}


//	@Test
//	public void testReqStatusAndReturnString() throws Exception {
//
//		this.mockMvc.perform(get("/hello")).andDo(print())
//				.andExpect(status().isOk()).
//				andExpect((ResultMatcher) content().string(containsString("Hello")));
//	}

	@Test
	public void testRequestStatusAndReturn() throws Exception{
		this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello")));
	}


}
