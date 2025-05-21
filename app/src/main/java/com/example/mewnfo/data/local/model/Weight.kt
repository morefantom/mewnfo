package com.example.mewnfo.data.local.model

import com.example.mewnfo.data.remote.model.Weight as RemoteWeight

data class Weight(
    val imperial: String,
    val metric: String
) {
    constructor(remoteWeight: RemoteWeight) : this(
        imperial = remoteWeight.imperial,
        metric = remoteWeight.metric
    )
}