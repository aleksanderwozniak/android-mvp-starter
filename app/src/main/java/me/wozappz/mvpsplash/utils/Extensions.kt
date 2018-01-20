package me.wozappz.mvpsplash.utils

import android.app.Activity
import me.wozappz.mvpsplash.app.App

/**
 * Created by olq on 20.01.18.
 */

val Activity.app : App
    get() = application as App