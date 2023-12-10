package com.jiayi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 *
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 123456789L;
    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
