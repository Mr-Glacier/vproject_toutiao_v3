package org.example;

import org.example.Controller.ArticleList_Controller;
import org.example.Entity.T_Blogger;
import org.example.Until.ReadUntil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        项目主要存储路径,需要更改到本地地址
        String projectPath = "E:\\ZKZD2023\\大V项目\\头条数据\\";


        int GroupNumber = 2;


//        只存文章列表
        String onlyArticlePath = "1_onlyArticleData\\";
//        只存视频列表
        String videoListpath = "2_videoAndArticleData\\";
//        只存微头条列表
        String littleArticlePath = "3_littleArticleData\\";
//        文章页面数据
        String ArticlePageDataPath = "4_ArticleData\\";
//        微头条页面数据
        String ArticleLittlePath = "5_ArticleData\\";

//        文章评论数据存放地址
        String ArticleCommentsPath  = "6_ArticleFirstComments\\";

        ArticleList_Controller AC = new ArticleList_Controller();

//        创建主文件存储路径
        AC.Method_1_CreatFile(projectPath);


//      1. 获取用户列表,创建所有博主的文件夹
        ArrayList<Object> userList = AC.Method_2_getUserList();

        for (Object user : userList) {
            String user_name = ((T_Blogger) user).getBloggerName();
            String pathPersonal = projectPath + user_name + "\\";
            AC.Method_1_CreatFile(pathPersonal); //用户个人文件夹
            AC.Method_1_CreatFile(pathPersonal + onlyArticlePath); //纯文章列表路径
            AC.Method_1_CreatFile(pathPersonal + videoListpath); // 视频类型文件路径列表
            AC.Method_1_CreatFile(pathPersonal + littleArticlePath); //微头条文章列表
            AC.Method_1_CreatFile(pathPersonal + ArticlePageDataPath); //文章数据存放位置
            AC.Method_1_CreatFile(pathPersonal + ArticleLittlePath); //微头条存放数据

            AC.Method_1_CreatFile(pathPersonal + ArticleCommentsPath); //评论存放地址
        }

//        2.下载数据索引列表到本地
//  三种数据请求类型   pc_profile_article 文章列表  pc_profile_ugc 微头条  pc_profile_video 视频
        String DataListMainUrl = "https://www.toutiao.com/api/pc/list/user/feed?";
        String aid = "24";
        String app_name = "toutiao_web";
        String Data_Type = "pc_profile_article";  //可以从上面三个类型中选择


//        单个测试使用
        //  AC.Method_3_DownListData(Data_Type,DataListMainUrl,Begin,user_token,user_singer,aid,app_name,onlyArticleSavePath);


        // 循环下载数据列表
//        for (Object user : userList) {
//            String user_name = ((T_Blogger) user).getBloggerName();
//            String user_token = ((T_Blogger) user).getToken();
//            String user_singer = ((T_Blogger) user).getSinger();
//            String DownState = ((T_Blogger) user).getDownState();
//            String Begin = "0";
//
//            //  纯文章列表保存地址
//            String onlyArticleSavePath = projectPath + user_name + "\\"+onlyArticlePath;
//
//            if (DownState.equals("否")){
//                AC.Method_3_DownListData(Data_Type,DataListMainUrl,Begin,user_token,user_singer,aid,app_name,onlyArticleSavePath);
//            }else {
//                System.out.println(user_name+"  已经下载完成");
//            }
//        }


//        解析插入文章具体内容
//        for (Object user:userList){
//            String user_name = ((T_Blogger) user).getBloggerName();
//            List<String> list =AC.Method_7_2_MethodGetAllFileName(projectPath,user_name,ArticlePageDataPath);
//            for (String fileName :list){
//                String path = projectPath+user_name+"\\"+"ArticlePageDataPath"+fileName;
//                AC.Method_7_1_InsertArticleContent(user_name,fileName.replace(".txt", ""),path);
//            }
//        }

//        解析插入单用户所有文章内容
        String user_name = "卢克文工作室";
//        List<String> list = AC.Method_7_2_MethodGetAllFileName(projectPath, user_name, ArticlePageDataPath);
//        for (String fileName : list) {
//            String path = projectPath + user_name + "\\" + ArticlePageDataPath + fileName;
//            AC.Method_7_1_InsertArticleContent(user_name, fileName.replace(".txt", ""), path);
//        }

        String url = "https://www.toutiao.com/article/v2/tab_comments/?aid=24&app_name=toutiao_web&offset=0&count=100&group_id=7298300967684997644&item_id=7298300967684997644&_signature=_02B4Z6wo009017CzvzgAAIDDMLFFe5PgLnuwl7uAAImI0KwyLFmmC49gA7ZhDGjiaeiecPSbrVzYJBKfaVUIRcYbH9Vsv1Az65y7L00kWQLZRm6yczkAHpLtJ9ifi6.jVMcDINgd5IZhLB9W1d";


        ReadUntil readUntil = new ReadUntil();
        List<String> NameList = readUntil.getFileNames(projectPath + user_name + "\\" + ArticlePageDataPath);
        String CommentsSavePath = projectPath+user_name+"\\"+ArticleCommentsPath;
        String mainurl="https://www.toutiao.com/article/v2/tab_comments/?aid=24&app_name=toutiao_web";
        String _singer = "_02B4Z6wo00901YEjDPQAAIDBASH2tM-7yYmBBwhAAAUWD8Rlmdj92MwEVuGLWSEE14Y2cfU-Byck79.5fqDUuCrGbUg5oIs63ad2mNRr-KLULAO3e2tGoqc76eFboLsNhbV4bbcxVdhI4gjNb3";
        int Begin  = 0;
        int count = 30;
        for (String name :NameList){
            AC.Method_8_2_SaveComments(CommentsSavePath,mainurl,name.replace(".txt", ""),_singer,Begin,count);
        }











    }


}