package com.minip.back.service.impl;

import com.minip.back.service.FileService;
import com.minip.back.util.ConstantPropertiesUtil;
import com.obs.services.ObsClient;
import com.obs.services.ObsConfiguration;
import com.obs.services.model.PutObjectRequest;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {


//    @Override
//    public String upload(MultipartFile file){
//        return null;
//    }
    //文件上传
    @Override
    public String upload() {
        // 1 初始化用户身份信息（secretId, secretKey）。
        String secretId = ConstantPropertiesUtil.ACCESS_KEY_ID;
        String secretKey = ConstantPropertiesUtil.ACCESS_KEY_SECRET;
        String  endPoint = ConstantPropertiesUtil.END_POINT;
        String   bucketname = ConstantPropertiesUtil.BUCKET_NAME;
        //String   file_name = file.toString();
//        ObsConfiguration config = new ObsConfiguration();
//        config.setSocketTimeout(30000);
//        config.setConnectionTimeout(10000);
//        config.setEndPoint(endPoint);


        // 创建ObsClient实例
        //ObsClient obsClient = new ObsClient(secretId, secretKey, endPoint);
        System.out.println("Create a new bucket for demo\n");
        // 2 设置 bucket 的地域, COS 地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
//        Region region = new Region(ConstantPropertiesUtil.END_POINT);
//        ClientConfig clientConfig = new ClientConfig(region);
//        // 这里建议设置使用 https 协议
//        clientConfig.setHttpProtocol(HttpProtocol.https);
//        // 3 生成 cos 客户端。
//        COSClient cosClient = new COSClient(cred, clientConfig);

        // localfile为待上传的本地文件路径，需要指定到具体的文件名
//        obsClient.putObject(bucketname,"1.txt"
//                , new File("D:\\manchinelearnning\\2022\\web"));
        //obsClient.putObject(bucketname, "objectname", new ByteArrayInputStream("Hello OBS".getBytes()));



        // localfile2 为待上传的本地文件路径，需要指定到具体的文件名
//        PutObjectRequest request = new PutObjectRequest();
//        request.setBucketName(bucketname);
//        request.setObjectKey("objectkey2");
//        request.setFile(new File("localfile2"));
//        obsClient.putObject(request);
//
//        // 存储桶的命名格式为 BucketName-APPID，此处填写的存储桶名称必须为此格式
//        String bucketName = ConstantPropertiesUtil.BUCKET_NAME;
//        // 对象键(Key)是对象在存储桶中的唯一标识。  998u-09iu-09i-333
//        //在文件名称前面添加uuid值
//        String key = UUID.randomUUID().toString().replaceAll("-","")
//                +file.getOriginalFilename();
//        //对上传文件分组，根据当前日期  /2022/11/11
//        String dateTime = new DateTime().toString("yyyy/MM/dd");
//        key = dateTime+"/"+key;
//        try {
//            //获取上传文件输入流
//            InputStream inputStream = file.getInputStream();
//            ObjectMetadata objectMetadata = new ObjectMetadata();
//            PutObjectRequest putObjectRequest = new PutObjectRequest(
//                    bucketName,
//                    key,
//                    inputStream,
//                    objectMetadata);
//            // 高级接口会返回一个异步结果Upload
//            PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
//            //返回上传文件路径
//            //https://ggkt-atguigu-1310644373.cos.ap-beijing.myqcloud.com/01.jpg
//            String url = "https://"+bucketName+"."+"cos"+"."+ConstantPropertiesUtil.END_POINT+".myqcloud.com"+"/"+key;
//            return url;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return "1";
    }
}

