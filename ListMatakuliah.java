package Praktikum_Pemrograman.Pertemuan7;

public class ListMatakuliah {
    private node HEAD;

    //cek apakah linked list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }

    //fungsi untuk menambahkan data di depan list
    public void addHead(Matakuliah data) {
        node newNode = new node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    //fungsi untuk menambahkan data di belakang list
    public void addTail(Matakuliah data) {
        node newNode = new node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            node curNode = HEAD;
            node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    //fungsi untuk menambahkan data di tengah list
    public void addMid(Matakuliah data, int pos) {
        node newNode = new node(data);
        node curNode = HEAD;
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            node posNode = null;
            if (pos == 1) {
                newNode.setNext(HEAD);
                HEAD = newNode;
            } else {
                int i = 1;
                while (curNode != null && i < pos) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    //fungsi mendisplay data list
    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            node curNode = HEAD;
            while (curNode != null) {
                System.out.println("Matakuliah: " + curNode.getdata().getKode() +  ", " + curNode.getdata().getNama() + ", " + curNode.getdata().getSks());
                curNode = curNode.getNext();
            }
            System.out.println();

        }
    }
}
