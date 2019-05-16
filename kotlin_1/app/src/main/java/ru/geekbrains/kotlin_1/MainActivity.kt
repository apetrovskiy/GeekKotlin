package ru.geekbrains.kotlin_1

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.viewState().observe(this, Observer { value ->
              Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
        })
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = viewModel.viewState().value
    }

    // item 7 doesn't work
    fun onClick(view: View) {
        findViewById<TextView>(R.id.textView2).text =
            findViewById<TextView>(R.id.textView2).text.toString() + "_clicked"
    }
}
