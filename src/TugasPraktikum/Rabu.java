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
public class Rabu extends Selasa{
    private String hari="Rabu";
    private String jadwal="1. B.INDONESIA"+"\n 2. DESAIN GRAFIS"+"\n 3. RPL"+"\n 4. MATEMATIKA";
    
    protected void rabu(){
        super.selasa();
        System.out.println("Hari "+hari+"\n#"+jadwal);
    }
}
