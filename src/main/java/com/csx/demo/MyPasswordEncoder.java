package com.csx.demo;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @author: csx
 * @Date: 2018-07-10
 */
public class MyPasswordEncoder implements PasswordEncoder{
    @Override
    public String encode(CharSequence charSequence) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.encodePassword(charSequence.toString(),"123456");
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.isPasswordValid(s,charSequence.toString(),"123456");
    }
}
