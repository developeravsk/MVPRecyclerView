package silptech.developerabhi.recyclerviewandcardview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_layout.view.*
import silptech.developerabhi.recyclerviewandcardview.R
import silptech.developerabhi.recyclerviewandcardview.model.DataModel

class MyAdapter(val arrayList: ArrayList<DataModel>?, val context: Context):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
        fun bindItems(model: DataModel){
            itemView.titleTv.text=model.title
            itemView.descriptionTv.text=model.des
            itemView.imageIv.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val v=LayoutInflater.from(parent.context).inflate(R.layout.single_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList!!.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(arrayList?.get(position)!!)
    }
}