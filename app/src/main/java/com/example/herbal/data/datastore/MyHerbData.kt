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
        sasak_name = "Daun Bawang",
        desc = "Daun bawang merah, sering juga disebut daun bawang atau scallion, adalah bagian daun dari tanaman bawang merah (Allium cepa var. aggregatum) atau jenis bawang lainnya yang memiliki daun hijau panjang berlubang dengan pangkal berwarna putih atau kemerahan. Daun ini memiliki aroma yang khas dan rasa yang lebih ringan dibandingkan umbi bawang merah. Teksturnya renyah saat segar dan menjadi lembut saat dimasak. Daun bawang merah adalah bahan populer dalam berbagai masakan di seluruh dunia sebagai sayuran, bumbu, atau garnis.\n" +
                "\n" +
                "Manfaat:\n" +
                "\n" +
                "Sumber Nutrisi – Kaya akan vitamin K (penting untuk pembekuan darah dan kesehatan tulang), vitamin C (antioksidan untuk meningkatkan imunitas), dan vitamin A (baik untuk kesehatan mata). Juga mengandung folat, kalsium, dan kalium.\n" +
                "Meningkatkan Imunitas Tubuh – Kandungan vitamin C dan antioksidan lainnya seperti quercetin membantu memperkuat sistem kekebalan tubuh dan melindungi sel dari kerusakan akibat radikal bebas.\n" +
                "Menjaga Kesehatan Jantung – Mengandung senyawa seperti allicin (juga ditemukan pada bawang putih) dan flavonoid yang dapat membantu menurunkan kadar kolesterol jahat (LDL), menjaga tekanan darah tetap stabil, dan mengurangi risiko penyakit jantung.\n" +
                "Mendukung Kesehatan Pencernaan – Sebagai sumber serat pangan, daun bawang membantu melancarkan pencernaan, mencegah sembelit, dan mendukung pertumbuhan bakteri baik di usus (prebiotik).\n" +
                "Potensi Anti-Kanker – Beberapa penelitian menunjukkan bahwa sayuran dari keluarga Allium (termasuk daun bawang) mengandung senyawa organosulfur yang dapat membantu mengurangi risiko beberapa jenis kanker.\n" +
                "Menjaga Kesehatan Tulang – Kandungan vitamin K dan kalsium berperan penting dalam menjaga kepadatan dan kekuatan tulang.\n" +
                "Mengontrol Kadar Gula Darah – Beberapa senyawa dalam daun bawang dapat membantu meningkatkan sensitivitas insulin dan mengontrol kadar gula darah, bermanfaat bagi penderita diabetes.\n" +
                "Mencegah Peradangan – Sifat anti-inflamasi dari beberapa senyawa di dalamnya dapat membantu mengurangi peradangan dalam tubuh.\n" +
                "Menjaga Kesehatan Mata – Vitamin A dan karotenoid seperti lutein dan zeaxanthin di dalamnya baik untuk melindungi mata dari kerusakan dan menjaga penglihatan yang baik.\n" +
                "Daun bawang merah umumnya digunakan segar sebagai taburan, dicampurkan dalam salad, atau dimasak dalam berbagai hidangan seperti sup, tumisan, telur dadar, dan lain-lain.",
        image = R.drawable.daun_bawang
    ),
    MyHerbData(
        id = "2",
        name = "Daun Betadin",
        sasak_name = "Daun Jarak",
        desc = "Daun Betadin, yang umumnya merujuk pada tanaman Jarak Pagar (Jatropha curcas), adalah tanaman perdu yang dikenal karena getahnya sering dimanfaatkan sebagai obat luka tradisional. Tanaman ini memiliki daun bercangap dengan getah berwarna putih susu yang keluar saat bagian tanaman dipatahkan. Jarak Pagar mudah tumbuh di berbagai kondisi tanah dan sering dijadikan pagar hidup.\n" +
                "\n" +
                "Manfaat (terutama dari getah dan daun Jarak Pagar):\n" +
                "\n" +
                "Antiseptik dan Penyembuh Luka – Getah Jarak Pagar sangat dikenal untuk menghentikan pendarahan pada luka sayat atau goresan, mencegah infeksi, dan mempercepat proses pengeringan serta penyembuhan luka.\n" +
                "Mengatasi Peradangan Kulit – Daun yang ditumbuk atau getahnya dapat membantu mengurangi bengkak, gatal, dan peradangan akibat gigitan serangga atau kondisi kulit tertentu seperti eksim ringan.\n" +
                "Mengobati Sakit Gigi dan Sariawan – Getah Jarak Pagar kadang diteteskan pada gigi berlubang untuk meredakan sakit atau dioleskan pada sariawan (dengan hati-hati dan tidak tertelan banyak karena sifat toksiknya).\n" +
                "Mengatasi Keseleo atau Memar – Daun Jarak Pagar yang dilayukan di atas api dapat ditempelkan pada area yang keseleo atau memar untuk membantu mengurangi nyeri dan bengkak.\n" +
                "Mengatasi Masalah Kulit Lain – Secara tradisional digunakan untuk mengatasi kurap, panu, dan beberapa infeksi jamur kulit lainnya dengan mengoleskan getah atau tumbukan daunnya.\n" +
                "Perhatian Penting: Biji Jarak Pagar sangat beracun jika tertelan dan dapat menyebabkan keracunan serius. Penggunaan internal bagian tanaman Jarak Pagar lainnya juga harus dihindari atau dilakukan dengan sangat hati-hati dan pengetahuan yang benar karena potensi toksisitasnya. Penggunaan utama yang relatif aman adalah secara topikal (luar) untuk luka dan masalah kulit.",
        image = R.drawable.daun_betadin
    ),
    MyHerbData(
        id = "3",
        name = "Daun Buah Ajaib",
        sasak_name = "Daun Buah Ajaib",
        desc = "Daun Buah Ajaib berasal dari tanaman Buah Ajaib (Synsepalum dulcificum), semak atau pohon kecil yang berasal dari Afrika Barat. Tanaman ini memiliki daun hijau memanjang, rimbun, dan mengkilap. Meskipun buahnya lebih terkenal karena kemampuannya mengubah persepsi rasa asam menjadi manis berkat kandungan miraculin, daunnya juga telah diteliti dan digunakan secara tradisional di beberapa daerah.\n" +
                "\n" +
                "Manfaat (Daun Buah Ajaib - Synsepalum dulcificum):\n" +
                "\n" +
                "Kaya Antioksidan – Daun Buah Ajaib mengandung berbagai senyawa fenolik dan flavonoid yang berfungsi sebagai antioksidan, membantu melindungi sel-sel tubuh dari kerusakan akibat radikal bebas.\n" +
                "Potensi Mengontrol Gula Darah – Beberapa penelitian awal pada hewan menunjukkan bahwa ekstrak daun Buah Ajaib dapat memiliki efek hipoglikemik, yaitu membantu menurunkan kadar gula darah, sehingga berpotensi bermanfaat bagi penderita diabetes (penelitian lebih lanjut pada manusia masih diperlukan).\n" +
                "Anti-inflamasi – Seperti banyak daun tanaman lainnya, daun Buah Ajaib diduga memiliki sifat anti-inflamasi yang dapat membantu mengurangi peradangan dalam tubuh.\n" +
                "Penggunaan Tradisional – Di daerah asalnya di Afrika Barat, daunnya secara tradisional digunakan untuk berbagai tujuan pengobatan, meskipun dokumentasi ilmiahnya mungkin terbatas dibandingkan buahnya.\n" +
                "Potensi Hepatoprotektif – Ada indikasi dari studi bahwa ekstrak daunnya dapat membantu melindungi organ hati.\n" +
                "Perhatian: Informasi mengenai manfaat daun Buah Ajaib sebagian besar masih dalam tahap penelitian awal atau berdasarkan penggunaan tradisional. Konsultasikan dengan ahli kesehatan sebelum menggunakan tanaman herbal untuk pengobatan. Fokus utama tanaman ini tetap pada buahnya yang unik.",
        image = R.drawable.daun_buah_ajaib
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
        image = R.drawable.daun_ginseng_jawa
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
        image = R.drawable.jambu
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
        image = R.drawable.ketepengcina
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
        image = R.drawable.daun_kumis_kucing
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
        image = R.drawable.daun_kumquat_nagami
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
        image = R.drawable.daun_meniran
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
        image = R.drawable.daun_mimba
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
        image = R.drawable.daun_nangka
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
        image = R.drawable.daun_patah_tulang
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
        image = R.drawable.daun_pepaya
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
        image = R.drawable.daun_pukul_empat
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
        image = R.drawable.daun_sage
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
        image = R.drawable.daun_sembung
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
        image = R.drawable.sirih
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
        image = R.drawable.daun_sirsak
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
        image = R.drawable.daun_tin_ara
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
        image = R.drawable.daun_ubi_jalar
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
        image = R.drawable.katumpangan
    )
)