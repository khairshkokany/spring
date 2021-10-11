package com.example.songr;

import com.example.songr.model.Album;
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

}
