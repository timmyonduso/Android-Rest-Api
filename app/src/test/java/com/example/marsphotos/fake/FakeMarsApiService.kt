package com.example.marsphotos.fake

import com.example.marsphotos.data.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService

class FakeMarsApiService : MarsApiService {

    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }

}