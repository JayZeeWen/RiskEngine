package com.engine.util;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.risk.engine.entity.Group;
import com.risk.engine.entity.RiskModelTemplate;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VelocityUtil {

    private static Logger logger = LoggerFactory.getLogger(VelocityUtil.class);

    @Value("${spring.velocity.resource-loader-path}")
    private String templatePath;

    // 测试类
    public static void velocityClassLoadExample() {
        // 创建引擎
        VelocityEngine ve=new VelocityEngine();
        //设置模板加载路径，这里设置的是class下
        ve.setProperty(Velocity.RESOURCE_LOADER, "class");
        ve.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        try {
            //进行初始化操作
            ve.init();
            //加载模板，设定模板编码
            Template t=ve.getTemplate("boot/vm/test.vm","utf-8");
            //设置初始化数据
            VelocityContext context = new VelocityContext();
            context.put("name", "张三");
            context.put("project", "Velocity");
            //设置输出
            StringWriter writer = new StringWriter();
            //将环境数据转化输出
            t.merge(context, writer);
            System.out.println(writer.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 通过模板 生成 文本内容
     * @param context 内容参数
     * @param templateName 模板名称
     * @return 生成文本
     */
    public String generateByContext(VelocityContext context,String templateName){
        String result = "";
        VelocityEngine ve=new VelocityEngine();
        //设置模板加载路径，这里设置的是class下
        ve.setProperty(Velocity.RESOURCE_LOADER, "class");
        ve.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        try {
            ve.init();
            //加载模板，设定模板编码
            Template t=ve.getTemplate(templatePath + "/"+ templateName +".vm","utf-8");
            StringWriter writer = new StringWriter();
            //模板参数
            t.merge(context, writer);
            result  = writer.toString();
        } catch (Exception e) {
            LoggerHelper.error(logger,e,"模板引擎调用异常");
            throw  new RuntimeException(e);
        }
        return  result;
    }
}
