package choi.mvvm.memomvvm.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import choi.mvvm.memomvvm.model.dao.MemoDao
import choi.mvvm.memomvvm.model.dao.MemoImageDao
import choi.mvvm.memomvvm.model.entity.MemoEntity
import choi.mvvm.memomvvm.model.entity.MemoImageEntity

@Database(version = 1,entities = arrayOf(MemoEntity::class, MemoImageEntity::class),exportSchema=false)
abstract class MemoDatabase: RoomDatabase(){

    abstract fun memoDao() : MemoDao
    abstract fun memoImageDao() : MemoImageDao

    companion object{
        private var INSTANCE: MemoDatabase? = null //싱글톤용

        fun getInstance(context: Context): MemoDatabase? {
            if (INSTANCE == null) {
                synchronized(MemoDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        MemoDatabase::class.java, "memo.db")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }

}