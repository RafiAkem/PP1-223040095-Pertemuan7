package Praktikum_Pemrograman.Pertemuan7;

public class node {
    private Matakuliah data;
    private node next;


    public node(Matakuliah data) {
        this.data = data;
    }

    // Setter dan Getter

    public void setNext(node next) {
        this.next = next;
    }

    public Matakuliah getdata() {
        return data;
    }

    public node getNext() {
        return next;
    }

    public void setdata(Matakuliah data) {
        this.data = data;
    }

}
