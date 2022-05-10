package com.mstar004.cleanarchcodekiparo.presentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.mstar004.cleanarchcodekiparo.R
import com.mstar004.cleanarchcodekiparo.app.App
import com.mstar004.cleanarchcodekiparo.data.repository.UserRepositoryImpl
import com.mstar004.cleanarchcodekiparo.data.storage.SharedPreference
import com.mstar004.cleanarchcodekiparo.di.AppComponent
import com.mstar004.cleanarchcodekiparo.domain.model.UserName
import org.koin.androidx.viewmodel.ext.android.viewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var vmFactory: MainViewModelFactory

    private lateinit var vm: MainViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (applicationContext as App).appComponent.inject(this)

        Log.e("AAA", "Activity created ")

        vm = ViewModelProvider(this, vmFactory).get(MainViewModel::class.java)

        val tv = findViewById<TextView>(R.id.tv)
        val edit = findViewById<EditText>(R.id.editData)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnGet = findViewById<Button>(R.id.btnGet)

        vm.result.observe(this) {
            tv.text = it
        }

        btnSave.setOnClickListener {
            val text = edit.text.toString()
            vm.save(text = text)
        }

        btnGet.setOnClickListener {
            vm.load()
        }

    }
}