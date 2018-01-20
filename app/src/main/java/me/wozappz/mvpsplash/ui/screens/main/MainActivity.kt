package me.wozappz.mvpsplash.ui.screens.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import me.wozappz.mvpsplash.R
import me.wozappz.mvpsplash.di.screens.main.MainScreenModule
import me.wozappz.mvpsplash.utils.app
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreenContract.View {

    @Inject override lateinit var presenter: MainScreenContract.Presenter
    private val component by lazy { app.daggerComponent.plus(MainScreenModule(this)) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.injectTo(this)

        presenter.start()
    }


    override fun displayMessage(msg: String) {
        mTextView.text = msg
    }

    fun onCounterBtnClicked(view: View) {
        presenter.onBtnClicked()
    }
}
