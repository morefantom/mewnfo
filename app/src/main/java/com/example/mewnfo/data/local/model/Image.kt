package com.example.mewnfo.data.local.model

import com.example.mewnfo.data.remote.model.Image as RemoteImage

data class Image(
    val id: String,
    val width: Int,
    val height: Int,
    val url: String
) {
    constructor(remoteImage: RemoteImage) : this(
        id = remoteImage.id,
        width = remoteImage.width,
        height = remoteImage.height,
        url = remoteImage.url
    )
}