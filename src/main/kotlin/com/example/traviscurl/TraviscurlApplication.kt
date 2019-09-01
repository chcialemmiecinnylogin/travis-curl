package com.example.traviscurl

import java.io.File

fun main(args: Array<String>) {
    File(args[0]).readText().let {
        File(args[2]).writeText(it)
    }
}
