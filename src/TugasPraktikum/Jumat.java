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
public class Jumat extends Kamis{
    private String hari="Jum'at";
    private String jadwal="1. RPL"+"\n 2. PPKN"+"\n 3. KIMIA"+"\n 4. PAI";
    
    protected void jumat(){
        super.kamis();
        System.out.println("Hari "+hari+"\n#"+jadwal);
    }
    public static void main(String[] args) {
        Jumat jadwal=new Jumat();
        jadwal.jumat();
    }
}
