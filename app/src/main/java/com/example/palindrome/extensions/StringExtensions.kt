package com.example.palindrome.extensions

import java.util.*

fun String.isPalindrome(): Boolean {
    return this.toLowerCase(Locale.getDefault()) == this.toLowerCase(Locale.getDefault()).reversed()
}