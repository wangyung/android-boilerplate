package com.github.example.utils

import android.content.res.AssetManager
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule

val objectMapper = ObjectMapper().registerModule(KotlinModule())

fun loadJsonFromAsset(assets: AssetManager, name: String): String =
    assets.open(name).use {
        val buffer = ByteArray(it.available())
        it.read(buffer)
        String(buffer, Charsets.UTF_8)
    }
