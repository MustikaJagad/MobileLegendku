package com.dicoding.mobilelegend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heroList = listOf<Hero>(
            Hero(
                R.drawable.arllot_1,
                "Arlot",
                "Arlot adalah hero mobile legend dengan role fighter, dan posisinya berada di exp lane" +
                        "\n" +
                        "Untuk menguasai hero yang satu ini, kalian tentunya harus mengetahui dan mempelajari setiap skill yang terdapat pada hero ini. Berikut skill-skill Arlott yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Demon Gaze (Pasif)\n" +
                        "Arloot memiliki mata iblis yang akan meningkatkan Mark pada unit lawan di sekitar Arlott yang terkena efek Crowd Control selama 8 detik. Matanya juga akan meningkatkan Mark kepada hero lawan di sekitar secara otomatis selama 8 detik.\n" +
                        "\n" +
                        "Dauntless Strike (Skill 1)\n" +
                        "Arlott mengayunkan tombaknya ke depan,memberikan 280 (+230) Physical Damage menyebabkan Stun singkat kepada target di area. Target yang terkena bagian jauh dari area efek akan terkena Stun selama 1 detik sebagai gantinya.\n" +
                        "\n" +
                        "Vengeance (Skill 2)\n" +
                        "Arlott menyerang lawan, memberikan 320 (+230) Physical Damage (skill ini tidak dapat dihentikan ketika bergerak). Jika target Arlott memiliki Mark, Skill ini memberikan Damage ganda, langsung mereset Cooldown-nya, dan memulihkan (572) HP Arlott (hanya memulihkan 50% dari jumlah tersebut jika digunakan ke unit non-Hero).\n" +
                        "\n" +
                        "Final Slash (Ultimate)\n" +
                        "Arlott menebas ke depannya, memberikan 600 (+306) Physical Demage kepada terget di dalam area sambil mendorong mereka ke ujung area Efek dan mengungkap posisi mereka dalam wakti singkat."
            ),
            Hero(
                R.drawable.change2,
                "Change",
                "Change adalah hero mobile legend dengan role mage, dan posisinya berada di mid line" +
                        "\n" +
                        "Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war. Berikut skill-skill Chang’e yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Trouble Maker (Skill Pasif)\n" +
                        "Setiap kali Chang’e memberikan Damage kepada unit lawan, dia akan meninggalkan sebuah Mark kepada mereka dan Damage yang diberikan dari Skill berikutnya kepada mereka yang memiliki Mark tersebut akan meningkat sebesar 2% (hingga 40%).\n" +
                        "\n" +
                        "Starmoon Shockwave (Skill 1)\n" +
                        "Chang’e mengirimkan Energy Ball ke depan, memberikan 300( +120% Total Magic Power) (Magic Damage) pada lawan dan menyebabkan efek Slow pada mereka sebesar 20%. Berlangsung selama 1.5 detik. (Crescent Moon): Crescent Moon akan mengirimkan 4 Energy Ball bersamaan dengan Energy Ball Chang’e, setiap Energy Ball Cresent Moon memberikan 20% dari Damage yang diberikan Chang’e menyebabkan efek Slow pada lawan. (Efek Slow dapat di-Stack hingga 40%.)\n" +
                        "\n" +
                        "Crescent Moon (Skill 2)\n" +
                        "Chang’e memanggil (Crescent Moon), mendapatkan 300( +150% Total Magic Power) Shield permanen dan 10% Movement Speed tambahan hingga Shield hancur. Chang’e juga memperoleh 50% Movement Speed tambahan yang berkurang selama 2.5 detik pada setiap penggunaan Skill. (Crescent Moon) akan memperkuat Skill dan Basic Attack Chang’e. (Basic Attack yang Diperkuat): Basic Attack Chang’e memberikan 40( +30% Total Physical ATK) ( +70% Total Magic Power) (Magic Damage) tambahan.\n" +
                        "\n" +
                        "Meteor Shower (Ultimate)\n" +
                        "Chang’e mengumpulkan kekuatan dan meningkatkan Movement Speed-nya sebesar 20% selama 4 detik. Sementara itu, dia mengeluarkan 30 Meteor ke depan, setiap Meteor memberikan 50( +30% Total Magic Power) (Magic Damage) (Memberikan ekstra 100% Damage pada Minion dan Creep). (Crescent Moon): Crescent Moon akan mengeluarkan Meteor bersama Chang’e, setiap Meteor Crescent Moon memberikan 33% dari Damage yang diberikan Chang’e."
            ),
            Hero(
                R.drawable.fanny3,
                "Fanny",
                "Fanny adalah hero mobile legend dengan role assasin, dan posisinya berada di jungler" +
                        "\n" +
                        "Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war. Berikut skill-skill Fanny yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Air Superiority (Skill Pasif)\n" +
                        "Berdasarkan kecepatan terbangnya, Damage Fanny ketika terbang akan meningkat sebesar 15% hingga 30% dan meninggalkan (Prey Mark) pada target (hingga 2 Stack). Setiap Stack memulihkan 8 Energy ketika dia memberikan Damage kepada lawan dengan (Prey Mark). (Efek regenerasi Energy akan berkurang jika dia memberikan Damage pada beberapa Hero lawan dalam waktu singkat.)\n" +
                        "\n" +
                        "Tornado Strike (Skill 1)\n" +
                        "Fanny memutar pedangnya, memberikan 320( +80% Total Physical ATK) (Physical Damage) kepada lawan yang berada di dekatnya.\n" +
                        "\n" +
                        "Steel Cable (Skill 2)\n" +
                        "Fanny melemparkan kabel yang menariknya ke halangan pertama yang terkena kabelnya. Setiap penggunaan Skill beturut-turut dalam 2 detik mengurangi pemakaian Energy sebesar 2 dan mengubah arah terbangnya. Jika Energy-nya cukup dan dia mengenai lawan ketika terbang, hal itu akan memicu (Tornado Strike).\n" +
                        "\n" +
                        "Cut Throat (Ultimate)\n" +
                        "Fanny memulai serangan cepat kepada lawan, memberikan 500( +240% Physical ATK Tambahan) (Physical Damage). Setiap Stack (Prey Mark) pada lawan akan meningkatkan Damage-nya sebesar 20%."
            ),
            Hero(
                R.drawable.gusion4,
                "Gusion",
                "Gusion adalah hero mobile legend dengan role mage/assasin, dan posisinya berada di jungler" +
                        "\n" +
                        " Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war. Berikut skill-skill Gusion yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Dagger Specialist (Skill Pasif)\n" +
                        "Setiap kali Gusion mengeluarkan Skill, Rune akan bertambah ke Dagger Gusion. Setelah Rune mencapai 3 Stack, Basic Attack berikutnya akan memberikan Damage tambahan. Damage ini setara dengan 15% dari target HP yang hilang, dan memulihkan HP yang setara dengan 80% dari Damage yang diberikan.\n" +
                        "\n" +
                        "Sword Spike (Skill 1)\n" +
                        "Gusion melemparkan Dagger ke arah yang ia targetkan, memberikan 200( +50% Total Magic Power) (Magic Damage) ke target pertama yang terkena Hit. (Gunakan kembali): Gunakan kembali untuk bergerak ke belakang target dan memberikan 200( +100% Total Magic Power) (Magic Damage) kepada mereka.\n" +
                        "\n" +
                        "Shadowblade Slaughter (Skill 2)\n" +
                        "Gusion melemparkan Dagger-nya ke depan, masing-masing memberikan 110( +50% Total Magic Power) (Magic Damage) kepada lawan yang terkena dan menyebabkan efek Slow sebesar 6% selama 2 detik (efek Slow beberapa Dagger dapat di-Stack, hingga 30%). (Gunakan Kembali): Gusion memanggil kembali Dagger-nya, masing-masing memberikan 65( +40% Total Magic Power) (Magic Damage) kepada lawan di jalurnya.\n" +
                        "\n" +
                        "Baca juga:  Resmi, M4 World Championship Diadakan di Indonesia!\n" +
                        "Incandescence (Ultimate)\n" +
                        "Gusion melakukan Dash ke lokasi yang ia targetkan, secara langsung me-Refresh Cooldown dari (Sword Spike) dan (Shadowblade Slaughter). (Gunakan kembali): Gunakan kembali untuk melakukan Dash jarak pendek ke arah yang ia targetkan. Setelah (Shadowblade Slaughter) ter-Refresh, Gusion akan dapat secara langsung melempar lima Dagger dan memanggil kembali sepuluh Dagger jika Skill terpakai kembali."
            ),
            Hero(
                R.drawable.lesley5,
                "Lesley",
                "Lesley adalah hero mobile legend dengan role marksman, dan posisinya berada di gold lane" +
                        "\n" +
                        "Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war.\n" +
                        "Untuk menguasai hero baru yang satu ini, kalian tentunya harus mengetahui dan mempelajari setiap skill yang terdapat pada hero ini. Berikut skill-skill Lesley yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Lethal Shoot (Skill Pasif)\n" +
                        "Lesley memulihkan 5 Energy setiap kali ia mengenai lawan dengan Basic Attack. Jika dia tidak menerima Damage selama 5 detik, Basic Attack berikutnya akan memperoleh jarak serangan tambahan dan 50% Critical Chance serta memberikan 1.2 kali Damage. Basic Attack yang diperkuat juga akan memulihkan Energy sebanyak dua kali lipat. (Lethal Shot) memberikan 20% Damage tambahan kepada Minion.\n" +
                        "Cooldown dari (Lethal Shot) akan ter-Reset setiap kali Lesley menggunakan Skill. Setiap jumlah tetap Physical Penetration yang Lesley peroleh akan dikonversikan menjadi 1% Critical Chance (persentase Physical Penetration tidak terpengaruh).\n" +
                        "\n" +
                        "Master of Camouflage (Skill 1)\n" +
                        "Lesley memasuki Mode Camouflage dan memperoleh pemulihan Energy dua kali lipat, 40% Movement Speed tambahan, serta 75 Physical Attack selama 3 detik. Memberikan atau menerima Damage akan mengakhiri Mode ini. Lawan dapat mendeteksi kamuflase Lesley melalui distorsi dari lingkungan di sekeliling mereka.\n" +
                        "\n" +
                        "Tactical Grenade (Skill 2)\n" +
                        "Lesley melemparkan Tactical Grenade ke depan, yang meledak dalam area berbentuk kipas di depannya. Skill ini memberikan 150( +50% Total Physical ATK) (Physical Damage) kepada lawan dan menyebabkan efek Knockback kepada mereka. Sementara itu Lesley sedikit melompat ke belakang. Menggunakan Skill ini akan secara langsung membatalkan (Ultimate Snipe) dan mengeluarkan Fatal Bullet.\n" +
                        "\n" +
                        "Ultimate Snipe (Ultimate)\n" +
                        "Lesley mengunci target ke Hero lawan dan menembakkan 4 Lethal Bullet berturut-turut, masing-masing Lethal Bullet memberikan (Physical Damage) setara dengan 200( +80% Physical ATK Tambahan) tambahan 5% HP lawan yang hilang dan memulihkan 10 Energy saat mengenai lawan. Lethal Bullet dapat terhalang oleh Hero lawan lainnya. Lesley dapat menghentikan Skill ini lebih cepat, kemudian sebagian dari Cooldown Skill akan dikembalikan."
            ),
            Hero(
                R.drawable.ling6,
                "Ling",
                "Ling adalah hero mobile legend dengan role assasin, dan posisinya berada di jungler" +
                        "\n" +
                        "Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war. Berikut skill-skill Ling yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Cloud Walker (Skill Pasif)\n" +
                        "Skill Lightness Ling yang luar biasa memungkinkan dia untuk melompat di antara dinding. Dia memperoleh 4 Lightness Point tambahan setiap detik ketika dia berada di dinding dan 5 Lightness Point tambahan setiap kali dia memberikan Damage. Ling memperoleh Critical Chance sebanyak 2 kali dari semua sumber tetapi hanya memiliki 140% Critical Damage.\n" +
                        "\n" +
                        "Finch Poise (Skill 1)\n" +
                        "(Pasif): Critical Chance Ling meningkat sebesar 2.5% secara permanen. (Aktif): Ling menggunakan Lightness Skill-nya, melompat ke atas dinding yang telah ditentukan, memasuki Mode (Half-Stealth), memulihkan Lightness Point dengan lebih cepat dan memperoleh 30% Movement Speed.\n" +
                        "Jika Ling menerima Damage, dia akan keluar dari Mode (Half-Stealth). Jika dia terkena efek Crowd Control, dia akan jatuh ke tanah dan terkena efek Slow sebesar 30% selama 2 detik. Saat menggunakan Skill ini untuk melompat dari satu dinding ke dinding lainnya, dia akan me-Reset Cooldown dan me-Refresh Mode (Half-Stealth).\n" +
                        "\n" +
                        "Defiant Sword (Skill 2)\n" +
                        "Ling berlari ke arah target dan menikam lawan di sekitar, memberikan 250( +33% Total Physical ATK) (Physical Damage) kepada mereka. Jika Ling menggunakan Skill ini ketika dia berada di dinding, dia akan melakukan Dash ke lokasi target di tanah, memberikan 250( +33% Total Physical ATK) (Physical Damage) kepada lawan di area tersebut dan menyebabkan efek Slow kepada mereka sebesar 30% selama 1.5 detik.\n" +
                        "Jika serangan ini menjadi Critical, lawan akan terkena efek Slow sebesar 45% tambahan selama 0.75 detik. (Defiant Sword) dianggap sebagai Basic Attack, dapat mengaktifkan efek serangan, dan memulihkan 35 HP setiap kali Ling melakukan Hit kepada lawan.\n" +
                        "\n" +
                        "Tempest of Blades (Ultimate)\n" +
                        "Ling melompat ke udara, menjadi Invincible dan memperoleh 10% Movement Speed tambahan selama 1.5 detik. Dia dapat bergerak bebas ketika berada di udara. Dia kemudian mendarat di tanah, memberikan 250( +100% Total Physical ATK) (Physical Damage) kepada lawan di area.\n" +
                        "Skill ini menyebabkan efek Airborne kepada lawan yang berada di tengah selama 1 detik, dan menciptakan Sword Field selama 8 detik. Empat (Tempest of Blades) juga akan muncul di tepi Sword Field. Ling dapat mengambilnya untuk mengurangi Cooldown dari (Finch Poise) selama 4 detik, me-Reset Cooldown dari (Defiant Sword), dan memperoleh 25 Lightness Point."
            ),
            Hero(
                R.drawable.nana7,
                "Nana",
                "Nana adalah hero mobile legend dengan role mage, dan posisinya berada di mid lane" +
                        "\n" +
                        "Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war.\n" +
                        "Untuk menguasai hero baru yang satu ini, kalian tentunya harus mengetahui dan mempelajari setiap skill yang terdapat pada hero ini. Berikut skill-skill Hylos yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Molina’s Gift (Skill Pasif)\n" +
                        "Molina’s Gift yang akan mentransformasi Nana menjadi transparan ketika menerima damage yang dapat mematikannya. Selain itu, memberikan Movement Speed yang tinggi hingga mencapai 70% untuk kabur dari serangan lawan dan memulihkan 10% HP untuk memberikan peluang untuk hidup.\n" +
                        "\n" +
                        "Magic Boomerang (Skill 1)\n" +
                        "Nana mengeluarkan Boomerang dengan Magic di dalamnya yang memiliki skill AoE dengan memberikan efek Slow dalam area lawan yang terkena skill ini. Skill ini menghasilkan 220 poin Magic Damage dengan tambahan 110% Total Magic Damage yang menyebabkan Efek Slow kepada lawan sebesar 40% selama satu detik.\n" +
                        "\n" +
                        "Molina Smooch (Skill 2)\n" +
                        "Skill ini mengeluarkan Molina, yang merupakan semacam boneka dengan memiliki area jangkauan. Skill ini memberikan 250 poin Magic Damage dengan tambahan 50% Total Magic Power dan mentransformasi lawannya jika terkena Hit. Memberikan efek slow sebesar 50% selama 1,5 detik dan mengurangi Magic Defense sebanyak 25%.\n" +
                        "\n" +
                        "Molina Blitz (Ultimate)\n" +
                        "Nana memanggil Molina dengan mengeluarkan sihir tapak kaki raksasa ke area yang ia arahkan untuk memberikan Burst Damage dan efek Stun kepada lawannya. Skill Ultimate ini mengeluarkan sebanyak 3 kali serangan dengan visual tapak kaki Molina raksasa yang menghasilkan 400 poin Magic Damage dengan tambah 180% Total Magic Power di area tersebut."
            ),
            Hero(
                R.drawable.selena8,
                "Selena",
                "Selena adalah hero mobile legend dengan role mage/assasin, dan posisinya berada di roam/mid lane" +
                        "\n" +
                        "Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war. Berikut skill-skill Selena yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Symbiosis (Skill Pasif)\n" +
                        "Selena dapat berubah antara kedua Modenya dengan bebas. (Mode Elven): Ketika menggunakan Skill dalam Mode Elven, Selena meninggalkan (“Abyssal Mark”). Dapat di-Stack hingga 2 kali.\n" +
                        "Ketika (“Abyssal Trap”) mengenai lawan, akan otomatis menambahkan (“Abyssal Mark”). (Mode Abyssal): Semua Damage akan menggunakan 1 (“Abyssal Mark”) untuk memberikan 240~450( +40% Total Magic Power) (Magic Damage) tambahan.\n" +
                        "\n" +
                        "Abyssal Trap (Skill 1)\n" +
                        "Selena memanggil Abyssal Devil untuk mengintai di lokasi yang ditentukan. Abyssal Devil akan melekatkan dirinya ke lawan yang mendekati lokasi tersebut dan menyebabkan efek Slow kepada mereka sebesar 70%.\n" +
                        "Setelah 1 detik, Abyssal Devil memberikan 350( +150% Total Magic Power) (Magic Damage) kepada lawan itu dan lawan di sekitar lainnya serta menyebabkan efek Slow kepada mereka sebesar 50% selama 1 detik. Abyssal Devil bertahan hingga detik. Hingga 3 Abyssal Devil dapat muncul secara bersamaan. Setiap Abyssal Devil tambahan meningkatkan Damage akhir sebesar 50%.\n" +
                        "\n" +
                        "Abyssal Arrow (Skill 2)\n" +
                        "Selena menembakkan Magic Arrow ke arah yang telah ditentukan. Hero lawan pertama yang terkena akan menerima 250( +20% Total Magic Power) – 500( +40% Total Magic Power) (Magic Damage) dan akan terkena efek Stun selama 0.5 – 3 detik. Durasi efek Stun dan Damage meningkat berdasarkan jarak terbang Magic Arrow.\n" +
                        "Magic Arrow menyerap (“Abyssal Trap”) saat dia bergerak ke target lawan, efek (“Abyssal Trap”) akan aktif pada target lawan setelah terkena serangan ini. Jika menyebabkan efek Stun pada lawan selama 1 detik atau lebih, Movement Speed Selena akan meningkat sebesar 40% selama 2 detik.\n" +
                        "\n" +
                        "Primal Darkness (Ultimate)\n" +
                        "Selena memasuki Mode Abyssal dan meningkatkan Movement Speed-nya sebesar 30%. Berlangsung selama 0.8 detik. Cooldown (“Soul Eater”) dan (“Garotte”) akan langsung di-Reset. (Mode Abyssal): Mendapatkan Skill baru. Basic Attack Selena akan memberikan ( +25% Total Magic Power) (Magic Damage) tambahan."
            ),
            Hero(
                R.drawable.wanwan9,
                "Wanwan",
                "Wanwan adalah hero mobile legend dengan role marksman, dan posisinya berada di gold lane" +
                        "\n" +
                        "Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war. Berikut skill-skill Wanwan yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Tiger Pace (Skill Pasif)\n" +
                        "Wanwan mengungkap Weakness dan posisi Hero lawan yang dikenai oleh senjatanya selama 6 detik. Dia memberikan 55(+3*Hero Level) (True Damage) ketika mengenai Weakness mereka. Jika dia mengenai semua Weakness target, dia akan meningkatkan Damage yang diberikan kepada target sebesar 40% dalam 6 detik. Wanwan dapat bergerak dalam jarak pendek ketika dia melemparkan Sleeve Dart. Kecepatan dari gerakan ini berskala dengan Attack Speed.\n" +
                        "\n" +
                        "Swallow’s Path (Skill 1)\n" +
                        "Wanwan melemparkan Fire Swallow ke arah yang telah ditentukan, memberikan 120( +40% Total Physical ATK) (Physcial Damage) kepada lawan di sepanjang jalurnya dan memicu (Tiger Pace). Untuk setiap beberapa detik, Wanwan memulihkan Swallow Dagger dari Fire Swallow, memberikan 60( +65% Total Physical ATK) (Physical Damage) kepada lawan di jalurnya dan menyebabkan efek Slow kepada mereka sebesar 30% selama 1.5 detik. Lawan yang terkena serangan Swallow Dagger dua kali akan terkena efek Stun selama 0.5 detik.\n" +
                        "\n" +
                        "Needles in Flowers (Skill 2)\n" +
                        "Wanwan menghapus seluruh Crowd Control dari dirinya seketika, menimbulkan (“Tiger Pace”) dan melepaskan Deadly Needle kepada lawan yang berada di dekatnya, memberikan 150( +60% Total Physical ATK) (Physical Damage).\n" +
                        "\n" +
                        "Crossbow of Tang (Ultimate)\n" +
                        "Wanwan mengaktifkan Crossbow-nya dan menembakkan panah kepada lawan selama 2.5 detik. Setiap panah memberikan 60( +40% Total Physical ATK) (Physical Damage). Ketika Crossbow diaktifkan, jika Wanwan mengeliminasi Hero lawan, ia akan mengganti untuk menyerang target lainnya, mengaktifkan Crossbow-nya selama 1 detik tambahan, dan meningkatkan Attack Speed-nya sebesar 30% (maksimal 3 kali).\n" +
                        "Ketika Wanwan mengambil kembali Crossbow-nya atau mengeliminasi Hero lawan, (“Tiger Pace”) akan diaktifkan. (“Crossbow of Tang”) hanya dapat digunakan ketika seluruh Weakness lawan dikenai. Tembakan dari (“Crossbow of Tang”) akan dianggap sebagai Basic Attack. Dan jumlah panah yang dia tembakkan berskala dengan Attack Speed-nya."
            ),
            Hero(
                R.drawable.xavier10,
                "Xavier",
                "Xavier adalah hero mobile legend dengan role mage, dan posisinya berada di mid lane" +
                        "\n" +
                        "Hero Mobile Legends yang satu ini memiliki skill mematikan yang tentunya sangat mengganggu ketika saat war. Berikut skill-skill Xavier yang wajib kalian kuasai:\n" +
                        "\n" +
                        "Transcendence (Pasif)\n" +
                        "Transcendence adalah kemampuan pasif Xavier yang sangat menguntungkan. Meskipun skill ini pasif, efeknya hanya akan aktif kalau kamu berhasil menyerang lawan dengan skill aktif Xavier.\n" +
                        "Setiap kali kalian menyerang dengan spell aktif, skill berikutnya yang mengenai musuh akan memiliki damage yang lebih tinggi bersamaan dengan keuntungan lainnya. Salah satu keuntungan terbesar adalah ultimate Xavier, Dawning Light. Tidak hanya ultimate-nya mendapatkan banyak damage tambahan, tapi cooldown-nya juga berkurang 4 detik.\n" +
                        "\n" +
                        "Infinite Extension (Skill 1)\n" +
                        "Skill pertama dari Xavier adalah spell peluru magic yang menembus musuh, mengeluarkan damage magic. Dengan cooldown yang cukup pendek, 6,5 detik, Infinite Extension dapat ia gunakan terus menerus untuk menyerang saat dalam lane atau untuk farming creep secara efisien.\n" +
                        "Selain itu, kamu dapat memaksimalkan potensial Infinite Extension dengan menyerang lebih banyak target karena jarak terbang skill ini bertambah kalau menyerang target musuh atau Mystic Barrier––yang skill tiga Xavier luncurkan.\n" +
                        "\n" +
                        "Mystic Field (Skill 2)\n" +
                        "Mystic Field adalah skill yang membuat Xavier sangat kuat saat team fight. Mengeluarkan ruang magic, musuh yang berada di dalam ruang ini bergerak 50% lebih lambat sementara Xavier dan timnya bergerak lebih cepat.\n" +
                        "Jadi, jika merasa akan ada team fight yang terjadi, pastikan kalian menggunakan skill ini secepat mungkin. Juga ingat bahwa skill Xavier lainnya juga dapat berinteraksi dengan ruang magic ini, memperbesar Mystic Field, menghasilkan damage dan juga mengontrol musuh.\n" +
                        "\n" +
                        "Dawning Light (Ultimate)\n" +
                        "Skill ultimate Xavier adalah sinar cahaya yang menghasilkan damage cukup besar ke semua musuh yang berbaris. Meskipun sulit untuk menyerang banyak musuh dengan Dawning Light karena area-nya yang kecil, kami menyarankan untuk menggunakan Mystic Field terlebih dahulu untuk memperlambat kecepatan gerakan musuh dan membuat mereka sulit untuk menghindari skill ini."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_heroes)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HeroAdapter(this,heroList){
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about_me -> {
                val aboutActivity = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutActivity)
            }
        }

        return super.onOptionsItemSelected(item)
    }
}