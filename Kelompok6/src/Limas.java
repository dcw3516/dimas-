/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas cwd
 */
public class Limas 
{
    int sisi=20;
    int tinggi=24;
    int sisimiring=26;
    double volume=0.33*sisi*sisi*tinggi;
    double lp=(sisi*sisi)+4*(sisi*sisimiring)/2;

    public void cetak()
    {
    System.out.println("Mencari Luas Permuakaan Dan Volume Limas");
    System.out.println("Diketahui sisi = "+sisi);
    System.out.println("Diketahui tinggi = "+tinggi);
    System.out.println("Diketahui sisi miring = "+sisimiring);
    System.out.println("Maka luas permukan limas = "+lp);
    System.out.println("Maka volume limas = "+volume);
    }
}
    


