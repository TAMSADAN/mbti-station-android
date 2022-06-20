package com.mbtmi.mbti

import android.content.Intent
import android.os.Bundle
import com.mbtmi.mbti.base.BaseActivity
import com.mbtmi.mbti.databinding.ActivityMainBinding
import com.mbtmi.mbti.view.HomeActivity

class MainActivity : BaseActivity<ActivityMainBinding>({
    ActivityMainBinding.inflate(it)}){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, HomeActivity::class.java)

        binding.bottomNavigation.setOnItemSelectedListener{ item->
            when(item.itemId){
                R.id.home_page -> {
                    startActivity(intent)
                }
                R.id.board_page -> {

                }
                R.id.scrap_page -> {

                }
                R.id.my_info_page -> {

                }
            }
            true
        }
    }


    private fun initBottomNavigationBar(){
        val intent = Intent(this, HomeActivity::class.java)

        binding.bottomNavigation.run{
            setOnItemSelectedListener{ item ->
                when(item.itemId){
                    R.id.home_page -> {
                        startActivity(intent)
                    }
                    R.id.board_page -> {

                    }
                    R.id.scrap_page -> {

                    }
                    R.id.my_info_page -> {

                    }
                }
                true
            }
            selectedItemId = R.id.home_page
        }
    }
}