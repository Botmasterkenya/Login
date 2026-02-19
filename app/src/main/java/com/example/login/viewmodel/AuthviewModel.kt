package com.example.login.viewmodel

import androidx.lifecycle.ViewModel
import com.example.login.model.UserModel
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore

class AuthviewModel : ViewModel() {
    private val auth = Firebase.auth

    private val firestore = Firebase.firestore

    fun login(){}

    fun signup(email : String,name : String, password : String, onResult:(Boolean, String?)-> Unit, ){
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener {
                if(it.isSuccessful){
                    var userId = it.result?.user?.uid

                    var userModel = UserModel(name, email, userId!!)
                    firestore.collection("users").document()
                        .set(userModel)
                        .addOnCompleteListener { dbTask->
                            if(dbTask.isSuccessful){
                                onResult(true,null)
                            }else{
                                onResult(false,"Something went wrong")
                            }
                        }


                }else{
                    onResult(false,it.exception?.localizedMessage)
                }
            }

    }
}