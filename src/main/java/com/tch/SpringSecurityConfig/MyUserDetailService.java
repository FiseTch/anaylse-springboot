package com.tch.SpringSecurityConfig;

import com.tch.domain.security.UserImpl;
import com.tch.responsity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/11 16:47
 */
public class MyUserDetailService implements UserDetailsService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserImpl user = userRepository.getUserByUsername(username);
        List<GrantedAuthority> authority = null;
        if (user != null) {
            authority.add(new SimpleGrantedAuthority("SUPERADMIN"));
        }
        return new User(user.getUsername(), user.getPassword(), authority);
    }
}
