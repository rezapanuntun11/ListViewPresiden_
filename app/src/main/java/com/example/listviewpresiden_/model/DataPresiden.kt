package com.example.listviewpresiden_.model

import com.example.listviewpresiden_.R

object DataPresiden {
    private val presidenNama = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val presidenDetail = arrayOf(
        "Ir Soekarno yang biasa dipanggil Bung Karno, lahir di Blitar, Jawa Timur, 6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970",
        "Soeharto lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921 dan meninggal pada tanggal 27 Januari 2008 di RSPP Jakarta",
        "Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936 dan meninggal pada tanggal 11 September 2019, RSPAD Gatot Soebroto, Jakarta",
        "Abdurrahman Wahid lahir di Denanyar Jombang Jawa Timur pada tanggal 4 Agustus 1940 dan meninggal pada tanggal 30 Desember 2009 di Jakarta",
        "Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947, beliau adalah putri sulung dari Ir Soekarno dan merupakan presiden wanita pertama di Indonesia",
        "Susilo Bambang Yudhoyono lahir di Pacitan, Jawa Timur 9 September 1949, Ia adalah Presiden pertama di Indonesia yang dipilih melalui jalur pemilu",
        "Joko Widodo terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014 dan kembali terpilih bersama Wakil Presiden Ma'ruf Amin dalam Pemilu Serentak 2019"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listPresiden: ArrayList<Presiden>
    get() {
        val list = arrayListOf<Presiden>()
        for (position in presidenNama.indices){
            val presiden = Presiden()
            presiden.name = presidenNama[position]
            presiden.detail = presidenDetail[position]
            presiden.poster = presidenPoster[position]
            list.add(presiden)
        }
        return list
    }
}