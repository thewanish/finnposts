package com.shilposts.finnposts.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.shilposts.finnposts.model.Post;

// extender til mongo sin repo og sier hvilken type data du vil hente og primær nøkkelen som string

public interface PostRepo extends MongoRepository<Post,String>
{

}