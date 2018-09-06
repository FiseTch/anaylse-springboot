package com.tch.util;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/5 9:48
 */
public class IpUtil {
    
    /**
     * 将Ip变成Long类型放在数据库中
     *
     * @param ip 转递的格式 eg:127.0.0.1
     * @return Long
     */
    public static Long ip2Long(String ip) {
        //因为每个位置最大255，刚好在2进制里表示8位
        long t = 0L;
        String[] ipStrings = ip.split("\\.");
        for (String str : ipStrings) {
            int i = Integer.parseInt(str);
            t = (t << 8) | i;//位运算比较快
        }
        return t;
    }
    
    /**
     * 将Long型的ip类型转成String类型返回
     * @param t
     * @return
     */
    public static String ip2String(long t) {
        StringBuffer sb = new StringBuffer();
        for (int i = 3; i >= 0; i--) {
            long ipa = (t >> 8*i) & (0xff);
            sb.append(ipa + ".");
        }
        sb.delete((sb.length() - 1), sb.length());
        return sb.toString();
    }
    
    public static void main(String[] args){
        long i = 0b1100000010000000;
        long j = i >> 0;
        System.out.println(i);
        System.out.println(j);
        String s = ip2String(49280);
        System.out.println(s);
    }
}
