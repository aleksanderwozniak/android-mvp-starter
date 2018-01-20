package me.wozappz.mvpsplash.data.source

import me.wozappz.mvpsplash.data.model.SampleModel

/**
 * Created by olq on 20.01.18.
 */
interface DataSource {

    fun getModel(id: Int): SampleModel
    fun getAllModels(): List<SampleModel>
}