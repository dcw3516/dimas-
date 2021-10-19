/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas cwd
 */
public class Balok 
{
    int panjang=10;
    int lebar=5;
    int tinggi=4;
    int lp=2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    int volume=panjang*lebar*tinggi;
    
    public void cetak()
    {
    System.out.println("Mencari Luas Permuakaan Dan Volume Balok");
    System.out.println("Diketahui panjang = "+panjang);
    System.out.println("Diketahui lebar = "+lebar);
    System.out.println("Diketahui tinggi = "+tinggi);
    System.out.println("Maka luas permukaan balok = "+lp);
    System.out.println("Maka volume balok = "+volume);
    }

}
