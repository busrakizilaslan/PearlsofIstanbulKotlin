package com.busrayalcin.pearlsofistanbulkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busrayalcin.pearlsofistanbulkotlin.databinding.ActivityMainBinding
import com.busrayalcin.pearlsofistanbulkotlin.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList : ArrayList<LandMarks>) : RecyclerView.Adapter<LandmarkAdapter.LandMarksHolder>() {

    class LandMarksHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarksHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandMarksHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarksHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}