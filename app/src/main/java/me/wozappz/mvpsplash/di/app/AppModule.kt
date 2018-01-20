package me.wozappz.mvpsplash.di.app

import dagger.Module
import dagger.Provides
import me.wozappz.mvpsplash.app.App
import me.wozappz.mvpsplash.data.source.DataSource
import me.wozappz.mvpsplash.data.source.Repository
import me.wozappz.mvpsplash.data.source.local.LocalDataSource
import javax.inject.Singleton

/**
 * Created by olq on 20.01.18.
 */
@Module
class AppModule(private val app: App) {

    @Provides
    @Singleton
    fun provideApp(): App = app

    @Provides
    @Singleton
    fun provideLocalDataSource(): DataSource = LocalDataSource()

    @Provides
    @Singleton
    fun provideRepo(localDataSource: DataSource): Repository = Repository(localDataSource)
}