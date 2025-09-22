package com.korshl10.section01.persistence;

import com.korshl10.section01.domain.User;

import java.util.List;

public interface UserStorage {
    void saveUsers(List<User> users);
    List<User> loadUsers();
}
