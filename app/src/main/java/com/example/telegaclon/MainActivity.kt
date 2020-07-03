package com.example.telegaclon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telegaclon.ui.fragments.ChatsFragment
import com.example.telegaclon.databinding.ActivityMainBinding
import com.example.telegaclon.ui.objects.AppDrawer

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolBar: androidx.appcompat.widget.Toolbar



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()


    }

    private fun initFunc() {
        setSupportActionBar(mToolBar)
        mAppDrawer.create()
        supportFragmentManager.beginTransaction()
            .replace(R.id.dataContainer,
                ChatsFragment()
            ).commit()

    }


    private fun initFields() {
        mToolBar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolBar)
    }
}

