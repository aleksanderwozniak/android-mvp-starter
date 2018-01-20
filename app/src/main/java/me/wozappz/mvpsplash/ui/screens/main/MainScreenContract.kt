package me.wozappz.mvpsplash.ui.screens.main

import me.wozappz.mvpsplash.ui.base.BasePresenter
import me.wozappz.mvpsplash.ui.base.BaseView

/**
 * Created by olq on 20.01.18.
 */
interface MainScreenContract {

    interface View: BaseView<Presenter> {
        fun displayMessage(msg: String)
    }

    interface Presenter: BasePresenter {
        fun onBtnClicked()
    }
}