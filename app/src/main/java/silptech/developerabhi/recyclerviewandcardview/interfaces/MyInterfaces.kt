package silptech.developerabhi.recyclerviewandcardview.interfaces

import silptech.developerabhi.recyclerviewandcardview.model.DataModel

interface MyInterfaces {
    interface DataView{
        fun initView()

    }
    interface Presenter{
        fun getData(): ArrayList<DataModel>

    }

    interface ModelInterface {
        fun addValue()
        fun getValue():ArrayList<DataModel>

    }
}