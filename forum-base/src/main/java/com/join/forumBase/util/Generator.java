package com.join.forumBase.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class Generator {

    private static GeneratorConfig generatorConfig;

    static {
        generatorConfig = new GeneratorConfig();
    }

    public static void main(String[] args) {
        System.out.println(generatorConfig.toString());

        String[] tables = {"bbs_article",
                "bbs_article_type",
                "bbs_comment",
                "community_user"
        };

/*        generateDao(generatorConfig,
                "forum-dao\\src\\main\\java",
                "forumDao",
                tables);*/

        generateService(generatorConfig,
                "forum-com.join.forumService.com.join.forumService.service\\src\\main\\java",
                "forumService",
                tables);

/*        generateWeb(generatorConfig,
                "forum-web\\src\\main\\java",
                "forumWeb",
                tables);*/

    }

    private static void generateDao(GeneratorConfig generatorConfig, String dir, String module, String... table) {
        FastAutoGenerator.create(generatorConfig.getUrl(), generatorConfig.getUsername(), generatorConfig.getPassword())
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
                            .addTablePrefix("bbs_", "community_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

    private static void generateService(GeneratorConfig generatorConfig, String dir, String module, String... table) {
        FastAutoGenerator.create(generatorConfig.getUrl(), generatorConfig.getUsername(), generatorConfig.getPassword())
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
                            .addTablePrefix("bbs_", "community_")
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

    private static void generateWeb(GeneratorConfig generatorConfig, String dir, String module, String... table) {
        FastAutoGenerator.create(generatorConfig.getUrl(), generatorConfig.getUsername(), generatorConfig.getPassword())
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
                            .addTablePrefix("bbs_", "community_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }


}
