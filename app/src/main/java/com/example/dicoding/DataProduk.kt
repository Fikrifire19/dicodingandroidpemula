package com.example.dicoding

object DataProduk {
    private val namaProduks =arrayOf("Glowing Day Cream",
        "Glowing Night Cream", "Glowing Facial Wash",
        "Glowing Facial Toner", "Glowing Serum",
        "Acne Day Cream", "Acne Night Cream",
        "Acne Facial Wash", "Acne Facial Toner",
        "Acne Serum", "Whitening Day Cream",
        "Whitening Night Cream", "Whitening Facial Wash",
        "Whitening Facial Toner", "Bodylotion Glow",
        "Pink Jelly Extra Glow", "Glowing Basic",
        "Acne Basic", "Glowing Exclusive", "Acne Exclusive")

    val kategoriProduk = arrayOf("glowing", "glowing",
        "glowing", "glowing",
        "glowing", "acne",
        "acne", "acne",
        "acne", "acne",
        "whitening", "whitening",
        "whitening", "whitening",
        "bodylotion", "additional",
        "glowing", "acne",
        "glowing", "acne")

    val deskripsiProduk = arrayOf("ILFBeauty Skincare – Glowing Day Cream dengan kandungan UV Filter untuk melindungi kulit dari paparan sinar matahari. Dilengkapi ekstrak Aloe Vera, Chamomile dan Panthenol (Vitamin B5) untuk membantu melembabkan serta menutrisi kulit wajah sehingga kulit wajah tampak lebih cerah.", "ILF Beauty Skincare – Glowing Night Cream yang diformulasikan dengan kandungan Alpha Arbutin, Tranexamic Acid dan Glutathione yang dapat membantu menyamarkan flek hitam serta mencerahkan kullt wajah. Dilengkapi kandungan Moisturizer dan Carica Papaya Fruit Extract untuk melembabkan serta menutrisi kulit wajah.", "ILF Beauty Skincare – Glowing Facial Wash" +
            "Sabun untuk membersihkan kulit wajah dari make up, debu dan kotoran. Dilengkapi Aloe Vera Leaf Extract dan Carica Papaya Fruit Extract untuk membantu melembabkan kulit wajah.", "ILF Beauty Skincare – Glowing Facial Toner\n" +
            "Skincare glowing toner untuk membersihkan kulit wajah dari make up, debu dan kotoran serta menyegarkan kulit wajah.", "Serum dengan kandungan Alpha Arbutin, Niacinamide dan Licorice membantu menyamarkan noda hitam serta mencerahkan kulit wajah. Dilengkapi ekstrak Aloe vera dan Chamomile untuk melembabkan kulit wajah", "Day cream yang diformulasikan dengan kandungan UV Filter dan bahan antiacne (Salicylic Acid) yang dapat membantu melindungi kulit dari paparan sinar matahari serta merawat kulit yang berjerawat. Dilengkapi ekstrak Aloe Vera, Chamomile dan bahan moisturizer untuk melembabkan kulit wajah", "Night cream yang diformulasikan dengan kandungan Sulfur dan Salicylic Acid  yang dapat membantu merawat kulit berjerawat. Dilengkapi kandungan Niacinamide dan ekstrak Aloe Vera untuk membantu menyamarkan noda bekas jerawat serta melembabkan kulit wajah.", "Sabun untuk membersihkan kulit wajah dari make up, debu dan kotoran. Dilengkapi kandungan Salicylic Acid dan ekstrak Chamomile untuk membantu merawat kulit yang berjerawat.", "Toner untuk membersihkan kulit wajah dari make up, debu dan kotoran serta menyegarkan kulit wajah. Dilengkapi kandungan AHA dan bahan antiacne untuk membantu mengangkat sel kulit mati serta merawat kulit yang berjerawat.", "Serum yang diformulasikan dengan kandungan AHA dan bahan antiacne yang dapat membantu mengangkat sel kulit mati, serta merawat kulit yang berjerawat.", "Whitening Day Cream membantu memcerahkan dan melembabkan wajah, serta mengandung SPF50 untuk melindungi kulit dari paparan sinar matahari.", "Whitening Night Cream dapat membantu mencerahkan wajah, serta menjaga kelembapan dan kesahatan kulit wajah.", "Whitening Facial Wash  sabung untuk membersihkan wajah dari make-up, debu, dan kotoran. Diformulasikan untuk dapat mencerahkan dan melembabkan kulit wajah.", "Whitening Facial Toner untuk membersihkan wajah dari make-up, debu, dan kotoran serta menyegarkan kulit wajah. Membantu merawat kulit wajah agar tampak lebih cerah.", "Lotion dengan kandungan Sunscreen (UV Filter) untuk melindungi kulit tubuh dari paparan sinar matahari. Dilengkapi Aloe Vera Extract, Chamomile dan Vitamin E untuk membantu melembabkan serta menutrisi kulit sehingga kulit tubuh tampak lebih cerah merata.", "Gel yang dapat membantu menyejukkan kulit kemerahan karena iritasi ringan dengan ekstrak Kefir (Kluyveromyces Lactobacillus Lactococcus Leuconostoc Saccharomyces Milk Ferment Filtrate) untuk melembabkan dan menutrisi kulit wajah. Dilengkapi kandungan Niacinamide, Licorice (Glycyrrhiza Glabra) Extract dan Alpha Arbutin untuk membantu mencerahkan kulit wajah.", "Paket perawatan wajah yang akan membuat kulitmu bersih, flek hitam tersamarkan, lembab, dan glowing. Dengan kandungan bahan terbaik nomor 1, sehingga memberikan hasil optimal untuk kulitmu.", "Paket perawatan wajah yang akan membuat kulitmu bersih, flek hitam tersamarkan, lembab, dan glowing. Dengan kandungan bahan terbaik nomor 1, sehingga memberikan hasil optimal untuk kulitmu.", "Paket perawatan wajah yang akan membuat kulitmu bersih, flek hitam tersamarkan, lembab, dan glowing. Dengan kandungan bahan terbaik nomor 1, sehingga memberikan hasil optimal untuk kulitmu.", "Paket perawatan wajah yang akan membuat kulitmu bersih, flek hitam tersamarkan, lembab, dan glowing. Dengan kandungan bahan terbaik nomor 1, sehingga memberikan hasil optimal untuk kulitmu.", "Paket perawatan wajah yang akan membuat kulitmu bersih, flek hitam tersamarkan, lembab, dan glowing. Dengan kandungan bahan terbaik nomor 1, sehingga memberikan hasil optimal untuk kulitmu.")

    private val hargaProduks = arrayOf(110000, 115000,  95000,  95000,  150000,  110000, 115000,  95000,  95000,  135000, 60000, 65000,  45000,  45000,  155000,  180000,  305000,  305000,  395000,  395000)

    private val fotoProduks = arrayOf(R.drawable.glowing_day_cream,
        R.drawable.glowing_night_cream,
        R.drawable.glowing_facial_wash,
        R.drawable.glowing_facial_toner,
        R.drawable.glowing_serum,
        R.drawable.acne_day_cream,
        R.drawable.acne_night_cream,
        R.drawable.acne_facial_wash,
        R.drawable.acne_facial_toner,
        R.drawable.acne_serum,
        R.drawable.whitening_day_cream,
        R.drawable.whitening_night_cream,
        R.drawable.whitening_facial_wash,
        R.drawable.whitening_facial_toner,
        R.drawable.bodylotion_glow,
        R.drawable.pink_jelly,
        R.drawable.glowing_basic,
        R.drawable.acne_basic,
        R.drawable.glowing_exclusive,
        R.drawable.acne_exclusive)

    val listData: ArrayList<Produk>
        get() {
            val list = arrayListOf<Produk>()
            for (position in namaProduks.indices) {
                val produk = Produk()
                produk.nama_produk = namaProduks[position]
                produk.kategori_produk = kategoriProduk[position].toString()
                produk.deskripsi_produk = deskripsiProduk[position]
                produk.harga_produk = hargaProduks[position]
                produk.foto_produk = fotoProduks[position]
                list.add(produk)
            }
            return list
        }
}