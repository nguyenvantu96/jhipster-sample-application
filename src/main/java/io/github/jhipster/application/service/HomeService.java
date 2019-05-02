package io.github.jhipster.application.service;

import io.github.jhipster.application.domain.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HomeService {
    @Autowired
    public Home get() {
        return  null;
    }
}
