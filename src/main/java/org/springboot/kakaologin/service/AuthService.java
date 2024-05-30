package org.springboot.kakaologin.service;

import org.springboot.kakaologin.dto.ResponseDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> getKaKaoUserInfo(String authorizeCode);
    void saveUserData(ResponseDto responseDto);
}
