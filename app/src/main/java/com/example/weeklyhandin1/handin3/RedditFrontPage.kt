package com.example.weeklyhandin1.handin3

class RedditFrontPage(
    private val listOfRedditPosts: MutableList<RedditPost>
)
{
    fun deleteRedditPostByIndex (indexToRemove: Int): Boolean {
        if (indexToRemove in 0 until listOfRedditPosts.size) {

            listOfRedditPosts.removeAt(indexToRemove) // remove post at index

            println("Removed post at index: $indexToRemove")
            listOfRedditPosts.forEach{println(it)} // print object on its own line
            return true
        } else {
            println("Invalid index, not in scope of listOfRedditPosts size")
            println("Printing original list")
            listOfRedditPosts.forEach{println(it)} // print object on its own line
            return false
        }
    }
}