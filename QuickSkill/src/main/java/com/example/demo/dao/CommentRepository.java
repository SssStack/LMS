package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
