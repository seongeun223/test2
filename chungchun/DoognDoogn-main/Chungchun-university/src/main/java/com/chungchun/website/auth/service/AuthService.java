package com.chungchun.website.auth.service;

import com.chungchun.website.auth.principal.AuthPrincipal;
import com.chungchun.website.user.model.User;
import com.chungchun.website.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class AuthService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findUserByUserId(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));

        log.info("로그인하는 사용자 이름 : {}", user.getUserName());

        return new AuthPrincipal(user);
    }
}
