package me.muhammadali.qpersonalaccounting.model.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(
    entity = CashEntry::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("id"))]
)
data class Income(@PrimaryKey var id: Long)