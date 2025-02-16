package com.example.weeklyhandin1.handin3

class Article(
    val author: String,
    var title: String
)
{
    override fun toString (): String {
        return "[author] = $author, [title] = $title"
    }
}