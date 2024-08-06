package com.shilposts.finnposts.repository;


import java.util.List;

import com.shilposts.finnposts.model.Post;
//tar string text som input returnerer med post som matcher teksten
public interface SearchRepository {

    List<Post> findByText(String text);

}