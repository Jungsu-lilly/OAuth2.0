package io.security.oauth2prac.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;
import java.util.Map;

public interface ProviderUser {

    String getId();
    String getUsername();
    String getPassword();
    String getEmail();
    String getProvider(); // 서비스 제공자
    List<? extends GrantedAuthority> getAuthorities();
    Map<String, Object> getAttributes();
}
