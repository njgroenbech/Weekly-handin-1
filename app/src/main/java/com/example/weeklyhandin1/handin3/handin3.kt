package com.example.weeklyhandin1.handin3


// 1.
// Write a class: Article

// An article has an author and a title

// Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method

// 2.
// Create an interface called FastFood (with appropriate methods) and create a Sandwich class,
// a Pizza class and a class you decide that implements the FastFood interface.

// Add some different Fastfood objects to an array.
// Now iterate through that array and use some of the methods you have created above.

// 2. (New version)
// Create a class that implements the following interface.
// Now create two objects using the class created

// Write a class: RedditPost

// A Reddit post has:
// A date of which is has been posted
// An author
// A balance of upvotes / downvotes
// A Title

// When a new instance of RedditPost is instantiated:
// The current date will be generated.
// The balance of upvotes and downvotes starts at 1.
// The title and author has to be provided by the constructor.
// Ensure all attributes are private, but accesible by getters & setters.
// Implement functionality such that Reddit posts can be sorted by upvotes/downvotes.

// 3.
// Write a class: RedditFrontPage
// The RedditFrontPage has:

// A List of all RedditPosts
// A method in RedditFrontPage deletes a RedditPost from the list, by its index number

// 4.
// Write a program that takes a list of words as input and prints the frequency of each word.



fun main () {
    // Opg 1
    val article1 = Article("John Doe", "How to catch a Beaver")
    val article2 = Article("Jane Doe", "How to catch a Zebra")
    val article3 = Article("Jacob Bisgaard", "How to catch an Elephant")
    val article4 = Article("Thulle", "How to catch a Pokemon")
    val article5 = Article("Joseph", "How to catch a Monkey")

    val arrayListOfAuthorsAndTitles: MutableList<Article> = arrayListOf()
    arrayListOfAuthorsAndTitles.addAll(listOf(article1, article2, article3, article4, article5))

    arrayListOfAuthorsAndTitles.forEach{post -> println(post)}
    println("---")

    // Opg 2 (Blev lavet inden korrekte opgaver blev sat ind)
    val sandwich = Sandwich("Chicken sandwich", "Pesto, Tomato, Chicken, Bread",
        11.99f, false)
    val pizza = Pizza("Pepperoni pizza", "Dough, Cheese, Tomato-paste, Pepperoni",
            14.99f, false)
    val kebab = Kebab("Durumkebab", "Bread, Kebab, Lettuce, Sour cream dressing",
        8.99f, true)

    val arrayListOfMeals: MutableList<FastFood> = arrayListOf() // create empty array that takes fast food objects
    arrayListOfMeals.addAll(listOf(sandwich, pizza, kebab)) // add objects to array

    // call functions to prep meal and serve meal
    arrayListOfMeals.forEach{ meal -> println(meal.prepMeal()); println(meal.serveMeal())}
    println("---")

    // Opg 2 (Ny version)
    val post = RedditPost("Jacob the Chad", "How to be a cool guy", 1)
    val post2 = RedditPost("Jack Daniel", "Funny dog", 2)
    val post3 = RedditPost("Mary Smith", "I like cats", 3)

    for (i in 0..3) {
        post.upVote()
    }
    for (i in 0..2) {
        post2.upVote()
    }
    for (i in 0..10) {
        post3.downVote()
    }

    val postArray: MutableList<RedditPost> = arrayListOf()
    postArray.addAll(listOf(post, post2, post3))

    fun getPostsByVotesDesc (): List<RedditPost> { // function to order posts by votes descending
        return postArray.sortedByDescending{it.getVoteBalance()}
        // getVoteBalance() returns the number of votes for each individual post
    }

    // print each post on its own line
    getPostsByVotesDesc().forEach{redditPost -> println(redditPost)}

    // Opg 3
    println("---")
    val list = RedditFrontPage(postArray) // reusing array from exercise 2
    list.deleteRedditPostByIndex(0)

    // Opg 4

    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")

    // taget fra https://www.baeldung.com/kotlin/frequency-map
    fun checkFrequencyOfWordsInList (listOfWords: List<String>): Map<String, Int> {
        val actualMap = listOfWords.groupingBy { it }.eachCount()
        return actualMap
    }
    val result = checkFrequencyOfWordsInList(words)
    println("---")
    println(result)
    println("---")

    // Opg 5 (unfinished for now)
    val product = Products("Bob", 3)
    val product2 = Products("Sam", 5)
    val product3 = Products("Samuel", 5)


}