/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*; //untuk mengimport scanner fungsi scanner ke program
/**
 *
 * @author Dimas cwd
 */
public class DeretFibonacci //nama classnya
{
public static void main(String[]args)//elemen wajib
{
    
Scanner input = new Scanner(System.in);
int NilaiAwal = 0; //variabel utk menyimpan nilai
int NilaiSkrg = 1; //variabel utk menyimpan nilai
int NilaiFib  = 0; //variabel utk menyimpan nilai
 
System.out.println("Masukkan jumlah baris bilangan Fibonacci : ");//kalimat yang akan ditampilkan di outpunya
int deret =input.nextInt(); //memasukan jumlah baris tipe integer
System.out.println("###########");//ini untuk batas saja

for (int i=0;i<deret;i++) //perulangan deret fibonacci nya
{
    NilaiFib=NilaiSkrg+NilaiAwal;//ini rumus utk mencari nilai fibonacci
    NilaiAwal=NilaiSkrg;
    NilaiSkrg=NilaiFib;
    System.out.println(NilaiFib+" ");

if (NilaiFib>500)
{
    System.out.println("~~~Nilai sudah lebih dari 500~~~"); //peringatan
}else if(NilaiFib<0)
{
    System.out.println("");
}
}

}
}
