package com.shilposts.finnposts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shilposts.finnposts.model.Post;
import com.shilposts.finnposts.repository.PostRepo;
import com.shilposts.finnposts.repository.SearchRepository;

@RestController
@CrossOrigin(origins = "*")
public class PostController
{

    @Autowired
    PostRepo repo;

    @Autowired
    SearchRepository srepo;

    
    
    // henter alle postene og cross origin i tilfele jeg får CORS error
    @GetMapping("/allPosts")
    @CrossOrigin(origins = "*")
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }
    // finner via søk
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }
    // lagrer post
    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }


}
