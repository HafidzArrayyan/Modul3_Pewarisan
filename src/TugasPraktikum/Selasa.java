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
public class Selasa extends Matpel{
    private String hari="Selasa";
    private String jadwal="1. FISIKA"+"\n 2. SISTEL"+"\n 3. SEJARAH INDONESIA"+"\n 4. RPL";
    
    protected void selasa(){
        super.judul();
        super.tampilkanNilai();
        System.out.println("Hari "+hari+"\n#"+jadwal);
    }
}
