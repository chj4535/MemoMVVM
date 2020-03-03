package choi.mvvm.memomvvm.data

import androidx.lifecycle.LiveData
import choi.mvvm.memomvvm.model.entity.MemoEntity
import choi.mvvm.memomvvm.model.entity.MemoImageEntity

class memoFull(memo: LiveData<MemoEntity>, imageList: LiveData<List<MemoImageEntity>>){
    var meme:LiveData<MemoEntity> = memo
    var imageList:LiveData<List<MemoImageEntity>> = imageList
}