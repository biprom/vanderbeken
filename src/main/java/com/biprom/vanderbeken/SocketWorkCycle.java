package com.biprom.vanderbeken;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@Component("socketWorkCycle")
@Scope("prototype")
public class SocketWorkCycle extends Thread {





    public void run(){

        System.out.println(" Server is Running  " );
        ServerSocket mysocket = null;

        try {
            mysocket = new ServerSocket(5555);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Socket connectionSocket = null;

        BufferedReader reader = null;

        BufferedWriter writer = null;

        String data1 = null;

        while(true)
        {


            try {
                connectionSocket = mysocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }


            try {
                reader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                writer = new BufferedWriter(new OutputStreamWriter(connectionSocket.getOutputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            //try {
                //writer.write("*** Welkom bij de ssh raw server van Biprom ***\r\n");
            //} catch (IOException e) {
            //    e.printStackTrace();
            //}
            //try {
            //    writer.write("*** Geef aub de gewenste data door : \n");
            //} catch (IOException e) {
            //    e.printStackTrace();
            //}
            //try {
             //   writer.flush();
            //} catch (IOException e) {
            //    e.printStackTrace();
            //}

            try {
                data1 = reader.readLine().trim();
            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.println("ontvangen data =  "+ data1 );

            try {
                writer.write("\r\n=== Ontvangen data is  : " + data1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                connectionSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
