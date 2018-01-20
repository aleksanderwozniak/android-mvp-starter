package me.wozappz.mvpsplash.di.screens.main

import dagger.Module
import dagger.Provides
import me.wozappz.mvpsplash.data.source.Repository
import me.wozappz.mvpsplash.di.scopes.ActivityScope
import me.wozappz.mvpsplash.ui.screens.main.MainPresenter
import me.wozappz.mvpsplash.ui.screens.main.MainScreenContract

/**
 * Created by olq on 20.01.18.
 */
@Module
class MainScreenModule(private val view: MainScreenContract.View) {

    @ActivityScope
    @Provides
    fun provideMainPresenter(repo: Repository): MainScreenContract.Presenter = MainPresenter(view, repo)
}