package org.springboot.kakaologin.repository;

import org.springboot.kakaologin.data.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<UserInfo, Long> {
}
