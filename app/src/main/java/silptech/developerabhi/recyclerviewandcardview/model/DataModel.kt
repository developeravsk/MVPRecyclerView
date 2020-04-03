package silptech.developerabhi.recyclerviewandcardview.model

import android.provider.ContactsContract
import silptech.developerabhi.recyclerviewandcardview.interfaces.MyInterfaces

class DataModel(var title: String,var  des: String,var image: Int) :MyInterfaces.ModelInterface{


    var arrayList= ArrayList<DataModel>()
    override fun addValue() {
        arrayList.add(DataModel(title, des, image))

    }


    override fun getValue(): ArrayList<DataModel> {
        return arrayList
    }




}