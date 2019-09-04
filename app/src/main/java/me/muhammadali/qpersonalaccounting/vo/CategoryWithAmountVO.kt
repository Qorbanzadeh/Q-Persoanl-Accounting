package me.muhammadali.qpersonalaccounting.vo

import me.muhammadali.qpersonalaccounting.util.toFractionString

data class CategoryWithAmountVO(
        var id: Int,
        var name: String,
        var color: String,
        var amount: Double
) {
    constructor() : this(0, "", "#a2a2a2", 0.0)

    val _amount: String
        get() = if (amount > 0) amount.toFractionString() else ""

    val shortName: String
        get() = name.toUpperCase().take(2)

    override fun toString(): String {
        return name
    }
}