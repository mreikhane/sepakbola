import network.FirstConnect;

import java.io.IOException;
import java.util.Scanner;
import model.responmodel;


public class Main {
        public static void main(String[] args) throws IOException {
            label:
            while (true) {
                Scanner brazil = new Scanner(System.in);
                System.out.print("\nCari Data Anda : ");
                String hasil = brazil.nextLine();
                FirstConnect firstConnect = new FirstConnect();
                responmodel Responmodel = firstConnect.getdata(hasil);
                String Name = Responmodel.getNama();
                String Code = Responmodel.getCode();
                String Country = Responmodel.getCountry();
                if (Name == null && Code == null && Country == null) {
                    System.out.println("Data Kosong");
                } else {
                    System.out.println("Hasil Pencarian Anda ");
                    System.out.println("Name : " + Name);
                    System.out.println("Code : " + Code);
                    System.out.println("Country : " + Country);
                }
                System.out.print("\nApakah kamu ingin mencari lagi? (y/n) ");
                String pilih = brazil.nextLine();
                if (pilih.equals("n") || pilih.equals("N")) {
                    break label;
                }
            }
        }

    }