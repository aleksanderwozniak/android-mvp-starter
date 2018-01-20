package me.wozappz.mvpsplash.di.screens.main

import dagger.Subcomponent
import me.wozappz.mvpsplash.di.scopes.ActivityScope
import me.wozappz.mvpsplash.ui.screens.main.MainActivity

/**
 * Created by olq on 20.01.18.
 */
@ActivityScope
@Subcomponent(modules = [MainScreenModule::class])
interface MainScreenComponent {

    fun injectTo (activity: MainActivity)
}