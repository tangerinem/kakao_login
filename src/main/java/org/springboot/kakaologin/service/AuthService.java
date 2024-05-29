package org.springboot.kakaologin.service;

import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> getKaKaoUserInfo(String authorizeCode);
}
