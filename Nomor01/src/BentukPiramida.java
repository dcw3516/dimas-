/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas cwd
 */
public class BentukPiramida //nama class nya
{
 public static void main(String[] args) //ini elemen wajib
{
    
    for (int i = 1; i <= 10; i++) { // perulangan untuk tinggi dari piramida
    for (int j = i; j <= 9; j++) { // perulangan untuk pembuatan spasi
 
    System.out.print(" ");//ini untuk tampilan

}
    for (int k = 0; k <= (i * 2) - 2; k++) { // perulangan mencetak tanda # untuk membentuk piramida
    System.out.print("#");//ini gambar yang di tampilkan untuk membentuk piramida
}
    System.out.println(); // untuk pindah baris setelah membuat baris tanda #
}
}

}
