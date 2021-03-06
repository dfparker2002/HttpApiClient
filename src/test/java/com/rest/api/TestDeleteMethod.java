package com.rest.api;



import java.util.HashMap;

import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.Test;

import com.rest.api.httpclient.HttpApiClient;
import com.rest.api.httpclient.HttpApiResponce;

public class TestDeleteMethod {
	
	@Test
	public void testDelete() {
		@SuppressWarnings("serial")
		HttpApiResponce responce = HttpApiClient.Delete("http://localhost:8080/landlords/mYAtYSJy",new HashMap<String, String>(){{
			put("test", "One");
		}});
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getResponceContent());
		Assert.assertTrue(responce.getStatusCode() == HttpStatus.SC_OK || responce.getStatusCode() == HttpStatus.SC_NOT_FOUND);
	}

}
