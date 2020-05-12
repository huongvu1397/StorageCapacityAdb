package com.devhwang1312.filemanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Utils.get()
        val exe = ShellExecuter()
        val command = "df -h"
        val outp = exe.Executer(command)
        Log.e("HVV1312","xxxx : $outp")

    }
}
