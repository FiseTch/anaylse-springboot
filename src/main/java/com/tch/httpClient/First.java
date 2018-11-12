package com.tch.httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class First {
    public static void main(String[] args) throws Exception {
        
        
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)//一、连接超时：connectionTimeout-->指的是连接一个url的连接等待时间
                .setSocketTimeout(5000)// 二、读取数据超时：SocketTimeout-->指的是连接上一个url，获取response的返回等待时间
                .setConnectionRequestTimeout(5000)
                .build();
        
        /**
         * httpClient  Get测试
         */
        CloseableHttpClient httpClient = HttpClients.createDefault();
        /*URIBuilder uriBuilder = new URIBuilder("http://10.201.61.24:9376/Park/YuanSuZhengXinService/saas_saic_vip");
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("key", "木林森股份有限公司"));
        
        nvps.add(new BasicNameValuePair("keytype", "3"));
        uriBuilder.addParameters(nvps);*/
       
        /*HttpGet httpGet = new HttpGet(uriBuilder.build());
        
        httpGet.setConfig(requestConfig);
        httpGet.addHeader("Content-Type","application/json");
        
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpClientUtil.printResponseMessage(response);*/
        
        /**
         * httpClient  Post测试
         *
         * http://10.201.61.24:9376/Park/YuanSuZhengXinService/saas_saic_vip?key=xxx&keytype=xxxx
         */
        
        String key = "440301103398823";
        String keytype = "2";
        StringBuilder sb = new StringBuilder("http://10.201.61.24:9376/Park/YuanSuZhengXinService/saas_saic_vip?");
        sb.append("key=").append(key).append("&")
                .append("keytype=").append(keytype);
        
        HttpPost httpPost = new HttpPost(sb.toString());
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.setConfig(requestConfig);
        // httpPost.setEntity(new UrlEncodedFormEntity(sb, "UTF-8"));
        System.out.println("--------------------------");
        
        System.out.println("--------------------------");
        CloseableHttpResponse response1 = httpClient.execute(httpPost);
        printResponseMessage(response1);
        
        
    }
    
    public static void printResponseMessage(HttpResponse response) throws IOException {
        if (response.getStatusLine().getStatusCode() == 200) {
            StringBuilder sb = new StringBuilder();
            HttpEntity resEntity = response.getEntity();
            String message = EntityUtils.toString(resEntity, "utf-8");
            System.out.println(message);
            readStringXmlOut(message);
            
        } else {
            System.out.println("请求失败");
        }
    }
    
    /**
     * @param xml
     * @return Map
     * @description 将xml字符串转换成map
     */
    public static Map readStringXmlOut(String xml) {
        Map map = new HashMap();
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(xml); // 将字符串转为XML
            Element rootElt = doc.getRootElement(); // 获取根节点
            System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称
            Iterator iter = rootElt.elementIterator("meta"); // 获取根节点下的子节点head
            // 遍历head节点
            while (iter.hasNext()) {
                Element recordEle = (Element) iter.next();
                String title = recordEle.elementTextTrim("service"); // 拿到head节点下的子节点title值
                System.out.println("service:" + title);
                map.put("service", title);
                Iterator iters = recordEle.elementIterator("code"); // 获取子节点head下的子节点script
                // 遍历Header节点下的Response节点
                while (iters.hasNext()) {
                    Element itemEle = (Element) iters.next();
                    String username = itemEle.elementTextTrim("username"); // 拿到head下的子节点script下的字节点username的值
                    String password = itemEle.elementTextTrim("password");
                    System.out.println("username:" + username);
                    System.out.println("password:" + password);
                    map.put("username", username);
                    map.put("password", password);
                }
            }
            Iterator iterss = rootElt.elementIterator("body"); ///获取根节点下的子节点body
            // 遍历body节点
            while (iterss.hasNext()) {
                Element recordEless = (Element) iterss.next();
                String result = recordEless.elementTextTrim("result"); // 拿到body节点下的子节点result值
                System.out.println("result:" + result);
                Iterator itersElIterator = recordEless.elementIterator("form"); // 获取子节点body下的子节点form
                // 遍历Header节点下的Response节点
                while (itersElIterator.hasNext()) {
                    Element itemEle = (Element) itersElIterator.next();
                    String banlce = itemEle.elementTextTrim("banlce"); // 拿到body下的子节点form下的字节点banlce的值
                    String subID = itemEle.elementTextTrim("subID");
                    System.out.println("banlce:" + banlce);
                    System.out.println("subID:" + subID);
                    map.put("result", result);
                    map.put("banlce", banlce);
                    map.put("subID", subID);
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}

