package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
    // 现有的加法方法
    public int add(int a, int b) {
        return a + b;
    }

    // 需要实现的减法方法
    public int subtract(int a, int b) {
        return a - b; // 实现减法逻辑
    }
}
