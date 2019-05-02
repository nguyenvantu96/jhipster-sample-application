package io.github.jhipster.application.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookResource {
    @GetMapping("/")
    public String get(){

        return "abc";
    }
}
