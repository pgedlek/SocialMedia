package com.pgedlek.social_media.controllers;

import com.pgedlek.social_media.models.SocialUser;
import com.pgedlek.social_media.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SocialController {
    @Autowired
    private SocialService socialService;

    @GetMapping("/social/users")
    public ResponseEntity<List<SocialUser>> getUsers() {
        return new ResponseEntity<>(socialService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/social/users")
    public ResponseEntity<SocialUser> saveUser(@RequestBody SocialUser socialUser) {
        return new ResponseEntity<>(socialService.saveUser(socialUser), HttpStatus.CREATED);
    }

    @DeleteMapping("/social/users/{socialUserId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long socialUserId) {
        SocialUser deletedUser = socialService.deleteUser(socialUserId);
        return new ResponseEntity<>("Deleted successfully", HttpStatus.OK);
    }
}
