package com.github.example.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.github.example.R
import com.github.example.utils.notImplemented
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainFragment : Fragment() {

    private lateinit var toolBar: Toolbar
    private lateinit var floatingButton: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        with(inflater.inflate(R.layout.fragment_main, container, false)) {
            toolBar = findViewById(R.id.toolbar)
            floatingButton = findViewById(R.id.floating_button)
            floatingButton.setOnClickListener {
                // TODO: implement it later
                notImplemented(it.context)
            }
            return this
        }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val activity = (activity as AppCompatActivity)

        activity.setSupportActionBar(toolBar)
        activity.supportActionBar?.title = activity.resources.getString(R.string.app_name)
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}
