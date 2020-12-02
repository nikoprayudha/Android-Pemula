package com.example.submission1;

import java.util.ArrayList;

public class TourData {
    private static String[] tourNames = {
            "Alun Alun Kota Batu",
            "Batu Screet Zoo",
            "Batu Night Spectaculer",
            "Dino Park",
            "Eco Green Park",
            "Jatim Park 1",
            "Moseum Satwa",
            "Moseum Angkut",
            "Predator Fun Park",
            "The Legend Star"
    };

    private static String[] tourDetails = {
            "Berlibur ke Kota Batu belum lengkap rasanya jika tidak mengunjungi Alun-alun Kota Wisata Batu. Taman kota yang menawarkan beragam aktivitas wisata. Lokasinya yang strategis di tengah kota membuat taman ini sangat mudah dijangkau wisatawan.\n" +
                    "Alun-alun Kota Batu ini selain berfungsi sebagai taman kota juga banyak di kunjungi wisatawan untuk berekreasi. Hal ini karena fasilitas dan wahana yang ada di taman cukup lengkap. Mulai dari wahana permainan sampai wisata kuliner bisa dilakukan di sini.\n" +
                    "Harga Tiket Alun-Alun Kota Wisata Batu\n" +
                    "Tidak ada biaya tiket (Gratis) yang dibebankan kepada pengunjung untuk memasuki area Taman Kota. Karena Alun-Alun ini merupakan fasilitas umum. Pengunjung hanya akan dikenakan biaya tiket jika bermain berbagai wahana yang tersedia.",
            "Batu Secret Zoo adalah tempat wisata dan konservasi satwa modern yang terletak di Kota Batu, Jawa Timur. Di lahan seluas 14 hektar, pengunjung dapat melihat dari dekat berbagai satwa yang habitatnya tersebar di seluruh dunia, dari hutan tropis Asia, padang gurun Afrika hingga dasar Samudera Pasifik.",
            "BNS: Atraksi Malam untuk Keluarga\n" +
                    "Tahukah kamu? Pasar malam tadinya adalah festival perayaan Maulud Nabi di Jawa, terutama di Surakarta dan Yogyakarta. Kini, pasar malam setia menemani begitu matahari tenggelam, apalagi di Kota Batu! Batu Night Spectacular adalah pasar malam modern dengan beragam atraksi menguji adrenalin dan menghibur untuk keluarga. \n" +
                    "\n" +
                    "Ada Apa di Batu Night Spectacular?\n" +
                    "\n" +
                    "Terkadang malam terlalu sayang untuk dilewatkan begitu saja. Apalagi saat waktu berkumpul bersama keluarga begitu singkat. BNS menyediakan beragam atraksi yang bisa dilakukan oleh keluarga tercinta dari segala umur. Perang laser, rumah hantu, roller coaster, hingga film 4D membuat malam sayang dilewatkan begitu saja. Abadikan malam dengan berfoto di balon udara, menara Eiffel, dan kereta Cinderella di taman lampion. ",
            "Kembali ke Masa Prasejarah di Dino Park\n" +
                    "\n" +
                    "Selamat datang di Dino Park – Jawa Timur Park 3. Berbagai macam satwa pra-sejarah siap untuk anda pelajari bersama keluarga dan orang-orang berharga. Anda akan dibawa berpetualang kembali ke masa jaya dinosaurus dan rasakan hidup bersama mereka. Ketahuilah ukuran, kebiasaan dan habitat asal dari dinosaurus dan makhluk purba yang sudah punah lainnya.\n" +
                    "\n" +
                    "Dino Park adalah taman rekreasi yang cocok untuk segala usia dengan fasilitas dan teknologi masa kini. Terletak di Jl. Raya Ir. Soekarno, Beji, Junrejo, Kota Wisata Batu memastikan anda untuk menikmati liburan dengan maksimal selama berkunjung di Kota yang memiliki ketinggian 700-1.700 meter di atas permukaan laut dengan suhu rata-rata mencapai 12 derajat celsius.\n" +
                    "\n" +
                    "Ada apa saja di Dino Park – Jawa Timur Park 3?\n" +
                    "\n" +
                    "Park dengan luas 5 hektar ini memiliki 17 zona yang siap dijelajahi dan memberikan kepuasan berkunjung. Park dengan tema zaman dinosaurus ini bersisi berbagai macam satwa prasejarah yang bisa dipelajari secara menyenangkan dengan peng-kategorian yang memudahkan pengunjung. Terdapat wahana bermain dan fasilitas menarik yang menjamin kepuasan pengunjung selama di Dino Park -Jawa Timur Park 3.",
            "Oase di Tengah Kota\n" +
                    "\n" +
                    "Setiap hari berjejalan dengan macet, rasakan satu hari bebas polusi di taman ekosistem terbesar di Indonesia. Berdiri bersebelahan dengan aneka burung, merasakan kalajengking di tanganmu, hingga melewati laba-laba raksasa di hutan buatan. Setiap sudut taman penuh dengan teknologi ekologi, dari tenaga surya, kompos, pengolahan susu, dan kerangka robot dari 1.001 handphone! \n" +
                    "\n" +
                    "Ada Apa di Eco Green Park?\n" +
                    "\n" +
                    "Ingin belajar gaya hidup ramah lingkungan, tapi tidak tahu harus mulai dari mana? Eco Green Park tempat yang tepat untuk mempraktikkan pengetahuanmu! Mulai dari belajar biogas dan manfaatnya, menggunakan toilet edukasi yang menggunakan energi biogas, memilah dan mengolah sampah hingga bisa menjadi kompos, serta melihat olahan barang bekas menjadi kreasi yang menarik. Jangan takut lelah, e-bike siap menemani Anda berkeliling seluruh Eco Green Park.",
            "Interaktif dan Penuh Atraksi!\n" +
                    "Berapa banyak pelajaran yang bisa kamu serap dalam satu hari?\n" +
                    "Jawa Timur Park 1 adalah laboratorium interaktif raksasa untuk mempelajari dunia sekitarmu, tanpa ensiklopedia dan hafalan. Peristiwa sejarah, kekayaan geografi nusantara yang membuka wawasan kamu di sini diimbangi dengan beragam atraksi seru pengguncang nyali, seperti roller coaster atau sekedar berdiri di bawah ember air raksasa. Sejarah, fisika, biologi, sosiologi, dan matematika: tidak hanya otakmu yang menyerap ilmu, tubuhmu juga ikut merasakan penerapan ilmu di semua atraksi yang ada!\n" +
                    "\n" +
                    "Ada Apa di Jawa Timur Park 1?\n" +
                    "\n" +
                    "Berani berputar satu lingkaran penuh dengan kepala di bawah? Cobalah 360° Pendulum. Ingin uji ketahananmu melaju di roller coaster? Di Jawa Timur Park 1 ada berbagai jenis roller coaster: mulai yang secepat Superman Coaster, seluwes Dragon Coaster, hingga selucu Ulat Coaster. Cobalah total 15 atraksi di Jawa Timur Park 1 - berupa roller coaster, atraksi edukatif-etnik, hingga waterpark - yang pasti akan membuat tamasya kamu penuh wawasan sekaligus kegembiraan!",
            "Tidak kurang dari 1.000 spesies satwa liar dan 10.000 serangga dapat disaksikan di museum satwa terbesar dan terlengkap di Indonesia! Menelusuri sejarah dunia lewat replika tulang-belulang dinosaurus, evolusi mamalia selama ratusan tahun, hingga menyaksikan lebih dekat serangga kecil yang luput dari mata manusia.\n" +
                    "\n" +
                    "Ada Apa di Museum Satwa?\n" +
                    "\n" +
                    "Diorama satwa prasejarah, predator dari Kutub, spesies serangga yang diawetkan, hingga variasi burung yang terbang di atas kita. Museum Satwa menyajikan satwa-satwa yang diawetkan dalam habitat aslinya sehingga kita bisa mengamati mereka lebih dekat. Tak hanya secara visual, setiap binatang diberikan keterangan spesifik yang membantu memahami mereka.",
            "Pecinta mobil klasik, pecinta sejarah, dan penggemar film Hollywood kini menemukan rumah di Museum Angkut. Dengan luas hampir mencapai empat hektar, inilah museum transportasi pertama di Asia Tenggara. Tidak hanya menikmati sejarah setiap mobil, dari angkutan pertama Presiden RI hingga Istana Buckingham Inggris, Museum Angkut menyakin interior yang apik untuk fotografi.\n" +
                    "\n" +
                    "Ada apa di Museum Angkut?\n" +
                    "\n" +
                    "Museum Angkut percaya bahwa moda transportasi sejatinya adalah bagian dari peradaban. Setiap moda mewakili perubahan dan gaya di zamannya masing-masing. Maka, tak cukup sekadar menghadirkan kendaraan di pameran. Museum Angkut menghidupkan kembali fungsi dan jati diri setiap kendaraan dengan desain interior ruangan yang dibuat mirip dengan kondisi zaman aslinya. Nantikan juga festival dan parade yang semakin melengkapi perjalanan museum. Berjalan di Museum Angkut bak berjalan dari masa ke masa!",
            "Apa yang ada di bayangan Anda saat mendengar kata predator? Taring tajam, badan besar, dan hewan ganas? Predator Park menunjukkan kalau predator seperti buaya tidak menyeramkan seperti yang dibayangkan. Mulai dari replika menetasnya telur buaya hingga menyentuh langsung buaya hidup, kita akan melihat sisi lain di balik taring tajam sang buaya.\n" +
                    "\n" +
                    "Ada Apa di Predator Fun Park?\n" +
                    "\n" +
                    "Predator Park dilengkapi dengan beragam wahana outbound, baik untuk anak maupun dewasa, untuk menguji ketangkasan seperti predator yang sedang berburu! E-bike juga tersedia menemani menjelajah kehidupan predator di seluruh taman. Setelah berkeliling, nikmati waktu bersantai bersama keluarga di Family Fun House, saung angklung, pancing selfie, dan waterpark.",
            "The Legend star adalah salah 1 dari park yang berada di Jawa Timur park 3, the legend star yang memiliki konsep rekreasi dan belajar ini bisa menjadi pilihan anda menghabiskan libur bersama teman dan keluarga, the legend star menjadi yang pertama di Indonesia dalam menyajikan ratusan patung lilin dari para tokoh dan artis dunia dijamin akan memanjakan pengalaman berlibur anda, ditambah dengan berbagai replika tempat - tempat favorit dari berbagai negara menjadikan liburan anda menjadi lebih istimewa.\n" +
                    "\n" +
                    "The Legend Star adalah taman rekreasi yang cocok untuk segala usia . Terletak di Jl. Raya Ir. Soekarno, Beji, Junrejo, Kota Wisata Batu memastikan anda untuk menikmati liburan dengan maksimal selama berkunjung di Kota yang memiliki ketinggian 700-1.700 meter di atas permukaan laut dengan suhu rata-rata mencapai 12 derajat celsius."
    };

    private static int[] tourImages = {
            R.drawable.alun2,
            R.drawable.batusecretzoo,
            R.drawable.bns,
            R.drawable.dinopark,
            R.drawable.ecogreenpark,
            R.drawable.jatimpark1,
            R.drawable.museumangkut,
            R.drawable.museumsatwa,
            R.drawable.predatorfunpark,
            R.drawable.thelegendstar
    };
    static ArrayList<Tour> getListData() {
        ArrayList<Tour> list = new ArrayList<>();
        for (int position = 0; position < tourNames.length; position++) {
            Tour tour = new Tour();
            tour.setName(tourNames[position]);
            tour.setDetail(tourDetails[position]);
            tour.setPhoto(tourImages[position]);
            list.add(tour);
        }
        return list;
    }
}
