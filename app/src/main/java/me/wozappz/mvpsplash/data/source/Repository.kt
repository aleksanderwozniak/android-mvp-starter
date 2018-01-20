package me.wozappz.mvpsplash.data.source

import me.wozappz.mvpsplash.data.model.SampleModel
import javax.inject.Inject

/**
 * Created by olq on 20.01.18.
 */
class Repository @Inject constructor(
        private val localDataSource: DataSource)
    : DataSource {

    var cachedModels: List<SampleModel> = listOf()
    var cacheIsDirty = false

    var clickCounter = 0
        set(value) { field = if (value >= 3 || value < 0) 0 else value }


    override fun getModel(id: Int): SampleModel {
        if (cachedModels.isEmpty() || cachedModels.size < id || cacheIsDirty) {
            loadDataToCache()
        }

        return cachedModels[id]
    }

    override fun getAllModels(): List<SampleModel> {
        if (cachedModels.isEmpty() || cacheIsDirty) {
            loadDataToCache()
        }

        return cachedModels
    }

    private fun loadDataToCache() {
        cachedModels = localDataSource.getAllModels()
        cacheIsDirty = false
    }
}