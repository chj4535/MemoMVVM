package choi.mvvm.memomvvm.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import choi.mvvm.memomvvm.model.entity.MemoEntity

@Dao
interface MemoDao {

    @Query("SELECT * FROM memo ORDER BY id ASC")
    fun getAllmemo(): LiveData<List<MemoEntity>>

    @Query("SELECT * FROM memo ORDER BY id DESC LIMIT 1")
    fun getLstmemo(): MemoEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMemo(memo: MemoEntity)

    @Delete
    fun deleteMemo(memo: MemoEntity)

}