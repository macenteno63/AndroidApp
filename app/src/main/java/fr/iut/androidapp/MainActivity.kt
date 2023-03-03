package fr.iut.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ListAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data : Array<String> = arrayOf("test", "twiter")
        val adapter: CustomAdapter = CustomAdapter(data)
    }
}