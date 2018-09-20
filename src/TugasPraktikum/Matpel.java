/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Lenovo
 */
public class Matpel {
    private String hari="Senin";
    private String jadwal="1. PJOK"+"\n 2. RPL"+"\n 3. B.INGGRIS"+"\n 4. BK";
    public void judul(){
        System.out.println("Jadwal Pelajaran SMK Telkom Malang");
    }
    public void tampilkanNilai(){
        System.out.println("Hari "+hari+"\n#"+jadwal);
    }
}
