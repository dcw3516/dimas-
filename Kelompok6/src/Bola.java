/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas cwd
 */
public class Bola 
{
    int r=7;
    double phi=3.14;
    double lp=4*phi*r*r;
    double volume=1.3*phi*r*r*r;
    
    
    public void cetak()
    {
    System.out.println("Mencari Luas Permuakaan Dan Volume Bola");
    System.out.println("Diketahui jari-jari = "+r);
    System.out.println("Maka luas permukaan bola = "+lp);
    System.out.println("Maka volume bola = "+volume);
    }
    

}
