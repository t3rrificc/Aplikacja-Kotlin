//package com.example.zdejciaapp
//
//import android.content.Intent
//import android.graphics.Color
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.ImageView
//import android.widget.Toast
//import com.google.android.material.textfield.TextInputEditText
//
//class Menu : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_menu)
//
//        val buttonlogin = findViewById<Button>(R.id.loginButton)
//        val user = findViewById<TextInputEditText>(R.id.login_id)
//        val password = findViewById<TextInputEditText>(R.id.password_id)
//
//
//        buttonlogin.setOnClickListener{
//            val username = user.text.toString().trim()
//            val pass = password.text.toString().trim()
//            if (username.isEmpty()){
//                user.error = "Enter username"
//                user.requestFocus()
//            }else if(pass.isEmpty()) {
//                password.error = "Enter password"
//                password.requestFocus()
//            }
//            else if(username=="filip" && pass =="filip"){
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//            }
//            else{
//                val text = "login or password is incorrect"
//                val duration = Toast.LENGTH_SHORT
//                val toast = Toast.makeText(this, text, duration)
//                password.clearFocus()
//                toast.show()
//            }
//
//        }
//
//
//    }
//
//}