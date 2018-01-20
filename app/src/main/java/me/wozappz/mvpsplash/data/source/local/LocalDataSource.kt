package me.wozappz.mvpsplash.data.source.local

import me.wozappz.mvpsplash.data.model.SampleModel
import me.wozappz.mvpsplash.data.source.DataSource

/**
 * Created by olq on 20.01.18.
 *
 * Contains mocked data for showcase purpose
 */
class LocalDataSource : DataSource {

    private val mockedModels = listOf(
            SampleModel("Hello dear Dev :)"),
            SampleModel("This is an MVP project template..."),
            SampleModel("Make good use of it!"))

    override fun getModel(id: Int) = mockedModels[id]
    override fun getAllModels() = mockedModels
}