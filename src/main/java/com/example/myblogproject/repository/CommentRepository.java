package com.example.myblogproject.repository;

import com.example.myblogproject.entity.Comment;
import com.example.myblogproject.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    Page<Comment>findByPost(Post post, Pageable pageable);

    List<Comment>findCommentsByPostId(long postId);
}

