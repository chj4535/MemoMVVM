package choi.mvvm.memomvvm.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memoimage")
data class MemoImageEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Long?,

    @ColumnInfo(name = "memoId")
    var memoId: Long?,

    @ColumnInfo(name = "url")
    var url: String

) {
    constructor() : this(null, 0, "")
}