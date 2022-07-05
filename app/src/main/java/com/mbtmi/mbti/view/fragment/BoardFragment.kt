package com.mbtmi.mbti.view.fragment

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
import com.mbtmi.mbti.R
import com.mbtmi.mbti.base.BaseFragment
import com.mbtmi.mbti.databinding.FragmentBoardBinding
import kotlin.math.abs

// 2022.06.26 신승민 작성
// 2022.07.01 신승민 수정
class BoardFragment : BaseFragment<FragmentBoardBinding>(R.layout.fragment_board){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initScrollChange()
    }

    // scroll 할 때 변하는 offset을 이용해서 상단 view 변하도록 하는 함수
    private fun initScrollChange(){
        val toolbarConstraintLayout = binding.toolbarConstraintLayout
        val appBarLayout = binding.appBarLayout
        val menuConstraintLayout = binding.menuConstraintLayout

        toolbarConstraintLayout.alpha = 0.0f

        appBarLayout.addOnOffsetChangedListener(OnOffsetChangedListener { appBarLayout, verticalOffset ->
            val totalOffset = appBarLayout.totalScrollRange
            val offset = abs(verticalOffset)
            var ratio = 0.0f
            if (offset != 0) {
                ratio = offset.toFloat() / totalOffset.toFloat()
            }
            toolbarConstraintLayout.alpha = (ratio - 0.5f) * 2 + 0.1f
            menuConstraintLayout.alpha = (ratio - 0.5f) * (-2.0f)
        })
    }
}