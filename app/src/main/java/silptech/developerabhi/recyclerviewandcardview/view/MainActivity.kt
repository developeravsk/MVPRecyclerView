package silptech.developerabhi.recyclerviewandcardview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import silptech.developerabhi.recyclerviewandcardview.R
import silptech.developerabhi.recyclerviewandcardview.adapter.MyAdapter
import silptech.developerabhi.recyclerviewandcardview.interfaces.MyInterfaces
import silptech.developerabhi.recyclerviewandcardview.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MyInterfaces.DataView {
    private var presenter: MyInterfaces.Presenter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter=MainPresenter(this)
    }

    override fun initView() {
        rv.layoutManager=LinearLayoutManager(this)
        val data=presenter!!.getData()
        val myAdapter=MyAdapter(data, this)
        rv.adapter=myAdapter
    }

}
