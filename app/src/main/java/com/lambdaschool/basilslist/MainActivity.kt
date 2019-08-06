package com.lambdaschool.basilslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val userList = mutableListOf<User>()
    val itemList = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateData()
        populateData()
    }

    fun createTextView(item: Item, user: User): TextView {
        val view = TextView(this)

        view.text = "${item.name} - ${item.price}, ${user.location}, ${user.reputation}"
        view.textSize = 24f

        /*<TextView android:layout_width="match_parent" android:layout_height="wrap_content"
        android:text="Item Name = $100, New York, 5"
        android:textSize="24dp"/>*/

        return view
    }

    fun populateData() {
        for (i in 0..9) {
            val view = createTextView(itemList[i], userList[i])
            list_view.addView(view)
        }
    }

    fun generateData() {
        userList.add(User("Strzelce Krajeńskie",1))
        userList.add(User("Vendas de Galizes",1))
        userList.add(User("Qiping",4))
        userList.add(User("Calibishie",4))
        userList.add(User("Serzedo",3))
        userList.add(User("Jabranti",3))
        userList.add(User("Gongxi",1))
        userList.add(User("Moholm",1))
        userList.add(User("Všestary",5))
        userList.add(User("Wantian",1))

        itemList.add(Item("Wine - Red Marechal Foch", 82.46f,"Kayveo"))
        itemList.add(Item("Juice - Clam 46 Oz",125.01f,"Cogibox"))
        itemList.add(Item("Wine - Red Marechal Foch", 82.46f,"Kayveo"))
        itemList.add(Item("Juice - Clam 46 Oz",125.01f,"Cogibox"))
        itemList.add(Item("Wine - Red Marechal Foch", 82.46f,"Kayveo"))
        itemList.add(Item("Juice - Clam 46 Oz",125.01f,"Cogibox"))
        itemList.add(Item("Wine - Red Marechal Foch", 82.46f,"Kayveo"))
        itemList.add(Item("Juice - Clam 46 Oz",125.01f,"Cogibox"))
        itemList.add(Item("Wine - Red Marechal Foch", 82.46f,"Kayveo"))
    }
}
