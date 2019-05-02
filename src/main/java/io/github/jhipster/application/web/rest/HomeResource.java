package io.github.jhipster.application.web.rest;

import io.github.jhipster.application.domain.Home;
import io.github.jhipster.application.repository.HomeRepository;
import io.github.jhipster.application.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeResource {
    @Autowired
    HomeRepository homeRepository;



    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public ResponseEntity<Home> get(){

        Home h = homeService.get();
        return new ResponseEntity<Home>(h, HttpStatus.OK);
    }
    @PostMapping("/test")
    public Home newHome(String address,Long price){
    Home h=homeService.addNew(address, price);
    return h;

    }
    @GetMapping("/Edit")
    public void edit(Long id, String address, Long price){
        homeService.edit(id,address,price);
    }
    @GetMapping("/Delete")
    public void delete(Long id){
        homeService.delete(id);
    }
}
