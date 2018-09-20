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
public class Kamis extends Rabu{
    private String hari="Selasa";
    private String jadwal="1. RPL"+"\n 2. SIMKOMDIG"+"\n 3. SB"+"\n 4. KOMJARDAS";
    
    protected void kamis(){
        super.rabu();
        System.out.println("Hari "+hari+"\n#"+jadwal);
    }
}
