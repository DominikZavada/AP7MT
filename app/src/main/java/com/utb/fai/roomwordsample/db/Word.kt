package com.utb.fai.roomwordsample.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class Word {
    @Entity(tableName = "word_table")
    data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)
}