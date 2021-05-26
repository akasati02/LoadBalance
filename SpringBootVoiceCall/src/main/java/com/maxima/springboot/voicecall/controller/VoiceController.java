package com.maxima.springboot.voicecall.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@RestController
@RequestMapping("/api/v1")
public class VoiceController {
	
	 public static final String ACCOUNT_SID = "AC6dd8feb36fd9ef6ab9d28e88b236fe2d";
	 public static final String AUTH_TOKEN = "provide token here";
	 
	 public static final String FROM_NUMBER="+12543230123";
	 public static final String TO_NUMBER="to be called number";
	 static {
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	 } 
	 
	 @GetMapping("voicecall")	 
	 public String makeVoiceCall() throws URISyntaxException {
		 Call call = Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
			        new URI("http://demo.twilio.com/docs/voice.xml")).create(); 
		 
		 System.out.println(call.getSid());
		 return "Call Connected Successfully";
	 }

}
