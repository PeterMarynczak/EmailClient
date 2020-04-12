package com.marynczak.controller.services;

import com.marynczak.EmailManager;
import com.marynczak.controller.EmailLoginResult;
import com.marynczak.model.EmailAccount;

public class LoginService {

    EmailAccount emailAccount;
    EmailManager emailManager;

    public LoginService(EmailAccount emailAccount, EmailManager emailManager) {
        this.emailAccount = emailAccount;
        this.emailManager = emailManager;
    }

    public EmailLoginResult login(){

    }
}
