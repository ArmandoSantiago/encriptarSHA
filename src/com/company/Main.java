package com.company;

public class Main {

    public static void main(String[] args) {

        String desencriptado = "Hola asdfghjkllñjkzs5f56s43f5667saf\ndsghkjsdhjksdgfhsjadgfhjsdfhjsagfidsugfiusadgflsga";
        String encriptado = Hash.getHashSHA(desencriptado);
        System.out.println(desencriptado);
        System.out.println(encriptado);
        if (Hash.getHashSHA(desencriptado).equals(encriptado))
            System.out.println("Son iguales");
    }
}
