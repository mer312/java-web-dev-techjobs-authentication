package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import org.launchcode.javawebdevtechjobsauthentication.models.data.UserRepository;

public class RegisterFormDTO extends LoginFormDTO {

    UserRepository userRepository;

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}
