fun main() { //pertama yang dibuat oleh saya yaitu membuat fun main

    val s = suit("string") //ini implement dari abstract class
    s.opening()
    s.opening("BY YOGA==============")

    var player1: String //kita buat variable yang ingin kita masukkan di looping
    var player2: String

    do { //ini kita buat looping menggunakan do while

        println("Masukkan pilihan pemain 1 : ") //kita buat println yang keluar di terminal yang habis itu kita buat
        player1 = readln().lowercase() //readline buat kata pilihan yang mau di masukkan

        println("Masukkan pilihan pemain 2 : ")
        player2 = readln().lowercase()

        var result: String? = challenge(player1, player2) //variabel untuk memanggil fun challenge1 dan

        println("Hasil:")//kita buat println buat hasil pengecekan
        println(result) //untuk menampilkan println result apakah salah ,jika salah keluar kata di while bawah ini ,dan kita mengulang memasukkan pilihan

    } while (result == "Gagal, masukkan data yang benar!")//ini buat pengecekan apabila inputan yang di masukkan salah, jika salah kita akan mengulanginya lagi

}


fun challenge(
    player1: String,
    player2: String
): String { //kita buat fun buat pengecekan dari pilihan kata yang kita input di terminal

    if (player1 == player2) { //ini buat pengecekan satu satu mengunakan kondisi if else
        return "kedua pemain seri" //ini buat menampilkan hasil
    } else if (player1 == "gunting") { //ini juga buat pengecekan dengan memasukkan pilihan kata
        if (player2 == "kertas") {
            return "Pemain 1 win" //return disini untuk mangembalikan data ketika penegecekan
        } else { //else disini buat pengecualian if diatas
            return "Pemain 2 win"
        }
    } else if (player1 == "batu") {
        if (player2 == "gunting") {
            return "Pemain 1 win"
        } else {
            return "Pemain 2 win"
        }
    } else if (player1 == "kertas") {
        if (player2 == "batu") {
            return " Pemain 1 win"
        } else {
            return "Pemain 2 win"
        }
    }
    return "Gagal, masukkan data yang benar!"// jika data input tidak sesuai dengan pengecekan diatas maka dikembalikan pesan tersebut
}