package com.mbtmi.mbti

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.mbtmi.mbti.base.BaseActivity
import com.mbtmi.mbti.databinding.ActivityMainBinding

// 2022.06.26 신승민 네비게이션 연결
class MainActivity : BaseActivity<ActivityMainBinding>({
    ActivityMainBinding.inflate(it)}) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 네비게이션들을 담는 호스트
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment

        // 네비게이션 컨트롤러
        val navController = navHostFragment.navController

        // 바텀 네비게이션과 네비게이션 묶어줌
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController)
    }
}