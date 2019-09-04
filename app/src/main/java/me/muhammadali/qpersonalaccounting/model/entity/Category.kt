package me.muhammadali.qpersonalaccounting.model.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["name"],
    unique = true)]
)
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,
    var color: String,
    var type: Type
) {
    enum class Type { EXPENSE, INCOME }

    constructor() : this(0, "", "#a2a2a2", Type.EXPENSE)

    override fun toString(): String {
        return name
    }
}