package jg.apps.dagger_hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.DefineComponent
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponentManager::class)
object AppModule {


    @Singleton
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is a string we will inject"

    @Singleton
    @Provides
    @Named("String2")
    fun provideTestString2() = "This is a string we will inject as well"
}