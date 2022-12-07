package com.example.hilt_example

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class UserModule {


    @Provides
    @Named("SQL")
    fun getSQLResponce(saveDB: saveDB) : UserRepository{
        return saveDB
    }

    @Provides
    @Named("Firebase")
    fun getFirebase(saveFirebase: saveFirebase):UserRepository{
        return saveFirebase
    }
}