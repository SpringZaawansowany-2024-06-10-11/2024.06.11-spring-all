package com.comarch.szkolenia.spring.services;

import com.comarch.szkolenia.spring.dao.UserDAO;
import com.comarch.szkolenia.spring.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private final UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userBox = this.userDAO.findByLogin(username);
        return userBox.orElseThrow(
                () -> new UsernameNotFoundException("User with login: " + username + " not exist"));
    }
}
