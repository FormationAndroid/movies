package com.example.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = mutableListOf<Contact>()
        contacts.add(Contact("John", 42, "http://i.imgur.com/DvpvklR.png", true))
        contacts.add(Contact("Marie", 32, "http://i.imgur.com/DvpvklR.png", false))
        contacts.add(Contact("Christinne", 55, "http://i.imgur.com/DvpvklR.png", true))

        val adapter = ContactsAdapter(contacts)
        recyclerView.adapter = adapter

    }
}