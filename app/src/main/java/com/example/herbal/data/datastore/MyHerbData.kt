package com.example.herbal.data.datastore

import com.example.herbal.R

data class MyHerbData(
    val id : String,
    val name : String,
    val sasak_name : String,
    val desc : String,
    val image : Int
)

val myHerbData = listOf(
    MyHerbData(
        id = "1",
        name = "Daun Sirih",
        sasak_name = "Daun Lekoq",
        desc = "Daun sirih (Piper betle) adalah daun dari tanaman merambat yang banyak digunakan dalam pengobatan tradisional. Daun ini memiliki aroma khas dan mengandung senyawa seperti flavonoid, tanin, dan minyak atsiri yang bermanfaat bagi kesehatan.\n" +
                "\n" +
                "Manfaat:\n" +
                "\n" +
                "Antiseptik alami – Membantu mengatasi infeksi dan mempercepat penyembuhan luka.\n" +
                "Menjaga kesehatan mulut – Digunakan untuk berkumur guna mengatasi bau mulut dan sariawan.\n" +
                "Mengurangi peradangan – Efektif dalam meredakan jerawat, iritasi kulit, dan gangguan pernapasan.\n" +
                "Menstabilkan kadar gula darah – Dapat membantu penderita diabetes dengan mengontrol gula darah.\n" +
                "Melancarkan pencernaan – Membantu mengatasi gangguan pencernaan seperti perut kembung dan sembelit.\n" +
                "Daun sirih banyak dimanfaatkan dalam bentuk rebusan, ekstrak minyak, atau dikunyah langsung.",
        image = R.drawable.sirih
    )
)