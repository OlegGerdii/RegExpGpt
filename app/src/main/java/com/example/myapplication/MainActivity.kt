package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.validateButton)

        button.setOnClickListener {
            val input = editText.text.toString()
            if (StringValidator.isValid(input, 20)) {  // Assuming max length is 20, but can be changed
                Toast.makeText(this, "Valid input!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid input!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
