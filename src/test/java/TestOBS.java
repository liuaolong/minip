package com.minip.back;

import com.minip.back.util.ConstantPropertiesUtil;
import com.obs.services.ObsClient;
import com.obs.services.ObsConfiguration;
import com.obs.services.exception.ObsException;
import com.obs.services.model.ObsObject;
import com.sun.tools.classfile.ConstantPool;

import java.io.*;
import java.nio.channels.ReadableByteChannel;

public class TestOBS {

        static  String secretId = ConstantPropertiesUtil.ACCESS_KEY_ID;
        static  String secretKey = ConstantPropertiesUtil.ACCESS_KEY_SECRET;
        static  String  endPoint = ConstantPropertiesUtil.END_POINT;
        static  String   bucketname = ConstantPropertiesUtil.BUCKET_NAME;
        static ObsClient obsClient;

    //System.out.println("Create a new bucket for demo\n");

    public static void main(String[] args)
            throws IOException
    {
        System.out.println("Create a new bucket for demo\n");
        ObsConfiguration config = new ObsConfiguration();
        config.setSocketTimeout(30000);
        config.setConnectionTimeout(10000);
        config.setEndPoint(endPoint);
        try
        {
            /*
             * Constructs a obs client instance with your account for accessing OBS
             */
             obsClient = new ObsClient(secretId, secretKey, config);

            /*
             * Create bucket
             */
            System.out.println("Create a new bucket for demo\n");
            //obsClient.createBucket(bucketName);

            /*
             * Upload an object to your bucket
             */
            System.out.println("Uploading a new object to OBS from a file\n");
            obsClient.putObject(bucketname,"/2022/1.txt"
              , new File("D:\\manchinelearnning\\2022\\web\\1.txt"));

            System.out.println("Downloading an object\n");

            /*
             * Download the object as an inputstream and display it directly
             */
            //simpleDownload();

            File localFile = new File("D:\\manchinelearnning\\2022\\web\\1.txt");
            if (!localFile.getParentFile().exists())
            {
                localFile.getParentFile().mkdirs();
            }

            System.out.println("Downloading an object to file:" + "D:\\manchinelearnning\\2022\\web\\1.txt" + "\n");
            /*
             * Download the object to a file
             */
            //downloadToLocalFile();

            System.out.println("Deleting object  " + "/2022/1.txt" + "\n");
            //obsClient.deleteObject(bucketName, objectKey, null);

        }
        catch (ObsException e)
        {
            System.out.println("Response Code: " + e.getResponseCode());
            System.out.println("Error Message: " + e.getErrorMessage());
            System.out.println("Error Code:       " + e.getErrorCode());
            System.out.println("Request ID:      " + e.getErrorRequestId());
            System.out.println("Host ID:           " + e.getErrorHostId());
        }
        finally
        {
            if (obsClient != null)
            {
                try
                {
                    /*
                     * Close obs client
                     */
                    obsClient.close();
                }
                catch (IOException e)
                {
                }
            }
        }
    }

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
