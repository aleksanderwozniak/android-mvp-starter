package me.wozappz.mvpsplash.ui.screens.main

import me.wozappz.mvpsplash.data.source.Repository
import javax.inject.Inject

/**
 * Created by olq on 20.01.18.
 */
class MainPresenter @Inject constructor(
        private val view: MainScreenContract.View,
        private val repo: Repository)
    : MainScreenContract.Presenter {


    override fun start() {
        displayMessage(repo.clickCounter)
    }

    override fun onBtnClicked() {
        repo.clickCounter++
        displayMessage(repo.clickCounter)
    }

    private fun displayMessage(counter: Int) {
        val msg = getMessage(counter)
        view.displayMessage(msg)
    }

    private fun getMessage(counter: Int) = repo.getModel(counter).msg
}