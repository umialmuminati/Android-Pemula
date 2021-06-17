package com.example.kpoplist.kpop

import com.example.kpoplist.R

object KpopData {
    private val groupNames = arrayOf("BTS",
                                    "Aespa",
                                    "IU",
                                    "Itzy",
                                    "NCT",
                                    "Seventeen",
                                    "Stray Kids",
                                    "The Boyz",
                                    "Twice",
                                    "Tomorrow x Together")

    private val agencyNames = arrayOf("HYBE Entertainment",
                                    "SM Entertainment",
                                    "EDAM Entertainment",
                                    "JYP Entertainment",
                                    "SM Entertainment",
                                    "Pledis Entertainment",
                                    "JYP Entertainment",
                                    "Cre.ker Entertainment",
                                    "JYP Entertainment",
                                    "HYBE Entertainment")

    private val groupLogo = intArrayOf(R.drawable.bts_logo,
                                    R.drawable.aespa_logo,
                                    R.drawable.iu_logo,
                                    R.drawable.itzy_logo,
                                    R.drawable.nct_logo,
                                    R.drawable.seventeen_logo,
                                    R.drawable.skz_logo,
                                    R.drawable.the_boyz_logo,
                                    R.drawable.twice_logo,
                                    R.drawable.txt_logo)

    private val groupImages = arrayOf("android.resource://" + "com.example.kpoplist" + "/" + R.drawable.bts_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.aespa_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.iu_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.itzy1_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.nct1_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.svtn_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.skz_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.the_boyz_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.twice1_image,
        "android.resource://" + "com.example.kpoplist" + "/" + R.drawable.txt1_image)

    private val groupDetail = arrayOf("13 Juni 2013\n"+
                                    "HYBE Entertainment\n"+
                                    "Hip Hop, POP, R&B, EDM\n"+
                                    "MOTS:7, MOTS:Persona, LS:Tear\n",
        "17 November 2020\n"+
                "SM Entertainment\n"+
                "Hip Hop, EDM\n"+
                "Black Mamba, Forever, Next Level\n",
        "18 September 2008\n"+
                "EDAM Entertainment\n"+
                "R&B, Soul\n"+
                "LILAC, Pallete, Last Fantasy, etc..\n",
        "12 Februari 2019\n"+
                "JYP Entertainment\n"+
                "POP, EDM\n"+
                "Not Shy, Guess Who, IT'z ICY, etc..\n",
        "04 April 2016\n"+
                "SM Entertainment\n"+
                "Hip Hop, R&B, EDM\n"+
                "Resonance Pt.1, Resonance Pt.2\n",
        "24 Agustus 2015\n"+
                "Pledis Entertainment\n"+
                "Hip Hop, POP, R&B, EDM\n"+
                "An Ode, Love and Letter, Teen Age\n",
        "13 Maret 2018\n"+
                "JYP Entertainment\n"+
                "Hip Hop, POP, R&B, EDM\n"+
                "All In, Go Live, SKZ2020, etc..\n",
        "06 Desember 2017\n"+
                "Cre.ker Entertainment\n"+
                "Hip Hop, POP, EDM\n"+
                "Breaking Dawn, REVEAL, Chase\n",
        "19 September 2013\n"+
                "JYP Entertainment\n"+
                "POP, Dance-POP, EDM\n"+
                "Eyes Wide Open, BDZ, Twicetagram\n",
        "04 Maret 2019\n"+
                "HYBE Entertainment\n"+
                "Hip Hop, POP, R&B, EDM\n"+
                "Freeze, Blue Hour, Eternity, etc..\n")

    val listData: ArrayList<Kpop>
        get() {
            val list = arrayListOf<Kpop>()
            for (position in groupNames.indices) {
                val kpop = Kpop()
                kpop.name = groupNames[position]
                kpop.agencyName = agencyNames[position]
                kpop.photoLogo = groupLogo[position]
                kpop.photoGroup = groupImages[position]
                kpop.groupDetail = groupDetail[position]
                list.add(kpop)
            }
            return list
        }
}