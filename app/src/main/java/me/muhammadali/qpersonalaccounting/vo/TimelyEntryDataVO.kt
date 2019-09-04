package me.muhammadali.qpersonalaccounting.vo

data class TimelyEntryDataVO(
    var amount: Double,
    var time: Int
) {
    constructor() : this(0.0, 0)
}