package silptech.developerabhi.recyclerviewandcardview.presenter

import android.util.Log
import silptech.developerabhi.recyclerviewandcardview.R
import silptech.developerabhi.recyclerviewandcardview.interfaces.MyInterfaces
import silptech.developerabhi.recyclerviewandcardview.model.DataModel

class MainPresenter(view: MyInterfaces.DataView) : MyInterfaces.Presenter {
    private var view: MyInterfaces.DataView = view
    var model: DataModel = DataModel("Bangkok post", "This is Bangkok post", R.mipmap.ic_launcher)

    init{
        model.addValue()
    }
    override fun getData(): ArrayList<DataModel> {
        return model.getValue()
        view.initView()

    }


}