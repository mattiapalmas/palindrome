package com.example.palindrome.extensions

fun String.isPalindrome() : Boolean {
    return this.lowercase() == this.lowercase().reversed()
}