package dev.owiti.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun displaNmaes(){
        var names= listOf("Kayitete","ESther","Bree")
        var namesAdapter=NameRecyclerViewAdapter(namesList)
        binding.rvNames.layoutManager=LinearLayoutManager(this,)
        binding.rvNames.adapter=nameAdapter
    }
}
