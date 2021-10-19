/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas cwd
 */
public class Tabung 
{
    int LuasAlas=4;
    int tinggi=28;
    double phi=3.14;
    int Jarijari=7;
    double lp=2*phi*Jarijari*(Jarijari+tinggi);
    double volume=phi*Jarijari*Jarijari*tinggi;
    
    public void cetak()
    {
    System.out.println("Mencari Luas Permuakaan Dan Volume Tabung");
    System.out.println("Diketahui luas alas = "+LuasAlas);
    System.out.println("Diketahui tinggi = "+tinggi);
    System.out.println("Diketahui jari-jari = "+Jarijari);
    System.out.println("Maka luas permukaan tabung = "+lp);
    System.out.println("Maka volume tabung = "+volume);
    }

}
