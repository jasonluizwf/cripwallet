package com.projetointegrador.cripwallet.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}