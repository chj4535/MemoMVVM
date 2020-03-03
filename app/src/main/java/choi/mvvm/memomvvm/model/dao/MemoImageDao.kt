package choi.mvvm.memomvvm.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import choi.mvvm.memomvvm.model.entity.MemoImageEntity

@Dao
interface MemoImageDao{

    @Query("SELECT * FROM memoimage ORDER BY id")
    fun getAllmemoimage(): LiveData<List<MemoImageEntity>>

    @Query("SELECT * FROM memoimage WHERE memoId IN(:memoId) ORDER BY id ASC LIMIT 1")
    fun getMemothumbnail(memoId: Long?): LiveData<MemoImageEntity>

    @Query("SELECT * FROM memoimage WHERE memoId IN(:memoId) ORDER BY id ASC")
    fun getMemoallimage(memoId: Long?): LiveData<List<MemoImageEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMemoimage(memoImage: MemoImageEntity)

    @Delete
    fun deleteMemoimage(memoImage: MemoImageEntity)

}