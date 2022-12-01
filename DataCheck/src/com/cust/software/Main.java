package com.cust.software;
import java.sql.*;
import java.util.Scanner;


public class Main {
    static final String USER = "root";
    static final String PASS = "root";

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/studentdatabase?useSSL=false&serverTimezone=UTC";

    public static void main(String[] args) {
        System.out.println("请输入想查找的学号:");
        Scanner Stext=new Scanner(System.in);
        int num = Stext.nextInt();

        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            Connection con;

            // 打开链接
            System.out.println("连接数据库...");
            //conn = DriverManager.getConnection(DB_URL,USER,PASS);
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = con.createStatement();
            //System.out.println(num);

            String sql;
            String sql_find;
            sql_find="SELECT 学号, 姓名, 性别 FROM 班级自然信息表 where 学号 = ? ";
            //sql = "SELECT 学号, 姓名, 性别 FROM 班级自然信息表";
            //ResultSet rs = stmt.executeQuery(sql);


            PreparedStatement ps=null;

            ps=con.prepareStatement(sql_find);
            ps.setInt(1,num);

            ResultSet rs = ps.executeQuery();
            //ResultSet rs = ps.executeQuery(sql_find);
            // 展开结果集数据库
            System.out.println("成功");


            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt("学号");
                String name = rs.getString("姓名");
                String url = rs.getString("性别");

                // 输出数据
                System.out.print("学号: " + id);
                System.out.print(", 姓名: " + name);
                System.out.print(", 性别: " + url);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            con.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
