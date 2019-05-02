package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Home;
import io.github.jhipster.application.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
    Optional<User> findOneWithAuthoritiesById(Long id);
}
