package com.pets.video.service;

import com.pets.video.data.entity.User;

public interface IUserService {
    public boolean queryUsernameIsExist(String username);

    public User getUser(String username);

    public void saveUser(User user);
}
