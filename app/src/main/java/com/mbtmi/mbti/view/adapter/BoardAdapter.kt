//package com.mbtmi.mbti.view.adapter
//
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.mbtmi.mbti.data.PostInfo
//import com.mbtmi.mbti.databinding.ItemPostFreeBinding
//
//// 2022.07.05 신승민 수정 서버에서 어떤식으로 구분해서 줄지에 따라 결정해야 할듯
//
//class BoardAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    val postList = mutableListOf<PostInfo>()
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        when(viewType){
//            1 -> {
//
//            }
//            2 -> {
//
//            }
//            3 -> {
//
//            }
//            else -> {
//
//            }
//        }
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//
//    }
//
//    override fun getItemCount(): Int = postList.size
//
//    override fun getItemViewType(position: Int): Int {
//        if(postList[position].postCategory == "일반")
//            return 1
//
//        else if(postList[position].postCategory == "투표")
//            return 2
//
//        else if(postList[position].postCategory == "밸런스")
//            return 3
//
//        else
//            return -1
//    }
//
//    inner class NormalViewHolder(private val binding: ItemPostFreeBinding) : RecyclerView.ViewHolder(binding.root){
//        fun onBind(postInfo: PostInfo){
//
//        }
//    }
//}