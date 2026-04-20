package com.cornellappdev.chatter.data.repository

import com.cornellappdev.chatter.data.model.Post
import com.cornellappdev.chatter.data.remote.PostApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostRepository @Inject constructor(
    private val postApiService: PostApiService
) {
    suspend fun getAllPosts(): Result<List<Post>> = runCatching {
        postApiService.getAllPosts().posts

    }
    suspend fun searchPosts(query: String) : Result<List<Post>> = runCatching {
        postApiService.searchPosts(query).posts
    }
}

