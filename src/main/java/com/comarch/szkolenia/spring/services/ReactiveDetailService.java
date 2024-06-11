package com.comarch.szkolenia.spring.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class ReactiveDetailService /*implements ReactiveUserDetailsService*/ {

    //DAO
    /*@Override
    public reactor.core.publisher.Mono<UserDetails> findByUsername(String username) {
        return null;
        //wyciaganie z dao obiektu MONO
    }*/
}
