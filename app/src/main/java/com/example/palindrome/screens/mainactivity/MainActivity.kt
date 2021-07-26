package com.example.palindrome.screens.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.palindrome.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListeners()
    }

    private fun setupListeners() {
        check_btn.setOnClickListener { onCheckBtnClicked() }
    }

    private fun onCheckBtnClicked() {
        val text = text_field_et.text.toString()
        val isTextPalindrome = viewModel.isTextPalindrome(text)

        if (isTextPalindrome) {
            is_palindrome_result_tv.text = getString(R.string.text_is_palindrome, text)
        } else {
            is_palindrome_result_tv.text = getString(R.string.text_is_not_palindrome, text)
        }
    }
}