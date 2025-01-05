package com.pgedlek.social_media.repositories;

import com.pgedlek.social_media.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
