package org.springboot.kakaologin.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ResponseDto {
    private String userName;
    private String phoneNumber;
    private String email;
    private String profileUrl;


}
