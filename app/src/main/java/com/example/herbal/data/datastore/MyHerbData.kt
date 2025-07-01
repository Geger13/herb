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
        desc = "Daun bawang merah, sering juga disebut scallion atau green onion (Allium fistulosum atau var. aggregatum), memiliki daun hijau panjang berlubang dengan aroma khas dan rasa ringan. Teksturnya renyah saat segar dan lembut saat dimasak. Umumnya digunakan segar sebagai garnis, atau dimasak dalam sup, tumisan, dan hidangan lainnya.\n\n" +
                "Manfaat:\n" +
                "- 🧠 Antioksidan & Anti‑inflamasi – Kaya akan senyawa seperti quercetin, kaempferol, allicin, dan thiosulfinates yang mampu menetralisir radikal bebas dan meredakan peradangan.\n" +
                "- ❤️ Kesehatan Jantung – Senyawa sulfur dan flavonoid membantu menurunkan LDL dan menstabilkan tekanan darah, mendukung kesehatan kardiovaskular.\n" +
                "- 🛡️ Meningkatkan Imunitas – Kandungan vitamin C bersama antioksidan lain memperkuat sistem imun tubuh.\n" +
                "- 🔢 Kaya Vitamin & Mineral – Sumber vitamin A (beta‑karoten), B1, B2, B3, B6, B9, C, K; serta serat, kalsium, dan kalium.\n" +
                "- 🦠 Antimikroba & Antikanker – Organosulfur dan quercetin menunjukkan aktivitas melawan patogen dan sel kanker dalam studi in vitro/in vivo.\n" +
                "- 🍽️ Prebiotik & Pencernaan – Mengandung fruktan dan serat pangan yang mendukung bakteri baik di usus dan melancarkan BAB.\n\n" +
                "Penggunaan:\n" +
                "Dapat dikonsumsi segar sebagai taburan, salad, atau dimasak dalam sup, tumisan, telur dadar, dan berbagai hidangan khas Asia seperti miso, pancake scallion, dll.\n\n" +
                "Sumber:\n" +
                "- Foods (2023) – Kim et al.: *Green Onion (Allium fistulosum): An Aromatic Vegetable Crop...*\n" +
                "- Food & Nutrition Sciences (2025) – Nergui, Deleg & Chen: *The Study of the Antioxidant Activity...*\n" +
                "- Journal of Chinese Herbal Remedies (2025) – *A Comprehensive Review on Allium fistulosum*\n" +
                "- Frontiers in Nutrition (2021) – *Recent Advances in Bioactive Compounds...*\n" +
                "- PMC (2022) – *Therapeutic Uses and Pharmacological Properties of Shallot...*",
        image = R.drawable.daun_bawang
    ),
    MyHerbData(
        id = "2",
        name = "Daun Betadin",
        sasak_name = "Daun Jarak",
        desc = "Daun Betadine (Jatropha multifida L.), juga dikenal sebagai Jarak Tintir atau Coralbush, adalah tumbuhan semidrier tropis dengan daun menjari, batang berkayu bergetah putih, dan sering ditanam sebagai pagar atau tanaman obat.\n\n" +
                "Manfaat dan Kandungan:\n" +
                "- 🦠 **Antibakteri & Antijamur** – Ekstrak getah/batang/daun mengandung saponin, tannin, flavonoid, labaditin, multifidol dan biobollein yang efektif menghambat pertumbuhan Pseudomonas aeruginosa (zona hambat ~12,7 mm pada konsentrasi 50 %) dan Staphylococcus aureus.\n" +
                "- 🧼 **Antibiofilm** – Jus daun memperlihatkan kemampuan mengurangi pembentukan biofilm oleh Escherichia coli pada kateter urine karena kandungan flavonoid dan fenolik.\n" +
                "- 🛡️ **Penyembuh Luka & Koagulasi** – Getah batang digunakan tradisional untuk mengeringkan luka eksternal, efektif sebanding dengan povidone‑iodine, serta diyakini membantu koagulasi darah dan mencegah infeksi.\n" +
                "- ⚠️ **Beracun jika dikonsumsi** – Daun dan getah bersifat racun pada konsumsi internal; biji dilaporkan menyebabkan keracunan (muntah, sakit perut) pada anak-anak.\n\n" +
                "Penggunaan:\n" +
                "Digunakan topikal: getah/ekstrak dioleskan langsung pada luka, ruam, atau area gatal serta diaplikasikan pada kateter atau luka sebagai antiseptik dan antibiofilm. Tidak boleh dikonsumsi secara internal.\n\n" +
                "Sumber (5 tahun terakhir):\n" +
                "- Rusdy & Damanik (2022, F1000Research): “Antibacterial activity of Betadine stem extract on Pseudomonas aeruginosa” – konsentrasi optimal 50 %, inhibisi ~12,7 mm.\n" +
                "- Gunardi et al. (2025, InaJBCS): “Antibiofilm activity of betadine leaf juice” terhadap E. coli.\n" +
                "- Hanafi et al. (2022, RJPT): Analisis profil GC‑MS daun santir menunjukkan kehadiran flavonoid dan senyawa bioaktif lainnya.\n",
        image = R.drawable.daun_betadin
    ),
    MyHerbData(
        id = "3",
        name = "Daun Buah Ajaib",
        sasak_name = "Daun Buah Ajaib",
        desc = "Daun dari tanaman Buah Ajaib (*Synsepalum dulcificum*), semak tropis asli Afrika Barat, berwarna hijau mengkilap, memanjang sekitar 5–10 cm, dan tumbuh berseling.\n\n" +
                "Manfaat & Kandungan:\n" +
                "- 🍋 **Mengubah Rasa Asam Menjadi Manis** – Mengandung protein mirakulin yang menempel di reseptor lidah, membuat rasa asam seperti lemon menjadi manis selama 15–60 menit.\n" +
                "- 🩸 **Menurunkan Risiko Diabetes & Mendukung Berat Badan** – Kalori sangat rendah, baik untuk penderita diabetes karena tidak menaikkan gula darah; dalam studi hewan, meningkatkan sensitivitas insulin dan membantu menurunkan berat badan.\n" +
                "- 🍀 **Memperbaiki Selera Pasien Kemoterapi** – Membantu pasien kanker memulihkan selera makan dengan mengubah rasa pahit menjadi manis.\n" +
                "- ❤️ **Menurunkan Kolesterol & Anti‑oksidan** – Ekstrak biji/daun mengandung flavonoid, terpenoid, dan triterpenoid yang terbukti menurunkan kolesterol plasma pada percobaan hewan & punya efek anti-kanker.\n\n" +
                "Penggunaan:\n" +
                "Ambil daun atau buah segar; kunyah buahnya sampai lidah terkena mirakulin, lalu konsumsi makanan/sayur asam agar terasa manis. Daun juga bisa dijadikan teh herbal.\n\n" +
                "Sumber (5 tahun terakhir):\n" +
                "- Alodokter (2024): manfaat seperti antidiabetes, hipokolesterolemia, dan kemoterapi.\n" +
                "- Linisehat.com (2022): flavonoid, terpenoid, episyringaresinol sebagai antioksidan & antikanker.\n" +
                "- Socfindo Conservation: deskripsi daun & praktik penggunaannya di India, Jepang :contentReference.\n" +
                "- Healthline (2021): mirakulin sebagai glycoprotein pengubah rasa\n" +
                "- Huang W. et al. (2020, *Journal Food Biochem*): studi penurunan kolesterol oleh ekstrak.",
        image = R.drawable.daun_buah_ajaib
    ),
    MyHerbData(
        id = "4",
        name = "Daun Bugenvil Putih",
        sasak_name = "Daun Bugenvil Putih",
        desc = "Daun dari tanaman Bugenvil (*Bougainvillea glabra*), tanaman hias populer yang dikenal dengan seludang bunga berwarna cerah. Daunnya sendiri berwarna hijau, berbentuk oval atau sedikit lonjong, dan memiliki tekstur yang agak kaku.\n\n" +
                "Manfaat & Kandungan:\n" +
                "- 🤧 **Meredakan Batuk & Melegakan Tenggorokan** – Secara tradisional, air rebusan daun bugenvil digunakan sebagai ekspektoran untuk membantu mengencerkan dan mengeluarkan dahak.\n" +
                "- 🩹 **Mempercepat Penyembuhan Luka** – Ekstrak daunnya memiliki sifat antiseptik dan anti-inflamasi yang dapat membantu membersihkan luka dari bakteri dan mengurangi peradangan.\n" +
                "- 🩸 **Menjaga Keseimbangan Gula Darah** – Beberapa penelitian awal pada hewan menunjukkan bahwa ekstrak daun bugenvil berpotensi membantu menurunkan kadar gula darah karena kandungan senyawa seperti pinitol.\n" +
                "- 🌿 **Kaya Antioksidan** – Mengandung senyawa seperti flavonoid dan tanin yang berfungsi sebagai antioksidan untuk melawan radikal bebas dalam tubuh.\n\n" +
                "Penggunaan:\n" +
                "Cara paling umum adalah dengan membuat rebusan (teh herbal). Ambil sekitar 10-15 lembar daun segar yang sudah dicuci bersih, rebus dengan 2-3 gelas air hingga airnya menyusut menjadi sekitar satu gelas. Saring dan minum selagi hangat.\n\n" +
                "Sumber (5 tahun terakhir):\n" +
                "- Halodoc (2023): Menjelaskan manfaat daun kembang kertas untuk batuk, diabetes, dan tekanan darah tinggi.\n" +
                "- Narayana, et al. (2022, *Journal of Pharmaceutical Negative Results*): Studi tentang aktivitas farmakologis Bougainvillea glabra, termasuk sifat antidiabetik.\n" +
                "- Siahaan, et al. (2021, *Jurnal Farmasi dan Ilmu Kefarmasian Indonesia*): Penelitian mengenai aktivitas antibakteri ekstrak daun bugenvil terhadap bakteri penyebab infeksi kulit.\n" +
                "- KlikDokter (2024): Membahas potensi daun bugenvil sebagai obat herbal untuk berbagai penyakit.",
        image = R.drawable.daun_bugenvil_putih
    ),
    MyHerbData(
        id = "5",
        name = "Daun Cocor Bebek",
        sasak_name = "Daun Cocor Bebek",
        desc = "Daun dari tanaman Cocor Bebek (*Kalanchoe pinnata*), sejenis sukulen yang sangat unik karena dapat menumbuhkan tunas baru dari lekukan di pinggir daunnya. Daunnya tebal, berdaging, dan berair, dengan tepi bergerigi khas.\n\n" +
                "Manfaat & Kandungan:\n" +
                "- 🤕 **Anti-radang & Pereda Nyeri** – Efektif untuk mengobati sakit kepala, demam, nyeri otot, dan bisul. Daun yang ditumbuk sering digunakan sebagai kompres (tapal) untuk mengurangi peradangan dan nyeri.\n" +
                "- 🩹 **Mempercepat Penyembuhan Luka** – Sifat antibakteri dan antiseptiknya membantu mencegah infeksi pada luka sayat, luka bakar ringan, dan memar. Cukup tempelkan daun yang sudah dilumatkan pada area yang terluka.\n" +
                "- 🤒 **Menurunkan Demam** – Secara tradisional, daun cocor bebek yang ditumbuk halus ditempelkan di dahi sebagai kompres alami untuk membantu menurunkan suhu tubuh saat demam.\n" +
                "- 🌿 **Kaya Senyawa Aktif** – Mengandung flavonoid, glikosida, alkaloid, dan saponin yang memberinya sifat anti-inflamasi, analgesik (pereda nyeri), dan antimikroba.\n\n" +
                "Penggunaan:\n" +
                "Paling umum digunakan secara eksternal (pemakaian luar). Cuci bersih beberapa lembar daun, lumatkan atau tumbuk hingga halus, lalu tempelkan sebagai kompres pada bagian tubuh yang sakit (dahi, luka, bisul, atau area memar).\n\n" +
                "Sumber (5 tahun terakhir):\n" +
                "- Siloam Hospitals (2024): Merangkum manfaat cocor bebek untuk demam, sakit kepala, dan peradangan.\n" +
                "- Alodokter (2023): Menjelaskan kandungan dan khasiat daun cocor bebek sebagai obat herbal, terutama untuk luka dan peradangan.\n" +
                "- Ferreira, R. T., et al. (2021, *Journal of Ethnopharmacology*): Studi ilmiah yang mengonfirmasi aktivitas anti-inflamasi dan penyembuhan luka dari ekstrak Kalanchoe pinnata.\n" +
                "- Kementan RI (Badan Litbang Pertanian): Mengakui cocor bebek sebagai salah satu tanaman obat potensial di Indonesia.",
        image = R.drawable.daun_cocor_bebek
    ),
    MyHerbData(
        id = "6",
        name = "Daun Ginseng Jawa",
        sasak_name = "Daun Ginseng Jawa",
        desc = "Daun Ginseng Jawa (*Talinum paniculatum*) adalah tanaman obat dan sayuran berbentuk berkas daun hijau, kaya serat dan nutrisi (vitamin C, zat besi, kalsium, polifenol, flavonoid, saponin).\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🦠 **Antibakteri** – Ekstrak etanol 70 % daun mengandung flavonoid, fenol, saponin, tanin; menununjukkan aktivitas antibakteri kuat terhadap *Shigella dysenteriae* (zona hambat up to 11,26 mm) dan terhadap *E. coli* (zona hambat hingga 22 mm pada 80 %).\n" +
                "- 🧪 **Antioksidan** – Ekstrak etanol menunjukkan aktivitas DPPH hingga ~44 % (IC50 ≈ 273 µg/ml), dan ekstrak air panas dosis segar 55 % (IC50 ≈ 181 µg/ml); kaya fenolik ~171 mg/g bb kering.\n" +
                "- 💪 **Aphrodisiak & Laktagog** – Studi pada tikus: meningkatkan libido, bobot testis, dan kualitas sperma; serta meningkatkan produksi ASI ibu menyusui (peningkatan ~13 %).\n" +
                "- 🧬 **Anti-stres & Stamina** – Ekstrak akar meningkatkan aktivitas SOD (enzim antioksidan) dalam model fisik tikus; daun juga mengandung oleanane‑type saponin seperti talinumoside I.\n\n" +
                "Penggunaan:\n" +
                "Diseduh sebagai teh herbal untuk mengatasi infeksi ringan, meningkatkan imun, libido, produksi ASI, dan stamina; atau digunakan dalam bentuk ekstrak etanol atau salep topikal antibakteri.\n\n" +
                "Sumber (≤5 tahun terakhir):\n" +
                "- Uji antibakteri ekstrak etanol daun (2023) – aktivitas melawan *S. dysenteriae* (zona hambat hingga 11,26 mm).\n" +
                "- Cendana Medical Journal (2022) – aktivitas terhadap *E. coli* (zona hambat 15–22 mm).\n" +
                "- Hermina Health Sci. J. (2021) – efek aphrodisiak pada tikus ♂ .\n" +
                "- Repository Stfi (2024) – efek laktagog (ASI +13 %) sesuai dosis.\n" +
                "- Qabas Journals (2022) – peningkatan SOD & stamina pada model tikus.",
        image = R.drawable.daun_ginseng_jawa
    ),
    MyHerbData(
        id = "7",
        name = "Daun Jambu",
        sasak_name = "Daun Nyambuq",
        desc = "Daun jambu biji (*Psidium guajava*) adalah daun hijau memanjang, mengandung senyawa bioaktif seperti flavonoid (quercetin, kaempferol), asam fenolik, tanin, terpenoid, alkaloid dan saponin.\n\n" +
                "Manfaat dan Aktivitas:\n" +
                "- 🦠 **Antimikroba & Antibakteri** – Ekstrak daun efektif menekan bakteri patogen termasuk *Acinetobacter baumannii* resisten, *E. coli*, *Staphylococcus aureus*, dan pembentukan biofilm pada patogen respirasi.\n" +
                "- 🍃 **Antioksidan & Anti‑inflamasi** – Kaya DPPH-scavenging (IC₅₀ ~89–180 µg/ml), menangkal radikal bebas, mendukung penurunan stres oksidatif dan peradangan.\n" +
                "- 🍽️ **Antidiarh & Gastroprotektif** – Dekok daun aman dan efektif mengurangi diare umum pada studi klinis, bekerja melalui aktivitas antibakteri, anti‑sekretori, dan anti‑motilitas.\n" +
                "- 🩸 **Hipoglikemik & Metabolik** – Menghambat α‑glucosidase, menurunkan gula darah puasa dan postprandial, serta memperbaiki profil lipid dan tekanan darah di uji klinik dan hewan.\n" +
                "- 🦷 **Kesehatan Mulut & Periodontitis** – Gel 3 % lokal daun meningkatkan kondisi gingiva, mengurangi plak, nanah, dan kedalaman kantung periodontal dibanding SRP saja.\n\n" +
                "Penggunaan:\n" +
                "Umumnya digunakan sebagai teh (seduhan atau dekok), pulp gel topikal untuk periodontitis, atau encapsulated extract sebagai bahan antimikroba/antioksidan dalam makanan, kosmetik, dan nutraceuticals :contentReference[oaicite:7]{index=7}.\n\n" +
                "Sumber (≤ 5 tahun terakhir):\n" +
                "- Ekstrak antimikroba terhadap XDR *A. baumannii* (PMC, 2025).\n" +
                "- Molecules (2025) – Huynh et al.: ‘Bioactive Compounds…’ menguraikan kandungan fenolik & aplikasinya.\n" +
                "- Clinical review (2025 Pharmacy Reports): efek hipoglikemik, lipid, tekanan darah, kesehatan mulut dan pencernaan.\n" +
                "- Studi periodontitis (Journal Int Oral Health, 2021): efikasi gel 3 % daun.\n" +
                "- Frontiers in Nutrition (2023): dekok daun aman & efektif atasi diare.",
        image = R.drawable.jambu
    ),
    MyHerbData(
        id = "8",
        name = "Daun Jarak",
        sasak_name = "Daun Jaraq",
        desc = "Daun jarak (*Jatropha curcas*) kaya akan senyawa bioaktif seperti flavonoid, tanin, phenolic acids dan terpenoid. .\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🧫 **Antimikroba** – Ekstrak daun dan getah menunjukkan aktivitas antibakteri terhadap *Klebsiella pneumoniae* dan patogen lainnya, inhibisi signifikan hingga ~40 mm zona hambat.\n" +
                "- ⚙️ **Pengawet Alami** – Ekstrak 16 % efektif mempertahankan kesegaran ikan segar selama 14 jam (TPC & evaluasi sensorik).\n" +
                "- 🛡️ **Antioksidan & Antibakteri komprehensif** – Studi 2025 menegaskan kedua aktivitas melalui analisis fitokimia & bioaktivitas.\n\n" +
                "Penggunaan:\n" +
                "Ekstrak etanol atau n‑hexana dipakai sebagai bahan antimikroba dalam pengawetan makanan atau formulasi farmasi/topikal.\n\n" +
                "Sumber:\n" +
                "- *Proc. Natl. Acad. Sci. India* (2025): studi fitokimia & antibakteri & antioksidan.\n" +
                "- PMC (2024): aktivitas melawan *K. pneumoniae* dan format food-grade.\n" +
                "- Rahim Husain et al. (2021): pengawet ikan segar dengan ekstrak 16 %.",
        image = R.drawable.jarak
    ),
    MyHerbData(
        id = "9",
        name = "Daun Keji Beling",
        sasak_name = "Daun Keji Beling",
        desc = "Daun dari tanaman Keji Beling (*Strobilanthes crispus*), sebuah perdu yang berasal dari Madagaskar hingga Asia Tenggara. Namanya secara harfiah berarti 'batu pecah', merujuk pada khasiat utamanya. Daunnya berwarna hijau tua, berbentuk lonjong dengan tepi bergerigi dan permukaan yang agak kasar.\n\n" +
                "Manfaat & Kandungan:\n" +
                "- 💎 **Meluruhkan Batu Ginjal & Saluran Kemih** – Ini adalah manfaat paling terkenal. Sifat diuretiknya yang kuat dari kandungan kalium yang tinggi membantu meningkatkan produksi urine, mendorong keluar dan mencegah pembentukan batu ginjal serta batu kandung kemih.\n" +
                "- 🩸 **Membantu Mengontrol Gula Darah** – Secara tradisional digunakan untuk penderita diabetes. Penelitian menunjukkan ekstrak daun ini dapat membantu menurunkan kadar glukosa darah berkat kandungan flavonoid dan senyawa aktif lainnya.\n" +
                "- 🌿 **Tinggi Antioksidan & Anti-inflamasi** – Kaya akan flavonoid, katekin, dan alkaloid yang berfungsi sebagai antioksidan untuk melawan kerusakan sel. Sifat anti-inflamasinya juga membantu meredakan peradangan.\n" +
                "- 🛡️ **Menjaga Kesehatan Pencernaan** – Dipercaya dapat mengatasi sembelit dan wasir karena memiliki efek laksatif atau pencahar ringan.\n\n" +
                "Penggunaan:\n" +
                "1. **Direbus**: Ambil 7-10 lembar daun keji beling segar, cuci bersih. Rebus dengan 2 gelas air hingga tersisa 1 gelas. Saring dan minum airnya sekali sehari.\n" +
                "2. **Lalapan**: Daun mudanya bisa dikonsumsi langsung sebagai lalapan setelah dicuci bersih.\n\n" +
                "Sumber (5 tahun terakhir):\n" +
                "- Kemenkes RI (Direktorat Jenderal Yankes, 2023): Menjelaskan manfaat keji beling sebagai diuretik alami untuk batu ginjal dan diabetes.\n" +
                "- Halodoc (2024): Merangkum khasiat keji beling untuk kesehatan ginjal, diabetes, dan sebagai antioksidan.\n" +
                "- Widyawati, T., et al. (2022, *Molecules Journal*): Studi ilmiah yang mengulas potensi farmakologis *Strobilanthes crispus*, termasuk aktivitas antidiabetik dan antioksidannya.\n" +
                "- Good Doctor (2023): Membahas cara pengolahan dan manfaat daun keji beling untuk pengobatan herbal.",
        image = R.drawable.daun_keji_beling
    ),
    MyHerbData(
        id = "10",
        name = "Daun Ketepeng Cina",
        sasak_name = "Daun Ketepeng",
        desc = "Daun ketepeng cina (*Senna siamea*) mengandung flavonoid (quercetin, kaempferol, cassiarin A), emodin, tanin dan asam fenolik.\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🧪 **Antimikroba & Antifungal** – Ekstrak etil asetat menunjukkan zona hambat 16–18 mm; MIC 25–50 mg/mL untuk berbagai patogen.\n" +
                "- ⚙️ **Antioksidan Tinggi** – HPLC menunjukkan aktivitas fenolik tinggi dan kekuatan scavenging yang signifikan :contentReference.\n" +
                "- 🧘 **Anti-inflamasi & Hepatoprotektif** – Flavonoid total dari ekstrak hidroalcoholic terbukti menekan peradangan (studi 2024).\n\n" +
                "Penggunaan:\n" +
                "Ekstrak etanol/etil asetat digunakan topikal atau oral untuk infeksi kulit, peradangan, dan dukungan liver.\n\n" +
                "Sumber:\n" +
                "- *PubMed* (2024): profil fitokimia & antibakteri MIC-inhibisi.\n" +
                "- Academia.edu review (2023): bukti tradisional & anti-inflamasi.\n" +
                "- RJPT (2024): evaluasi fenolik, antioksidan, dan antigout.",
        image = R.drawable.ketepengcina
    ),
    MyHerbData(
        id = "11",
        name = "Daun Kumis Kucing",
        sasak_name = "Daun Kumis Kucing",
        desc = "Daun kumis kucing (*Orthosiphon aristatus*) mengandung rosmarinic acid, flavonoid, diterpenoid, triterpenoid dan saponin.\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🧬 **Antioksidan & Anti‑inflamasi** – Aktivitas DPPH tinggi; rosmarinic acid efektif untuk inflamasi kronis (arthritis, hati, jantung).\n" +
                "- 🔺 **Antidiabetes** – 76 studi sejak 1991 menunjukkan efek hipoglikemik signifikan pada model klinis dan hewan.\n" +
                "- 🧼 **Gastroprotektif & Anti-nefrolitiasis** – Tradisional digunakan untuk batu ginjal dan gangguan saluran kemih.\n\n" +
                "Penggunaan:\n" +
                "Daun kering diseduh sebagai teh atau dikapsul; ekstrak digunakan dalam suplemen antidiabetes, anti-inflamasi, maupun formulasi ginjal/microlithiasis.\n\n" +
                "Sumber:\n" +
                "- *Sciencedirect* (2023): rosmarinic acid & anti-inflamasi kronis.\n" +
                "- ResearchGate (2024): aktivitas anti-inflamasi & antioksidan.\n" +
                "- Bibliometric review (2024): 76 artikel antidiabetes.\n" +
                "- Frontiers in Pharmacology (2020): review CNS dan proteksi ginjal.",
        image = R.drawable.daun_kumis_kucing
    ),
    MyHerbData(
        id = "12",
        name = "Daun Kumquat Nagami",
        sasak_name = "Daun Kumquat",
        desc = "Daun kumquat Nagami (*Citrus japonica*, syn. *Fortunella margarita*) mengandung essential oil kaya terpenes (elemol, germacrene-D/B, eudesmol, limonene) dan alkohol terpene (~76–99 %).\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🌿 **Aroma & Potensi Sensorik** – Essential oil menghasilkan aroma citrus pekat dengan profil yang berbeda dari varietas lain, potensi aplikasi dalam aromaterapi/perfumery.\n" +
                "- 🧴 **Antimikroba moderat** – Minyak daun menunjukkan aktivitas bakteri Gram‑positif pada MIC 11–13 mg/mL, namun lemah terhadap Gram‑negatif/fungi.\n\n" +
                "Penggunaan:\n" +
                "Daun diekstrak hydrodistillation sebagai essential oil untuk aromaterapi, kosmetik, atau sabun; serta potensi minyak antibakteri untuk produk alami.\n\n" +
                "Sumber:\n" +
                "- MDPI (2023): komposisi volatil oil Nagami.\n" +
                "- Food Processing Tech (2025): profil EO dari daun & buah.\n" +
                "- ScienceDirect Topics overview: sejarah, taksonomi & aktivitas antibakteri.",
        image = R.drawable.daun_kumquat_nagami
    ),
    MyHerbData(
        id = "13",
        name = "Daun Meniran",
        sasak_name = "Daun Meniran",
        desc = "Daun meniran (*Phyllanthus niruri*) kaya antioksidan (polifenol, flavonoid, protein akt, securinine), bersifat hepatoprotektif, imunomodulator, dan diuretik.\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🛡️ **Proteksi hati** – Fraksi protein meniran melindungi hati dari kerusakan acetaminophen (hepatotoksik) melalui aktivitas antioksidan.\n" +
                "- 🧬 **Imunostimulasi** – Kombinasi dengan temu mangga meningkatkan fungsi T‑cell, makrofag, dan produksi sitokin (IL‑2, IFN‑γ).\n" +
                "- 🚽 **Diuretik & Pencegah Batu Ginjal** – Dipakai dalam tradisi jamu untuk melancarkan urin dan cegah batu ginjal.\n\n" +
                "Penggunaan:\n" +
                "Diseduh sebagai teh atau infus; bisa dikapsul; digunakan untuk perawatan hati, sistem imun, dan sebagai diuretik alami.\n\n" +
                "Sumber:\n" +
                "- Bhattacharjee & Sil PC (2024): aktivitas hepatoprotektif fraksi protein.\n" +
                "- Studi klinis (2024): imunostimulasi dengan temu mangga.\n" +
                "- Review Jamu Indonesia (2025): aplikasi diuretik & tradisional.",
        image = R.drawable.daun_meniran
    ),
    MyHerbData(
        id = "14",
        name = "Daun Mimba",
        sasak_name = "Daun Mimba",
        desc = "Daun mimba (*Azadirachta indica*, neem) mengandung >300 fitokimia seperti nimbolide, nimbidin, azadirachtin, quercetin, tanin, terpenoid, dengan aktivitas antimikroba, anti-inflamasi, antidiabetes, hepatoprotektif, dan insektisida alami.\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🦠 **Antimikroba & Anti-biofilm** – Aktivitas kuat terhadap bakteri, jamur, virus, dan biofilm resisten.\n" +
                "- 🔥 **Anti-inflamasi & Analgesik** – Ekstrak daun (200 mg/kg) menekan inflamasi pada model hewan; nimbidin dan nimbolide menekan NF‑κB & COX2.\n" +
                "- 🍬 **Antidiabetes & Metabolik** – Dukungan dari tinjauan 2025 menguatkan efek hipoglikemik dan modulasi metabolik.\n\n" +
                "Penggunaan:\n" +
                "Daun kering diseduh sebagai teh atau diolah dalam kapsul/pasta gigi; atau sebagai bahan topikal untuk infeksi dan inflamasi kulit.\n\n" +
                "Sumber:\n" +
                "- Frontiers in Pharmacology (2022): ringkasan aktivitas antimikroba & farmakologi daun.\n" +
                "- Review (2025): >300 fitokimia & efek imunomodulasi/metabolik.\n" +
                "- PubMed Central (2017–2023): anti-inflamasi & analgesik model hewan.",
        image = R.drawable.daun_mimba
    ),
    MyHerbData(
        id = "15",
        name = "Daun Nangka",
        sasak_name = "Daun Nangke",
        desc = "Daun nangka (*Artocarpus heterophyllus*) kaya polifenol, flavonoid, enzim-inhibitor, artocarpin, sitosterol, dan polisakarida fungsional yang bersifat antioksidan, anti-inflamasi, antimikroba, anti-obesitas, dan antikanker.\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- ⚡ **Antioksidan & Enzim-inhibitor** – Ekstrak daun efektif menghambat enzim seperti tyrosinase, DPPH-scavenging tinggi.\n" +
                "- 🔥 **Anti-inflamasi & Antimikroba** – Polisakarida dan ekstrak daun menekan peradangan dan pertumbuhan mikroba.\n" +
                "- ⚖️ **Antikanker & Anti-obesitas** – Polysakarida fungsional menunjukkan aktivitas antikanker & potensial penurun berat badan dalam studi awal.\n\n" +
                "Penggunaan:\n" +
                "Daun diseduh sebagai teh, diekstrak untuk produk suplemen/functional foods atau digunakan dalam kosmetik sebagai antioksidan/topikal.\n\n" +
                "Sumber:\n" +
                "- Int J Food Sci & Tech (2025): review polisakarida & bioaktivitas daun.\n" +
                "- PMC (2024): isolasi artocarpin & aktivitas antioksidan/enzyme-inhibitor.\n" +
                "- RJPT Online (2024): studi komprehensif kandungan & efek terapeutik.",
        image = R.drawable.daun_nangka
    ),
    MyHerbData(
        id = "16",
        name = "Daun Patah Tulang",
        sasak_name = "Daun Patah Tulang",
        desc = "Daun (ranting) patah tulang (*Euphorbia tirucalli*) mengandung flavonoid, tanin, saponin, steroid, dan latex aktif dengan aktivitas anti-inflamasi, penyembuhan luka, carminative, dan analgesik.\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 💊 **Anti-inflamasi signifikan** – Ingenane diterpenoid dari daun menghambat NO dan menurunkan COX‑2 serta IL‑6 via jalur NF‑κB/ Nrf2.\n" +
                "- 🩹 **Percepatan penyembuhan luka** – Salep ekstrak ranting dan latex mendukung regenerasi kulit pada model hewan.\n" +
                "- 🌿 **Analgesik & Carminative (tradisional)** – Digunakan sebagai obat nyeri, carminative, untuk gangguan pencernaan dan bronkitis dalam obat tradisional.\n\n" +
                "Penggunaan:\n" +
                "Latex atau ekstrak ranting diolah jadi salep topikal untuk luka, inflamasi, dan nyeri; tidak dikonsumsi secara oral karena ga cocok untuk penggunaan internal.\n\n" +
                "Sumber:\n" +
                "- ResearchGate (2023): fenolik & saponin ranting, aktivitas antioksidan & luka.\n" +
                "- PubMed (2024): ingenane diterpenoid dan mekanisme anti-inflamasi.",
        image = R.drawable.daun_patah_tulang
    ),
    MyHerbData(
        id = "17",
        name = "Daun Pepaya",
        sasak_name = "Daun Gedang",
        desc = "Daun pepaya (*Carica papaya*) kaya akan enzim (papain, pseudokarpain), flavonoid, tanin, saponin, dan vitamin (A, C, E, B17), bersifat antioksidan, antimikroba, antelmintik, antikanker, serta diduga meningkatkan trombosit dan ASI.\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🛡️ **Imunitas & Trombosit** – Teh/dekok daun meningkatkan jumlah trombosit/leukosit pada pasien DBD.\n" +
                "- 🌿 **Antiinflamasi & Antelmintik** – Papain dan saponin menunjukkan efek peradangan rendah dan menekan cacing usus.\n" +
                "- 🩸 **Antikanker & Antivirus** – Ekstrak daun memiliki aktivitas antiproliferatif terhadap sel kanker dan in-vitro menghambat protease SARS-CoV-2 (3CLpro & PLpro).\n" +
                "- 🤱 **Peningkat ASI** – Konsumsi rebusan daun pepaya dan susu kedelai meningkatkan produksi ASI ~84 % pada ibu nifas dalam case study tahun 2025.\n\n" +
                "Penggunaan:\n" +
                "Daun muda hingga sedikit tua direbus atau diseduh sebagai teh; juga diformulasi menjadi ekstrak, kapsul, salep; dipakai untuk dukungan imunitas, ASI, dan terapi infeksi/cacing.\n\n" +
                "Sumber:\n" +
                "- Sharma dkk. (2022): review fitokimia & antibakteri/manfaat nutrisi.\n" +
                "- Jurnal Universitas Pahlawan (2025): efek trombosit & larvasida.\n" +
                "- Singh dkk. (2025): kandungan saponin & formulasi kapsul antelmintik.\n" +
                "- Yaumaria et al. (2025): peningkatan ASI ~84 % dari studi ibu nifas.\n" +
                "- Rahmawati dkk. (2023): potensi antikanker klinis.\n" +
                "- Maywan Hariono dkk. (2022): inhibisi protease SARS-CoV-2 in vitro.",
        image = R.drawable.daun_pepaya
    ),
    MyHerbData(
        id = "18",
        name = "Daun Pukul Empat",
        sasak_name = "Daun Pukul Empat",
        desc = "Daun pukul empat (*Mirabilis jalapa*) mengandung alkaloid, flavonoid, saponin, triterpenoid dan tanin, dengan aktivitas antibakteri, antivirus, penyembuhan luka, dan sebagai hand sanitizer alami.\n\n" +
                "Manfaat & Aktivitas:\n" +
                "- 🩹 **Penyembuhan Luka** – Ekstrak etanol 7,5–10 % efektif mempercepat penyembuhan luka bakar pada kelinci, mencapai kesembuhan ~85 % dalam 19 hari.\n" +
                "- 🦠 **Antibakteri & Antivirus** – Ekstrak 12,5 mg/mL dan hand sanitizer dekstrak daun menunjukkan pengurangan bakteri (Vibrio, Staphylococcus) serta potensi antivirus.\n\n" +
                "Penggunaan:\n" +
                "Daun dihancurkan lalu diaplikasikan sebagai salep atau sediaan etanol untuk luka; juga digunakan sebagai bahan pembuatan hand‑sanitizer alami (ekstrak methanol/etanol). Tidak dikonsumsi oral.\n\n" +
                "Sumber:\n" +
                "- Jurnal lokal (2022): formulasi dan efektivitas hand sanitizer alami.\n" +
                "- Fathnur Sani Kasmadi dkk. (2023): uji klinik luka bakar pada kelinci, konsentrasi 10 % (85 % sembuh).\n" +
                "- Studi Pharmaceutika (2024): aktivitas antibakteri & antivirus ekstrak 12,5 mg/mL.",
        image = R.drawable.daun_pukul_empat
    ),
    MyHerbData(
        id = "19",
        name = "Daun Sage",
        sasak_name = "Daun Sage",
        desc = "Daun sage merupakan herba aromatik yang mengandung senyawa aktif seperti asam rosmarinat, carnosol, dan cineol. Daun ini dikenal memiliki aktivitas antioksidan, anti-inflamasi, antimikroba, dan neuroprotektif.\n\n" +
                "Manfaat:\n" +
                "- Meningkatkan fungsi kognitif dan memori, serta mencegah penurunan fungsi otak pada lansia.\n" +
                "- Membantu mengurangi gejala menopause, seperti hot flashes dan keringat berlebih.\n" +
                "- Memiliki sifat antibakteri dan antijamur, baik untuk kesehatan mulut dan tenggorokan.\n\n" +
                "Penggunaan:\n" +
                "Daun digunakan dalam bentuk seduhan teh, minyak esensial, atau ekstrak kapsul.\n\n" +
                "Sumber:\n" +
                "(Journal of Traditional and Complementary Medicine, 2021, Salehi et al.)\n" +
                "(Phytomedicine, 2022, Akhondzadeh et al.)",
        image = R.drawable.daun_sage
    ),
    MyHerbData(
        id = "20",
        name = "Daun Sembung",
        sasak_name = "Daun Sembung",
        desc = "Daun sembung mengandung senyawa aktif seperti borneol, cineol, flavonoid, dan seskuiterpen. Di Indonesia, tanaman ini telah lama digunakan dalam pengobatan tradisional untuk mengatasi masuk angin, gangguan pencernaan, dan luka luar.\n\n" +
                "Manfaat:\n" +
                "- Meredakan gangguan pernapasan dan batuk karena kandungan ekspektoran.\n" +
                "- Anti-inflamasi dan analgesik alami.\n" +
                "- Mempercepat penyembuhan luka dan infeksi kulit.\n\n" +
                "Penggunaan:\n" +
                "Daun direbus untuk diminum atau dikompres pada bagian tubuh yang sakit.\n\n" +
                "Sumber:\n" +
                "(Indonesian Journal of Pharmacy, 2020, Pradana et al.)\n" +
                "(Asian Pacific Journal of Tropical Biomedicine, 2021, Ismail et al.)",
        image = R.drawable.daun_sembung
    ),
    MyHerbData(
        id = "21",
        name = "Daun Sirih",
        sasak_name = "Daun Lekoq",
        desc = "Daun sirih kaya akan senyawa fenolik seperti eugenol, chavicol, dan hidroksikavikol yang memiliki sifat antimikroba, antiseptik, dan antioksidan kuat.\n\n" +
                "Manfaat:\n" +
                "- Digunakan sebagai antiseptik untuk mulut, gigi, dan organ kewanitaan.\n" +
                "- Membantu menghentikan pendarahan ringan dan mengurangi bau badan.\n" +
                "- Memiliki potensi antidiabetes dan penghambat pertumbuhan kanker.\n\n" +
                "Penggunaan:\n" +
                "Direbus untuk diminum, dikunyah langsung, atau digunakan sebagai obat luar.\n\n" +
                "Sumber:\n" +
                "(Journal of Herbal Medicine, 2021, Kumar et al.)\n" +
                "(Indonesian Journal of Cancer Chemoprevention, 2020, Andriani et al.)",
        image = R.drawable.sirih
    ),
    MyHerbData(
        id = "22",
        name = "Daun Sirsak",
        sasak_name = "Daun Srikaye",
        desc = "Daun sirsak kaya akan senyawa annonaceous acetogenins, flavonoid, dan tanin. Secara tradisional digunakan untuk membantu melawan kanker, menurunkan gula darah, dan sebagai anti-inflamasi alami.\n\n" +
                "Manfaat:\n" +
                "- Memiliki efek sitotoksik terhadap sel kanker payudara, prostat, dan pankreas.\n" +
                "- Menurunkan kadar gula darah dan meningkatkan sensitivitas insulin.\n" +
                "- Bersifat antiradang dan antibakteri.\n\n" +
                "Penggunaan:\n" +
                "Daun direbus untuk dijadikan teh herbal atau diolah menjadi ekstrak kapsul.\n\n" +
                "Sumber:\n" +
                "(Journal of Ethnopharmacology, 2021, Moghadamtousi et al.)\n" +
                "(Asian Pacific Journal of Tropical Medicine, 2020, Muhammad et al.)",
        image = R.drawable.daun_sirsak
    ),
    MyHerbData(
        id = "23",
        name = "Daun Tin Ara",
        sasak_name = "Daun Tin Ara",
        desc = "Daun tin mengandung flavonoid, asam fenolik, triterpenoid, dan berbagai enzim bioaktif. Dikenal dalam pengobatan Timur Tengah sebagai peluruh dahak, penurun tekanan darah, dan pembersih toksin.\n\n" +
                "Manfaat:\n" +
                "- Menurunkan kadar gula darah dan kolesterol.\n" +
                "- Bersifat anti-inflamasi dan hepatoprotektif (melindungi hati).\n" +
                "- Membantu memperbaiki saluran pencernaan dan fungsi ginjal.\n\n" +
                "Penggunaan:\n" +
                "Dikonsumsi sebagai teh herbal, ekstrak kapsul, atau rebusan langsung.\n\n" +
                "Sumber:\n" +
                "(BMC Complementary Medicine and Therapies, 2022, Mohammadi et al.)\n" +
                "(Pharmacognosy Reviews, 2021, Toma et al.)",
        image = R.drawable.daun_tin_ara
    ),
    MyHerbData(
        id = "24",
        name = "Daun Ubi Jalar",
        sasak_name = "Daun Ambon",
        desc = "Daun ubi jalar mengandung antioksidan tinggi seperti antosianin, lutein, dan polifenol. Selain sebagai sumber makanan, daunnya memiliki berbagai efek farmakologis.\n\n" +
                "Manfaat:\n" +
                "- Menurunkan kolesterol dan membantu mengontrol tekanan darah.\n" +
                "- Mengandung vitamin C, E, dan beta-karoten yang baik untuk sistem imun dan mata.\n" +
                "- Bersifat antidiabetes dan antioksidan kuat.\n\n" +
                "Penggunaan:\n" +
                "Bisa dikonsumsi sebagai sayur rebus, jus hijau, atau dijadikan teh.\n\n" +
                "Sumber:\n" +
                "(Food Chemistry, 2021, Truong et al.)\n" +
                "(Indonesian Journal of Health Science, 2023, Lestari et al.)",
        image = R.drawable.daun_ubi_jalar
    ),
    MyHerbData(
        id = "25",
        name = "Katumpangan",
        sasak_name = "Katumpangan",
        desc = "Katumpangan air, atau suruhan, dikenal sebagai tanaman kecil berair yang mengandung senyawa flavonoid, alkaloid, dan tanin. Di Indonesia, digunakan untuk peradangan dan nyeri sendi.\n\n" +
                "Manfaat:\n" +
                "- Mengurangi nyeri otot dan rematik (antiinflamasi).\n" +
                "- Efek diuretik dan detoksifikasi ringan.\n" +
                "- Memiliki potensi antibakteri terhadap bakteri gram positif.\n\n" +
                "Penggunaan:\n" +
                "Daun direbus dan diminum airnya, atau ditumbuk untuk kompres lokal.\n\n" +
                "Sumber:\n" +
                "(Journal of Applied Pharmaceutical Science, 2022, Rojas-Sandoval et al.)\n" +
                "(Jurnal Farmasi Sains dan Komunitas, 2021, Rina Yulianti et al.)",
        image = R.drawable.katumpangan
    )
)