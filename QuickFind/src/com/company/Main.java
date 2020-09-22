package com.company;

public class Main {

    public static void main(String[] args) {
        QuickFindUF quf = new QuickFindUF(10);
        quf.union(3,4);
        quf.union(4,6);
        System.out.println(quf.connected(3,6));


    }
}
