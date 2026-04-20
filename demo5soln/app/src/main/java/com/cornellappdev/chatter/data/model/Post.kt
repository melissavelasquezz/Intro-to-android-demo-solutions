package com.cornellappdev.chatter.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//TODO: Define the Post data class with appropriate fields and any other necessary data classes@Serializable
@Serializable
data class PostResponse(
    @SerialName("posts")
    val posts: List<Post>,

    @SerialName("total")
    val total: Int,

    @SerialName("skip")
    val skip: Int,

    @SerialName("limit")
    val limit: Int
)

@Serializable
data class Post(
    @SerialName("id")
    val id: Int,

    @SerialName("title")
    val title: String,

    @SerialName("body")
    val body: String,

    @SerialName("tags")
    val tags: List<String>,

    @SerialName("reactions")
    val reactions: Reactions,

    @SerialName("views")
    val views: Int,

    @SerialName("userId")
    val userId: Int
)

@Serializable
data class Reactions(
    @SerialName("likes")
    val likes: Int,

    @SerialName("dislikes")
    val dislikes: Int
)