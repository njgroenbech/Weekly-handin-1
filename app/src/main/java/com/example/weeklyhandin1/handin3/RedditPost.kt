package com.example.weeklyhandin1.handin3
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class RedditPost(
    private val author: String,
    private val title: String,
    private val postId: Int
)
{
    init {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
        val dateTime: String = "Date of post: " + current.format(formatter) + " - Time Zone: GMT +1"
        val dateTimeWithPostId: String = "POSTID: $postId, " + dateTime
        println(dateTimeWithPostId)
    }

    private var voteBalance: Int = 1

    fun getVoteBalance (): Int {
        return voteBalance
    }

    fun upVote () {
        voteBalance += 1
        println("Vote balance for POSTID: $postId is now: $voteBalance")
    }

    fun downVote () {
        voteBalance -= 1
        println("Vote balance POSTID: $postId is now: $voteBalance")
    }

    override fun toString (): String {
        return "POSTID: $postId, Author: $author, Title: $title, Vote balance = $voteBalance"
    }
}