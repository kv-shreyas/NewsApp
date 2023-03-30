package com.androiddevs.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.androiddevs.newsapp.R
import com.androiddevs.newsapp.databinding.FragmentArticleBinding
import com.androiddevs.newsapp.ui.NewsActivity
import com.androiddevs.newsapp.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {
    lateinit var viewModel: NewsViewModel
    private lateinit var binding: FragmentArticleBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentArticleBinding.inflate(layoutInflater)
        viewModel = (activity as NewsActivity).viewModel

    }
}