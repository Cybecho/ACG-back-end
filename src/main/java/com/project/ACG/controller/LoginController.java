package com.project.ACG.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login/oauth2/code/github")
public class LoginController {
  @GetMapping
  public String getToken(@RequestParam ("code") String authorizationCode) {
    return authorizationCode;
  }
}
