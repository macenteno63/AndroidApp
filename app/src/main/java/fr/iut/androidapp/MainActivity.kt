package fr.iut.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data : Array<String> = arrayOf("test", "twitter")
        val adapter: CustomAdapter = CustomAdapter(data)

        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            Toast.makeText(this, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }


}