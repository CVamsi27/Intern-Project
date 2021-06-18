package com.cognizant.vendor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.cognizant.vendor.model.Vendor;



/**
 * @author Lakshmi Devi
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class VendorApplicationTests {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VendorApplication.class);
	
	@Autowired 
	private TestRestTemplate restTemplate;
	
	
	
	
	/**tests /getVendorDetails 
	 * @throws JSONException
	 */
	@Test
	public void getVendorDetailsTest() throws JSONException {
		
		LOGGER.info("into getVendorDetailsTest method in VendorApplicationTests class");
		List<Vendor> test=new ArrayList<Vendor>();
		test.add(new Vendor("V101","Suresh",35.0,4.2));
		test.add(new Vendor("V103","Priya",50.0,4.0));

		String head = "{\"productId\": \"P101\"}";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(head, headers);
		ResponseEntity<List<Vendor>> response = restTemplate.exchange("/getVendorDetails/P101", HttpMethod.GET, entity,  new ParameterizedTypeReference<List<Vendor>>() {});

        List<Vendor> result=response.getBody();
       
       
	   assertEquals(2,result.size());
	   assertEquals(test.get(0).getVendorId(),result.get(0).getVendorId());
	   assertEquals(test.get(1).getVendorId(),result.get(1).getVendorId());
	  
	
	}
	
	
}