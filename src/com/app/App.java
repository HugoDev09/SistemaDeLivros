package com.app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> bookList = new ArrayList<>();
        Book books = new Book();

        int option;

        System.out.print("\nMenu");
        System.out.print("\nInserir livro - 1: ");
        System.out.print("\nPesquisar livro - 2 ");
        System.out.print("\nDeletar livro - 3");
        System.out.print("\nOpção: ");
        option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                System.out.println("Livro que deseja inserir: ");
                books.setName(scanner.nextLine());
                System.out.println("Livro " + books.getName() + " adicionado.");
                break;

            case 2:
                System.out.println("Informe o nome do livro: ");
                books.setName(scanner.nextLine());
                bookList.add(books.getName());

                for (String book : bookList){
                    if (book.equals(books.getName())){
                        System.out.println("Livro " + books.getName() + " econtrado.");
                        break;
                    } else {
                        System.out.println("O livro " + books.getName() + " não existe.");
                    }
                }
                break;

            case 3:
                System.out.println("Informe o livro: ");
                books.setName(scanner.nextLine());
                if (bookList.remove(books.getName())) {
                    System.out.println("Livro " + books.getName() + " removido.");
                } else {
                    System.out.println("O livro" + books.getName() + " não está em estoque.");
                }
                break;

            default:
                System.out.println("Opções inválidas.");
                break;
        }
        scanner.close();
    }
}
