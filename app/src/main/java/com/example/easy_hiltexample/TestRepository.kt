package com.example.easy_hiltexample


interface TestRepository {
    fun getHelloWorld () : String
}

class TestRepositoryImpl : TestRepository {
    override fun getHelloWorld(): String {
        return "Hello World!!!"
    }
}