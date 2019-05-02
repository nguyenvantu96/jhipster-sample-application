package io.github.jhipster.application.web.rest;

import io.github.jhipster.application.domain.Home;
import io.github.jhipster.application.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeResource {
    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public ResponseEntity<Home> get(){

        Home h = homeService.get();
        return new ResponseEntity<Home>(h, HttpStatus.OK);
    }
}
