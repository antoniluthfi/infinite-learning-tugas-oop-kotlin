package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName = "Lintang"
    val surname = "Luthfiantoni"
    val age = 22
    val maritalStatus = false

    println("My name is $firstName $surname")
    println("I'm $age old")
    println("Marital Status $maritalStatus")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("My team's members: $groupMember")
    println("My session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    return listOf(
        "Lintang Luthfiantoni",
        "Asfia Apriani",
        "Adelia Sofia Anjani",
        "Aditya Mufid Musyaffa",
        "Abdus Salam",
        "Mutia Nandika",
        "Ali Askari",
        "Lustiara Mega",
        "Sapitri",
        "Vika Dwi",
        "Khaeril Maswal Zaid"
    )
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Imam", "Jovian")
    val countOfGroup = arrayOf<String>(
        "Lintang Luthfiantoni",
        "Asfia Apriani",
        "Adelia Sofia Anjani",
        "Aditya Mufid Musyaffa",
        "Abdus Salam",
        "Mutia Nandika",
        "Ali Askari",
        "Lustiara Mega",
        "Sapitri",
        "Vika Dwi",
        "Khaeril Maswal Zaid"
    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("99999", myTeam, "Morning")

}