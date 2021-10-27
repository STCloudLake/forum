package com.join.forumBase.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.join.forumBase.config.GeneratorConfig;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

public class Generator {

    private static GeneratorConfig generatorConfig;

    static {
        generatorConfig = new GeneratorConfig();
    }

    public static void main(String[] args) {
        System.out.println(generatorConfig.toString());
        generateDao(generatorConfig,
                "D:\\卓音社区\\社区项目\\forum\\joinForum\\forum-dao\\src\\main\\java\\",
                "forumDao",
                "bbs_article");

        generateService(generatorConfig,
                "D:\\卓音社区\\社区项目\\forum\\joinForum\\forum-service\\src\\main\\java\\",
                "forumService",
                "bbs_article");

        generateWeb(generatorConfig,
                "D:\\卓音社区\\社区项目\\forum\\joinForum\\forum-web\\src\\main\\java\\",
                "forumWeb",
                "bbs_article");

    }

    private static void generateDao(GeneratorConfig generatorConfig, String dir, String module, String...table){
        FastAutoGenerator.create(generatorConfig.getUrl(),generatorConfig.getUsername() ,generatorConfig.getPassword())
                .globalConfig(builder -> {
                    builder.author("join") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(dir); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.join") // 设置父包名
                            .moduleName(module);// 设置父包模块名                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\卓音社区\\社区项目\\forum\\joinForum\\forum-base\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .templateConfig(builder -> {
                    builder.controller("")
                    .service("")
                    .serviceImpl("")
                    .build();
                })
                .strategyConfig(builder -> {
                    builder.addInclude(table.clone()) // 设置需要生成的表名
                            .addTablePrefix("bbs_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

    private static void generateService(GeneratorConfig generatorConfig, String dir, String module, String...table){
        FastAutoGenerator.create(generatorConfig.getUrl(),generatorConfig.getUsername() ,generatorConfig.getPassword())
                .globalConfig(builder -> {
                    builder.author("join") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(dir); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.join") // 设置父包名
                            .moduleName(module);// 设置父包模块名                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\卓音社区\\社区项目\\forum\\joinForum\\forum-base\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .templateConfig(builder -> {
                    builder.controller("")
                            .mapper("")
                            .entity(null)
                            .mapperXml("")
                            .build();
                })
                .strategyConfig(builder -> {
                    builder.addInclude(table.clone()) // 设置需要生成的表名
                            .addTablePrefix("bbs_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

    private static void generateWeb(GeneratorConfig generatorConfig, String dir, String module, String...table){
        FastAutoGenerator.create(generatorConfig.getUrl(),generatorConfig.getUsername() ,generatorConfig.getPassword())
                .globalConfig(builder -> {
                    builder.author("join") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(dir); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.join") // 设置父包名
                            .moduleName(module);// 设置父包模块名                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\卓音社区\\社区项目\\forum\\joinForum\\forum-base\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .templateConfig(builder -> {
                    builder.mapperXml(null)
                            .entity(null)
                            .mapper(null)
                            .serviceImpl(null)
                            .service(null)
                            .build();
                })
                .strategyConfig(builder -> {
                    builder.addInclude(table.clone()) // 设置需要生成的表名
                            .addTablePrefix("bbs_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }


}
