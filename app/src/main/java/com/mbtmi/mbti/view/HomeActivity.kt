package com.mbtmi.mbti.view

import android.os.Bundle
import com.mbtmi.mbti.base.BaseActivity
import com.mbtmi.mbti.databinding.ActivityHomeBinding

class HomeActivity:BaseActivity<ActivityHomeBinding>({
    ActivityHomeBinding.inflate(it) }){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}