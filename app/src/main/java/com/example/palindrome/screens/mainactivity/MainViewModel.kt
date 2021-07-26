package com.example.palindrome.screens.mainactivity

import androidx.lifecycle.ViewModel
import com.example.palindrome.extensions.isPalindrome

class MainViewModel : ViewModel() {

    fun isTextPalindrome(text: String): Boolean {
        return text.isPalindrome()
    }
}