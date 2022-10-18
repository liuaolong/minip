package com.minip.back;

import com.alibaba.fastjson.JSON;
import com.minip.back.util.ConstantPropertiesUtil;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.http.HttpProtocol;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import com.sun.tools.classfile.ConstantPool;

import java.io.*;
import java.nio.channels.ReadableByteChannel;

public class TestOBS {

    public static void main(String[] args) {
        // 1 初始化用户身份信息（secretId, secretKey）。

        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
        // 2 设置 bucket 的地域, COS 地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
        Region region = new Region("ap-guangzhou");
        ClientConfig clientConfig = new ClientConfig(region);
        // 这里建议设置使用 https 协议
        clientConfig.setHttpProtocol(HttpProtocol.https);
        // 3 生成 cos 客户端。
        COSClient cosClient = new COSClient(cred, clientConfig);

        // 指定要上传的文件
        File localFile = new File("D:\\manchinelearnning\\2022\\temp\\《Flask Web开发：基于Python的Web应用开发实战》.pdf");
        // 指定文件将要存放的存储桶
        String bucketName = "alonez-1314429060";
// 指定文件上传到 COS 上的路径，即对象键。例如对象键为folder/picture.jpg，则表示将文件 picture.jpg 上传到 folder 路径下
        String key = "/2022/01/D:\\manchinelearnning\\2022\\temp\\《Flask Web开发：基于Python的Web应用开发实战》.pdf";
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, localFile);
        PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
        System.out.println(JSON.toJSONString(putObjectResult));
    }

//        static  String secretId = ConstantPropertiesUtil.ACCESS_KEY_ID;
//        static  String secretKey = ConstantPropertiesUtil.ACCESS_KEY_SECRET;
//        static  String  endPoint = ConstantPropertiesUtil.END_POINT;
//        static  String   bucketname = ConstantPropertiesUtil.BUCKET_NAME;
//        static ObsClient obsClient;
//
//    //System.out.println("Create a new bucket for demo\n");
//
//    public static void main(String[] args)
//            throws IOException
//    {
//        System.out.println("Create a new bucket for demo\n");
//        ObsConfiguration config = new ObsConfiguration();
//        config.setSocketTimeout(30000);
//        config.setConnectionTimeout(10000);
//        config.setEndPoint(endPoint);
//        try
//        {
//            /*
//             * Constructs a obs client instance with your account for accessing OBS
//             */
//             obsClient = new ObsClient(secretId, secretKey, config);
//
//            /*
//             * Create bucket
//             */
//            System.out.println("Create a new bucket for demo\n");
//            //obsClient.createBucket(bucketName);
//
//            /*
//             * Upload an object to your bucket
//             */
//            System.out.println("Uploading a new object to OBS from a file\n");
//            obsClient.putObject(bucketname,"/2022/1.txt"
//              , new File("D:\\manchinelearnning\\2022\\web\\1.txt"));
//
//            System.out.println("Downloading an object\n");
//
//            /*
//             * Download the object as an inputstream and display it directly
//             */
//            //simpleDownload();
//
//            File localFile = new File("D:\\manchinelearnning\\2022\\web\\1.txt");
//            if (!localFile.getParentFile().exists())
//            {
//                localFile.getParentFile().mkdirs();
//            }
//
//            System.out.println("Downloading an object to file:" + "D:\\manchinelearnning\\2022\\web\\1.txt" + "\n");
//            /*
//             * Download the object to a file
//             */
//            //downloadToLocalFile();
//
//            System.out.println("Deleting object  " + "/2022/1.txt" + "\n");
//            //obsClient.deleteObject(bucketName, objectKey, null);
//
//        }
//        catch (ObsException e)
//        {
//            System.out.println("Response Code: " + e.getResponseCode());
//            System.out.println("Error Message: " + e.getErrorMessage());
//            System.out.println("Error Code:       " + e.getErrorCode());
//            System.out.println("Request ID:      " + e.getErrorRequestId());
//            System.out.println("Host ID:           " + e.getErrorHostId());
//        }
//        finally
//        {
//            if (obsClient != null)
//            {
//                try
//                {
//                    /*
//                     * Close obs client
//                     */
//                    obsClient.close();
//                }
//                catch (IOException e)
//                {
//                }
//            }
//        }
//    }

//    private static void downloadToLocalFile()
//            throws ObsException, IOException
//    {
//        ObsObject obsObject = obsClient.getObject(bucketName, objectKey, null);
//        ReadableByteChannel rchannel = Channels.newChannel(obsObject.getObjectContent());
//
//        ByteBuffer buffer = ByteBuffer.allocate(4096);
//        WritableByteChannel wchannel = Channels.newChannel(new FileOutputStream(new File(localFilePath)));
//
//        while (rchannel.read(buffer) != -1)
//        {
//            buffer.flip();
//            wchannel.write(buffer);
//            buffer.clear();
//        }
//        rchannel.close();
//        wchannel.close();
//    }
//
//    private static void simpleDownload()
//            throws ObsException, IOException
//    {
//        ObsObject obsObject = obsClient.getObject(bucketName, objectKey, null);
//        displayTextInputStream(obsObject.getObjectContent());
//    }
//
//    private static void displayTextInputStream(InputStream input)
//            throws IOException
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//        while (true)
//        {
//            String line = reader.readLine();
//            if (line == null)
//                break;
//
//            System.out.println("\t" + line);
//        }
//        System.out.println();
//
//        reader.close();
//    }
//
//    private static File createSampleFile()
//            throws IOException
//    {
//        File file = File.createTempFile("obs-java-sdk-", ".txt");
//        file.deleteOnExit();
//        Writer writer = new OutputStreamWriter(new FileOutputStream(file));
//        writer.write("abcdefghijklmnopqrstuvwxyz\n");
//        writer.write("0123456789011234567890\n");
//        writer.close();
//
//        return file;
//    }




//    public static void main(String[] args) {
//        String secretId = ConstantPropertiesUtil.ACCESS_KEY_ID;
//        String secretKey = ConstantPropertiesUtil.ACCESS_KEY_SECRET;
//        String  endPoint = ConstantPropertiesUtil.END_POINT;
//        String   bucketname = ConstantPropertiesUtil.BUCKET_NAME;
//
//        System.out.println("Create a new bucket for demo\n");
//
//        // 创建ObsClient实例
//        ObsClient obsClient = new ObsClient(secretId, secretKey, endPoint);
//
//        // localfile为待上传的本地文件路径，需要指定到具体的文件名
//        obsClient.putObject(bucketname,"/2022/1.txt"
//               , new File("D:\\manchinelearnning\\2022\\web\\1.txt"));
//        System.out.println("*****************************");}

}
