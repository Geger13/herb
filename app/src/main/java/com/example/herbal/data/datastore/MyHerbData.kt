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
        name = "Daun Bawang Merah",
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
    ),
    MyHerbData(
        id = "2",
        name = "Daun Betadin",
        sasak_name = "Daun Nyambuq",
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
        image = R.drawable.jambu
    ),
    MyHerbData(
        id = "3",
        name = "Daun Buah Ajaib",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.bawangmerah
    ),
    MyHerbData(
        id = "4",
        name = "Daun Ginseng Jawa",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.buahajaib
    ),
    MyHerbData(
        id = "5",
        name = "Daun Jambu",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.ketepengcina
    ),
    MyHerbData(
        id = "6",
        name = "Daun Jarak",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "7",
        name = "Daun Ketepeng Cina",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "8",
        name = "Daun Kumis Kucing",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "9",
        name = "Daun Kumquat Nagami",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "10",
        name = "Daun Meniran",
        sasak_name = "Daun Meniran",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "11",
        name = "Daun Mimba",
        sasak_name = "Daun Mimba",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "12",
        name = "Daun Nangka",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "13",
        name = "Daun Patah Tulang",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "14",
        name = "Daun Pepaya",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "15",
        name = "Daun Pukul Empat",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "16",
        name = "Daun Sage",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "17",
        name = "Daun Sembung",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "18",
        name = "Daun Sirih",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "19",
        name = "Daun Sirsak",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "20",
        name = "Daun Tin Ara",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "21",
        name = "Daun Ubi Jalar",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "22",
        name = "Katumpangan",
        sasak_name = "Daun Bawang",
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
        image = R.drawable.jarak
    )
)