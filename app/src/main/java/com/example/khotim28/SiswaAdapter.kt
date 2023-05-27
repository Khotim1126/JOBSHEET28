package com.example.khotim28

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SiswaAdapter(private val data: ArrayList<Siswa>?): RecyclerView.Adapter<SiswaAdapter.SiswaViewHolder>() {
    class SiswaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.NamaSiswa)
        private val nis = itemView.findViewById<TextView>(R.id.NisSiswa)
        private val jk = itemView.findViewById<TextView>(R.id.JkSiswa)
        private val kelas = itemView.findViewById<TextView>(R.id.KelasSiswa)
        fun bind(get: Siswa) {
            nama.text = get.nama
            nis.text = get.nis
            jk.text = get.jk
            kelas.text = get.kelas
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiswaViewHolder {
        return SiswaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_siswa, parent, false))
    }

    override fun getItemCount(): Int {
        return  data?.size ?: 0
    }

    override fun onBindViewHolder(holder: SiswaViewHolder, position: Int) {
        holder.bind( data?.get(position) ?: Siswa( "", "", "", ""))
    }
}