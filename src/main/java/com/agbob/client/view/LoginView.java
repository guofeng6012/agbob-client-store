package com.agbob.client.view;

import com.agbob.client.common.BaseCover;
import com.agbob.client.dto.OrderDto;
import com.agbob.client.utils.HttpClientUtils;
import com.alibaba.fastjson.JSONObject;

import javax.swing.*;
import java.awt.*;

public class LoginView {

    public static void main(String[] args) {
        JFrame jf = new JFrame("登录界面");
        jf.setSize(800, 1000);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
// 创建内容面板，指定使用 流式布局
        /*JPanel panel = new JPanel(new FlowLayout());

        JButton btn01 = new JButton("按钮01");
        JButton btn02 = new JButton("按钮02");
        JButton btn03 = new JButton("按钮03");
        JButton btn04 = new JButton("按钮04");
        JButton btn05 = new JButton("按钮05");

        panel.add(btn01);
        panel.add(btn02);
        panel.add(btn03);
        panel.add(btn04);
        panel.add(btn05);

        jf.setContentPane(panel);*/
        // 创建内容面板，使用边界布局
        JPanel panel = new JPanel(new BorderLayout());

        // 表头（列名）
        Object[] columnNames = {"姓名", "语文", "数学", "英语", "总分"};

        // 表格所有行数据
        Object[][] rowData = {
                {"张三", 80, 80, 180, 240},
                {"John", 70, 80, 190, 240},
                {"Sue", 70, 70, 170, 210},
                {"Jane", 80, 70, 160, 210},
                {"Joe", 80, 70, 160, 210}
        };
        String str = HttpClientUtils.sendGet("http://localhost:8999/goodsOrder/listAll");
        BaseCover baseCover = JSONObject.parseObject(str,BaseCover.class);
        // 创建一个表格，指定 所有行数据 和 表头
        JTable table = new JTable(rowData, columnNames);

        // 把 表头 添加到容器顶部（使用普通的中间容器添加表格时，表头 和 内容 需要分开添加）
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        // 把 表格内容 添加到容器中心
        panel.add(table, BorderLayout.CENTER);

        jf.setContentPane(panel);
        jf.pack();


        jf.setVisible(true);        // PS: 最后再设置为可显示(绘制), 所有添加的组件才会显示
    }
}
