package com.busrayalcin.pearlsofistanbulkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.busrayalcin.pearlsofistanbulkotlin.databinding.ActivityDetailsBinding
import com.busrayalcin.pearlsofistanbulkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<LandMarks>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarkList = ArrayList<LandMarks>()

        val blue_mosque = LandMarks("Blue Mosque",R.drawable.blue_mosque)
        val cistern = LandMarks("Cistern",R.drawable.cistern)
        val galata_tower = LandMarks("Galata Tower",R.drawable.galata_tower)
        val hagia_sophia = LandMarks("Hagia Sophia",R.drawable.hagia_sophia)
        val maiden_tower = LandMarks("Maiden Tower",R.drawable.maiden_tower)
        val taksim_square = LandMarks("Taksim Square",R.drawable.taksim_square)

        landmarkList.add(blue_mosque)
        landmarkList.add(cistern)
        landmarkList.add(galata_tower)
        landmarkList.add(hagia_sophia)
        landmarkList.add(maiden_tower)
        landmarkList.add(taksim_square)

        binding.recyclerView.layoutManager =LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

        /*
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landMarks -> landMarks.name })
        binding.listView.adapter = adapter
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(i))
            startActivity(intent)
        }
         */
    }
}