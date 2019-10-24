/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan43gajipegawai;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gajipe = new GajiPegawai();
        
        gajipe.setNama("Rizki Adam Kurniawan");
        gajipe.setAlamat("Jalan Semar dlm 4 No 72/66");
        gajipe.setUangTransport(250000);
        gajipe.setUangTunjangan(300000);
        gajipe.setGajiPokok(4500000);
        
        gajipe.tampilData(gajipe.getNama(), gajipe.getAlamat(), gajipe.getUangTunjangan(), gajipe.getUangTransport(), gajipe.getGajiPokok());
        System.out.println("TOTAL GAJI : Rp. " + gajipe.totalGaji(gajipe.getUangTunjangan(), gajipe.getUangTransport(), gajipe.getGajiPokok()));
    }
    
}
