/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas cwd
 */
public class PrismaSegitiga 
{
    int luasalas=48;
    int tinggi=12;
    int kelilingalas=24;
    int lp=(2*luasalas)+(kelilingalas*tinggi);
    int volume=luasalas*tinggi;
    
    public void cetak()
    {
    System.out.println("Mencari Luas Permuakaan Dan Volume Prisma Segitiga");
    System.out.println("Diketahui luas alas = "+luasalas);
    System.out.println("Diketahui tinggi = "+tinggi);
    System.out.println("Diketahui keliling alas = "+kelilingalas);
    System.out.println("Maka luas permukan limas = "+lp);
    System.out.println("Maka volume limas = "+volume);
    }

}
