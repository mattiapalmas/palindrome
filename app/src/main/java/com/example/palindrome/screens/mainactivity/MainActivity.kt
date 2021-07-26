package com.example.palindrome.screens.mainactivity

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
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
        text_field_et.addTextChangedListener { clearResult() }
    }

    private fun onCheckBtnClicked() {
        val text = text_field_et.text.toString()
        val isTextPalindrome = viewModel.isTextPalindrome(text)

        if (isTextPalindrome) {
            is_palindrome_result_tv.text = getString(R.string.text_is_palindrome, text)
            is_palindrome_result_tv.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        } else {
            is_palindrome_result_tv.text = getString(R.string.text_is_not_palindrome, text)
            is_palindrome_result_tv.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }
    }

    private fun clearResult() {
        is_palindrome_result_tv.text = ""
        is_palindrome_result_tv.setBackgroundColor(Color.TRANSPARENT)
    }
}