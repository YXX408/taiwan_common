package com.taiwan.domain;


import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class AuthResponse {
    private String token;
    private String username;
    private Collection<? extends GrantedAuthority> authorities;

    public AuthResponse(String token, String username, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.username = username;
        this.authorities = authorities;
    }

    // Getter 和 Setter 方法

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
