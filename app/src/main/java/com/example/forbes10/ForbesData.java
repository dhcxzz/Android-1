package com.example.forbes10;

import java.util.ArrayList;

public class ForbesData {
    private static String[] forbesNames = {
            "Jeff Bezos",
            "Bill Gates",
            "Bernard Arnault",
            "Warren Buffett",
            "Larry Ellison",
            "Amancio Ortega",
            "Mark Zuckerberg",
            "Jim Walton",
            "Alice Walton",
            "Rob Walton"
    };

    private static String[] forbesDetails = {
            "Posisi 1 : $113 milyar",
            "Posisi 2 : $96 milyar",
            "Posisi 3 : $76 milyar",
            "Posisi 4 : $67,5 milyar.",
            "Posisi 5 : $59 milyar",
            "Posisi 6 : $55,1 milyar",
            "Posisi 7 : $54,7 milyar",
            "Posisi 8 : $54,6 milyar",
            "Posisi 9 : $54,4 milyar",
            "Posisi 10 : $54,1 milyar"
    };

    private static String[] forbesAge = {
            "56",
            "64",
            "71",
            "90",
            "76",
            "84",
            "36",
            "72",
            "71",
            "75"
    };

    private static String[] forbesWealth = {
            "Amazon, Self Made",
            "Microsoft, Self Made",
            "LVMH",
            "Berkshire Hathaway, Self Made",
            "software, Self Made",
            "Zara, Self Made",
            "Facebook, Self Made",
            "Walmart",
            "Walmart",
            "Walmart"
    };


    private static String[] forbesParagraf = {
            "Jeff Bezos mendirikan raksasa e-commerce Amazon pada tahun 1994 dari garasi rumahnya di Seattle. Dia menjalankannya sebagai CEO dan memiliki 11,1% saham. " +
                    "Antara Maret dan April 2020, di tengah pandemi, Amazon mengatakan telah mempekerjakan 175.000 pekerja tambahan. "+
                    "Pada April 2020, Bezos mengatakan dia akan memberikan $ 100 juta kepada Feed America, sebuah organisasi nirlaba yang mengoperasikan bank makanan dan dapur makanan di seluruh negeri.",
            "Bersama istrinya Melinda, Bill Gates mengetuai Bill & Melinda Gates Foundation, yayasan amal swasta terbesar di dunia." +
                    "Pada Mei 2020, Gates Foundation mengatakan akan menghabiskan $ 300 juta untuk memerangi pandemi virus korona, mendanai perawatan, deteksi, dan vaksin." +
                    "Gates telah menjual atau memberikan sebagian besar sahamnya di Microsoft - dia memiliki lebih dari 1% saham - dan berinvestasi dalam campuran saham dan aset lainnya.",
            "Salah satu pencipta rasa terbaik dunia, Bernard Arnault mengawasi kerajaan dari 70 merek termasuk Louis Vuitton dan Sephora." +
                    "Pada November 2019, LVMH mencapai kesepakatan untuk membeli perhiasan Amerika Tiffany & Co seharga $ 16,2 miliar, yang diyakini sebagai akuisisi merek mewah terbesar yang pernah ada." +
                    "LVMH menghabiskan $ 3,2 miliar pada 2019 untuk grup perhotelan mewah, Belmond, yang memiliki atau mengelola 46 hotel, kereta api, dan kapal pesiar sungai",
            "Dikenal sebagai \"Oracle of Omaha,\" Warren Buffett adalah salah satu investor paling sukses sepanjang masa." +
                    "Buffett menjalankan Berkshire Hathaway, yang memiliki lebih dari 60 perusahaan, termasuk perusahaan asuransi Geico, pembuat baterai Duracell dan jaringan restoran Dairy Queen." +
                    "Putra seorang anggota kongres AS, ia pertama kali membeli saham pada usia 11 tahun dan pertama kali mengajukan pajak pada usia 13 tahun.",
            "Larry Ellison adalah ketua, chief technology officer dan salah satu pendiri raksasa perangkat lunak Oracle, di mana dia memiliki sekitar 35,4%." +
                    "Dia melepaskan peran CEO Oracle pada 2014 setelah 37 tahun memimpin." +
                    "Oracle telah tumbuh sebagian melalui akuisisi perusahaan perangkat lunak yang stabil, yang terbesar adalah $ 9,3 miliar untuk Netsuite pada tahun 2016.",
            "Amancio Ortega adalah salah satu orang terkaya di Eropa, dan pengecer pakaian terkaya di dunia." +
                    "Seorang pelopor dalam mode cepat, ia mendirikan Inditex, yang dikenal dengan rantai mode Zara, dengan mantan istrinya Rosalia Mera (meninggal 2013) pada tahun 1975." +
                    "Dia memiliki sekitar 60% Inditex yang terdaftar di Madrid, yang memiliki 8 merek, termasuk Massimo Dutti dan Pull & Bear, dan 7.500 toko di seluruh dunia.",
            "Facebook, jejaring sosial yang dijalankan Zuckerberg, telah menjadi alat komunikasi utama selama penguncian pandemi virus corona." +
                    "Lebih dari 1.000 pengiklan bergabung dengan boikot pada bulan Juni untuk memprotes kebijakan Facebook yang longgar atas ujaran kebencian dan postingan menyesatkan dari politisi." +
                    "Zuckerberg memulai Facebook di Harvard pada 2004 pada usia 19 tahun untuk siswa mencocokkan nama dengan foto teman sekelas.",
            "Jim Walton adalah putra bungsu dari pendiri Walmart, Sam Walton." +
                    "Dia adalah ketua Arvest Bank keluarga, yang saat ini memiliki aset lebih dari $ 20 miliar." +
                    "Jim duduk di dewan Walmart selama lebih dari satu dekade sebelum menyerahkan kursi itu kepada putranya, Steuart, pada Juni 2016.",
            "Alice Walton adalah satu-satunya putri pendiri Walmart, Sam Walton." +
                    "Dia lebih fokus pada seni kurasi, daripada bekerja untuk Walmart seperti saudara kandungnya, Rob dan Jim." +
                    "Pada 2011, ia membuka Museum Seni Amerika Crystal Bridges di kampung halamannya di Bentonville, Arkansas.",
            "Rob Walton adalah putra tertua dari pendiri Walmart, Sam Walton." +
                    "Walton mengambil alih sebagai ketua setelah ayahnya meninggal pada tahun 1992." +
                    "Dia pensiun sebagai ketua pada Juni 2015 dan digantikan oleh menantu laki-lakinya, Greg Penner. Dia masih duduk di dewan Walmart."
    };

    private static int[] forbesImages = {
            R.drawable.jeff,
            R.drawable.bill,
            R.drawable.bernard,
            R.drawable.warren,
            R.drawable.larry,
            R.drawable.amancio,
            R.drawable.mark,
            R.drawable.jim,
            R.drawable.alice,
            R.drawable.rob
    };

    static ArrayList<Forbes> getListData() {
        ArrayList<Forbes> list = new ArrayList<>();
        for (int position = 0; position < forbesNames.length; position++) {
            Forbes forbes = new Forbes();
            forbes.setName(forbesNames[position]);
            forbes.setDetail(forbesDetails[position]);
            forbes.setAge(forbesAge[position]);
            forbes.setParagraf(forbesParagraf[position]);
            forbes.setWealth(forbesWealth[position]);
            forbes.setPhoto(forbesImages[position]);
            list.add(forbes);
        }
        return list;
    }
}
