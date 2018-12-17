package com.github.example.utils

import android.content.Context
import android.widget.Toast
import com.github.example.R

/**
 * The helper function to display "feature not implemented" info. [Development purpose only]
 */
fun notImplemented(context: Context) {
    showToast(context, context.getText(R.string.not_implemented).toString())
}

/**
 * The helper function to display message in Toast
 */
fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}
