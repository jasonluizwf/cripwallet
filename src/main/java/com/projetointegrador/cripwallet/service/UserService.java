package com.projetointegrador.cripwallet.service;

import com.projetointegrador.cripwallet.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}