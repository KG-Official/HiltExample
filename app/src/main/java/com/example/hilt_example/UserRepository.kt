package com.example.hilt_example

import android.util.Log
import javax.inject.Inject


const val TAG = "Data"
interface UserRepository {
    fun saveUser(email:String,password:String)
}

class saveDB @Inject constructor () : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"Data Saved in DB")
    }

}

class saveFirebase @Inject constructor() :UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"Data Saved in Firebase")
    }

}