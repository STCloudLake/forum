package com.join.forumWeb.util;


public enum CodeEnum {


    SUCCESS("200", "成功"),

    ERROR("500", "现在忙");

    CodeEnum(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public String getValue() {
        return value;
    }

    public String getMsg() {
        return msg;
    }

    private String value;
    private String msg;
}
