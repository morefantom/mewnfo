package com.example.mewnfo.data.local.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mewnfo.data.local.Constants
import com.example.mewnfo.data.local.model.Image
import com.example.mewnfo.data.local.model.Weight

@Entity(tableName = Constants.CAT_TABLE_NAME)
data class Cat (
    @PrimaryKey val id: String,
    @Embedded(prefix = "weight_") val weight: Weight,
    val name: String,
    val cfaUrl: String? = null,
    val vetstreetUrl: String? = null,
    val vcahospitalsUrl: String? = null,
    val temperament: String,
    val origin: String,
    val countryCodes: String,
    val countryCode: String,
    val description: String,
    val lifeSpan: String,
    val indoor: Int,
    val lap: Int? = null,
    val altNames: String,
    val adaptability: Int,
    val affectionLevel: Int,
    val childFriendly: Int,
    val dogFriendly: Int,
    val energyLevel: Int,
    val grooming: Int,
    val healthIssues: Int,
    val intelligence: Int,
    val sheddingLevel: Int,
    val socialNeeds: Int,
    val strangerFriendly: Int,
    val vocalisation: Int,
    val experimental: Int,
    val hairless: Int,
    val natural: Int,
    val rare: Int,
    val rex: Int,
    val suppressedTail: Int,
    val shortLegs: Int,
    val wikipediaUrl: String,
    val hypoallergenic: Int,
    val referenceImageId: String,
    @Embedded(prefix = "image_") val image: Image? = null
)