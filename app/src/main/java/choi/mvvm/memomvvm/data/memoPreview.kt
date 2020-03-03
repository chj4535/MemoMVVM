package choi.mvvm.memomvvm.data

import androidx.lifecycle.LiveData
import choi.mvvm.memomvvm.model.entity.MemoEntity
import choi.mvvm.memomvvm.model.entity.MemoImageEntity

class memoPreview(memo:LiveData<MemoEntity>,previewImage: LiveData<MemoImageEntity>){
    var memo : LiveData<MemoEntity> = memo
    var previewImage : LiveData<MemoImageEntity> =previewImage
}