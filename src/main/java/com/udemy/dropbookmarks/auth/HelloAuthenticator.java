package com.udemy.dropbookmarks.auth;

import com.google.common.base.Optional;
import com.udemy.dropbookmarks.core.User;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

public class HelloAuthenticator implements Authenticator<BasicCredentials, User>{
    @Override
    public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException {
        if ("p@ssw0rd".equals(credentials.getPassword())) {
            return Optional.of(new User());
        } else {
            return Optional.absent();
        }
    }
}
