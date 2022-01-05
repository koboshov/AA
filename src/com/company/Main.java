package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        int cardsPerPlayer = 5;
//        int players = 0;
//        String [] suits ={
//                "пик","бубен","черв","трев"
//        };
//        String [] rank={
//                "2","3","4","5","6","7","8","9","10",
//                "валет","каролева","карол","туз"
//
//        };
//
//        int n = suits.length* rank.length;
//        for (;;){
//            Scanner sc = new Scanner(System.in);
//            System.out.print("\nвведите количество игроков");
//
//            if (sc.hasNextInt()) {
//
//                players = sc.nextInt();
//                if (cardsPerPlayer * players <= n) {
//                    break;
//                } else {
//                    if (players == 0) {
//
//                        System.out.print("\nигра прерашена.");
//                        break;
//                    } else if (players < 0) {
//
//                        System.out.print("\nчисло играков не может бытъ менъше о");
//                    } else {
//                        System.out.print("\nслишком многоиграков!");
//                    }
//                }
//
//            }else {
//                System.out.print("\nвы ввел не число или ваше число слишком болъшое!");
//
//                }
//            }
//        System.out.print("\n`~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        String[]deck = new String[n];
//        for (int i = 0; i < rank.length; i++) {
//            for (int j = 0; j < suits.length; j++) {
//                deck[suits.length*i+j]=rank[i]+" "+suits[j];
//
//            }
//        }
//        System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        for (int i= 0;i<n;i++){
//            int r = i +(int)(Math.random()* (n-i));
//            String tem= deck[r];
//            deck[r]=deck[i];
//            deck[i]=tem;
//        }
//        System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
//        for (int i = 0; i < players * cardsPerPlayer; i++) {
//            System.out.print(deck[i]);
//            if (i % cardsPerPlayer == cardsPerPlayer-1);
//            System.out.println(" ");
//
//        }


        List<String>student=new ArrayList<>();
        student.add("Турдугул");
        student.add("Айнагул ");
        student.add("Бермет");
        student.add("Эрмек");
        student.add("Арыстан");
        Iterator iterator=student.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

















    }
}
