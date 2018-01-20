package me.wozappz.mvpsplash.app

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import me.wozappz.mvpsplash.di.app.AppComponent
import me.wozappz.mvpsplash.di.app.AppModule
import me.wozappz.mvpsplash.di.app.DaggerAppComponent

/**
 * Created by olq on 20.01.18.
 */
class App : Application() {

    val daggerComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }

        LeakCanary.install(this)
    }
}