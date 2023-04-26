package com.oauth2.oauth2.Controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Oauth2Controller {
    
    @GetMapping("/auth")
    public String getRequest(Principal user) {
		return "welcome";
	}
}
