package com.pgedlek.social_media.repositories;

import com.pgedlek.social_media.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialUserRepository extends JpaRepository<SocialUser, Long> {
}
