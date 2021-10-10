package com.example.songr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void constructorTest () {
	Album album = new Album("happy day","bille elish","https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png");
	String title = "happy day";
	String artist = "bille elish";
	String imageUrl = "https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png";
	assertEquals(title,album.getTitle());
	assertEquals(artist,album.getArtist());
	assertEquals(imageUrl,album.getImageUrl());
	}

	@Test
	public void gettersTest () {
		Album album = new Album("happy day","bille elish","https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png");

		assertEquals("happy day",album.getTitle());
	}

	@Test
	public void settersTest () {
		Album album = new Album("happy day","bille elish","https://upload.wikimedia.org/wikipedia/en/4/45/Billie_Eilish_-_Happier_Than_Ever.png");
		album.setArtist("bille elish");
		assertEquals("bille elish",album.getArtist());
	}

}
