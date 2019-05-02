package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Home;
import io.github.jhipster.application.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HomeService {
    @Autowired
    HomeRepository homeRepository;

    @Autowired
    public Home get() {
        return  null;
    }

    public Home addNew(String address,Long Price){
        Home h = new Home();
        h.setAddress(address);
        h.setPrice(Price);
        homeRepository.save(h);
        return h;
    }

    public Optional<Home> edit(Long id, String address, Long price){
        return Optional.of(homeRepository.findById(id))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .map(home -> {
                if(address!= null) home.setAddress(address);
                if(price!= null) home.setPrice(price);
                return home;
                }
            );
    }
    public void delete(Long id){
        homeRepository.findById(id).ifPresent(home -> {
            homeRepository.delete(home);
        });
    }

}
