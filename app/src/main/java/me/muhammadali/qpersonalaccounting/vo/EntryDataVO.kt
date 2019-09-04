package me.muhammadali.qpersonalaccounting.vo

data class EntryDataVO(
    var amount: Double,
    var category: String,
    var color: String
) {
    constructor() : this(0.0, "", "#a2a2a2")
}