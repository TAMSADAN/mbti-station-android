package com.mbtmi.mbti.data

data class PostInfo(
    var postTitle : String,
    val postContent : String,
    val writerMBTI : String,
    val writtenTime : String,
    val likeCount : Int,
    val commentCount : Int,
    val postCategory : String
)
