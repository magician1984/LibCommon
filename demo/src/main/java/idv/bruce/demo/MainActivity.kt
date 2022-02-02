package idv.bruce.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import idv.bruce.base.ActivityImpl
import idv.bruce.base.ServiceImpl
import idv.bruce.base.ViewModelImpl

class MainActivity : ActivityImpl() {
    override val autoStartService : Boolean
        get() = TODO("Not yet implemented")
    override val viewModelList : List<Class<out ViewModelImpl>>?
        get() = TODO("Not yet implemented")
    override val permissions : Array<String>?
        get() = TODO("Not yet implemented")
    override val serviceCls : Class<out ServiceImpl>
        get() = TODO("Not yet implemented")

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun onServiceNotStart() {
        TODO("Not yet implemented")
    }
}