package com.example.demo.project;

import com.example.demo.project.Repository.UserRepository;
import com.example.demo.project.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepository.findByName(username);
        if(user==null){
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrinciple(user);
    }
}
