package me.wozappz.mvpsplash.di.app

import dagger.Component
import me.wozappz.mvpsplash.di.screens.main.MainScreenComponent
import me.wozappz.mvpsplash.di.screens.main.MainScreenModule
import javax.inject.Singleton

/**
 * Created by olq on 20.01.18.
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun plus(mainScreenModule: MainScreenModule): MainScreenComponent
}