package com.pluralsight.blog.data;

import org.springframework.data.rest.core.annotation.RestResource;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {}