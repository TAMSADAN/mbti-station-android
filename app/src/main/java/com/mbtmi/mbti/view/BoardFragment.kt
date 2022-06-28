package com.mbtmi.mbti.view

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
import com.mbtmi.mbti.R
import com.mbtmi.mbti.base.BaseFragment
import com.mbtmi.mbti.databinding.FragmentBoardBinding
import kotlin.math.abs

// 2022.06.26 신승민 작성
class BoardFragment : BaseFragment<FragmentBoardBinding>(R.layout.fragment_board){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initScrollChange()
    }

    private fun initScrollChange(){
        val toolbarConstraintLayout = binding.toolbarConstraintLayout
        val appBarLayout = binding.appBarLayout

        toolbarConstraintLayout.alpha = 0.0f

        appBarLayout.addOnOffsetChangedListener(OnOffsetChangedListener { appBarLayout, verticalOffset ->
            val totalOffset = appBarLayout.totalScrollRange
            val offset = abs(verticalOffset)
            var ratio = 0.0f // 0: 펼침
            if (offset != 0) {
                ratio = offset.toFloat() / totalOffset.toFloat()
            }
            toolbarConstraintLayout.alpha = (ratio - 0.5f) * 2 + 0.1f
            Log.d(TAG, "initScrollChange: $ratio")
        })
    }
}