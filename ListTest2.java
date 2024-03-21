package Praktikum_Pemrograman.Pertemuan7;

public class ListTest2 {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3), 2 );
        list.addMid(new Matakuliah("IF002", "Pemrograman Web", 3), 3 );
        list.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.displayElement();
    }
}
