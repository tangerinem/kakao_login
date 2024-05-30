package org.springboot.kakaologin.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String phoneNumber;
    private String email;
    private String profileUrl;

    @Builder
    public UserInfo(String userName, String phoneNumber, String email, String profileUrl) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.profileUrl = profileUrl;
    }
}
