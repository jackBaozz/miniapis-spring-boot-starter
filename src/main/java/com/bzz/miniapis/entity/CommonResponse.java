package com.bzz.miniapis.entity;

/**
 * 统一API响应实体 (使用 JDK 17 Record 优化)
 */
public record CommonResponse<T>(int code, String message, T data) {
    
    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>(200, "Success", data);
    }
    
    public static <T> CommonResponse<T> error(int code, String message) {
        return new CommonResponse<>(code, message, null);
    }
}
