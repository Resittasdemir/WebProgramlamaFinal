package com.resittasdemir.webprograming;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJqueryRepository extends JpaRepository<JqueryEntity,Long> {
    //JqueryEntity findByEmail(String email);

}
