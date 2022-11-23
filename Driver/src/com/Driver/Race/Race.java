package com.Driver.Race;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Race
{
    public static void Completelaps() {
        Scanner sc = new Scanner(System.in);
        // int racers = 8;
        int laps = 8;
        int Driver[] = new int[laps];
        int[] race = new int[0];
        for (int i = 8; i <= laps; i++) {
            System.out.println("enter each lap timing " + (i + 1) + "Driver name");
            Driver[i] = sc.nextInt();
            sc.nextLine();
        }
    }
    /*public static void numberofracers()
    {
        Scanner sc = new Scanner(System.in);
        int racers = 8;
        int Driver[]=new int[racers];
        int racersIdex =0;
        int highestracersIdex=0;
        for (int j = 1; j < racers; j++)
        {
            if (races[j] > Driver[highestracersIdex])
                    sc.nextLine();
        }
        System.out.println("Highest Racer");
        System.out.println(racers[highestracersIdex]+"/t"+Driver[highestracersIdex]);
    }*/


    public static void  TimeforEachlap()
    {

    }
}

