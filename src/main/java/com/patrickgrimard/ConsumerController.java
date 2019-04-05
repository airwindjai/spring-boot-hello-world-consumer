package com.patrickgrimard;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by XTL on 8/14/2014.
 */
@RequestMapping("/consumer")
@RestController
public class ConsumerController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index() {
    	RestTemplate restTemplate = new RestTemplate();
    	ResponseEntity<String> response
    	  = restTemplate.getForEntity("http://localhost:8080/api/arvind", String.class);
    	System.out.println("response.getBody() = "+response.getBody());
		return response.getBody();
    }
}