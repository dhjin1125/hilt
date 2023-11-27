package com.example.easy_hiltexample

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val testRepository: TestRepository
) : ViewModel() {

    fun getHelloWorld() : String {
        return testRepository.getHelloWorld()
    }
}