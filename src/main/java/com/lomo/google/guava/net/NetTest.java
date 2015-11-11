package com.lomo.google.guava.net;

import com.google.common.net.HostAndPort;

/**
 * Created by Lomo on 15-11-10.
 * Study Guava
 */
public class NetTest {
    public static void main(String[] args) {
        HostAndPort hostAndPort =
                HostAndPort.fromString("http://27.223.91.242:13567/zentaopms/www/index.php?m=project&f=bug");
        System.out.println(hostAndPort.getHostText());
        System.out.println(hostAndPort.getPortOrDefault(80));
    }
}
