package com.springmvc.test;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CustomGenerator {

    public static void main(String[] args){
        AutoGenerator mpg = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D:\\dev\\idea_workspace\\tianwen-mng\\src\\main\\java");
        //是否覆盖原来的
        gc.setFileOverride(true);
        gc.setEnableCache(false);
        gc.setActiveRecord(false);
        gc.setAuthor("dream");
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert());
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("tianwen");
        dsc.setPassword("123456a");
        dsc.setUrl("jdbc:mysql://192.168.1.7:3306/tianwen?characterEncoding=utf8&serverTimezone=UTC");
        mpg.setDataSource(dsc);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 需要生成的表
        strategy.setInclude(new String[] { "user_info" });
        strategy.setEntityTableFieldAnnotationEnable(true);
//        strategy.setTablePrefix("library_");// 此处可以修改为您的表前缀
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        mpg.setStrategy(strategy);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.springmvc.dao");
        //pc.setModuleName("test");
        mpg.setPackageInfo(pc);

        //目录配置
        TemplateConfig tc = new TemplateConfig();
        tc.setController(null);
        mpg.setTemplate(tc);

        //执行生成
        mpg.execute();
    }

}
