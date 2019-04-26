package com.engine.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;


public class MathUtils {

private static Random random = new Random();
	
	/**
	 * 缩小多少个数量级，即：除以10的n次方
	 * @param target
	 * @param n
	 * @return
	 */
	public static double reduceByPowerOfTen(double target, int n) {
		return raiseByPowerOfTen(target, -n);
	}
	
	/**
	 * 扩大多少个数量级，即：乘以10的n次方
	 * @param target
	 * @param n
	 * @return
	 */
	public static double raiseByPowerOfTen(double target, int n) {
		BigDecimal tar = new BigDecimal(target + "");
		return tar.scaleByPowerOfTen(n).doubleValue();
	}
	
	/**
	 * 保留指定精度的小数
	 * @param target 
	 * @param scale 精度，小数位数
	 * @param mode 截取模式<br/>
	 * RoundingMode.UP	按绝对值始终进位<br/>
	 * RoundingMode.DOWN 按绝对值始终舍弃<br/>
	 * RoundingMode.CEILING 如果为正数，则始终进位；如果为负，则按绝对值始终舍弃<br/>
	 * RoundingMode.FLOOR 如果为正，则始终舍弃；如果为负，则按绝对值始终进位<br/>
	 * RoundingMode.HALF_UP 按绝对值四舍五入<br/>
	 * RoundingMode.HALF_DOWN 按绝对值五舍六入<br/>
	 * RoundingMode.HALF_EVEN 如果整数位为奇数，则按绝对值四舍五入；如果整数位为偶数，则按绝对值五舍六入<br/>
	 * RoundingMode.UNNECESSARY 必须为指定精度的数字，否则抛出ArithmeticException异常<br/>
	 * @return
	 */
	public static double mathRounding(double target, int scale, RoundingMode mode) {
		BigDecimal tar = new BigDecimal(target + "");
		return tar.setScale(scale, mode).doubleValue();
	}
	
	/**
	 * 按指定的精度的格式展示数据，超过部分直接舍弃
	 * @param target
	 * @param scale 精度，小数位数
	 * @return
	 */
	public static String formatRounding(double target, int scale) {
		StringBuilder sb = new StringBuilder();
		sb.append("#");
		if(scale > 0) {
			sb.append(".");
		}
		for(int i=0; i<scale; i++) {
			sb.append("0");
		}
		DecimalFormat df = new DecimalFormat(sb.toString());
		return df.format(target);
	}

	/** 
	 * 提供小數位四捨五入處理。 
	 * @param v 需要四捨五入的數字 
	 * @param scale 小數點後保留幾位 
	 * @return 四捨五入後的結果 
	 */ 
	public static double round(double v,int scale){ 
		String temp="#,##0."; 
		for (int i=0;i<scale ;i++ ) { 
			temp+="0"; 
		} 
		return Double.valueOf(new java.text.DecimalFormat(temp).format(v)); 
	} 
	
	/**
	 * 两个数的最大公约数 greatest common divisor GCD
	 * @param m
	 * @param n
	 * @return
	 */
    public static long getGCD(long m, long n) { 
        while (m % n != 0) {   
            long temp = m % n;   
            m = n;   
            n = temp;   
        }   
        return n;   
    }   
  
    /**
     * 两个数的最小公倍数 least common multiple LCM
     * @param m
     * @param n
     * @return
     */
    public static long getLCM(long m, long n) { 
        return m * n / getGCD(m, n);   
    }
    
    /**
     * 排列组合计算公式--C(8, 6)
     * @param m	
     * @param n
     * @return
     *//*
    public static FractionBig C(int m, int n) {
    	if(m < n) throw new RuntimeException("m must grater than n");
    	
    	FractionBig fran = new FractionBig(1, 1);
    	
    	for(int i=0; i<n; i++) {
    		fran.mutiply(m-i, n-i);
    	}
    	
    	return fran;
    }*/
    
    /**
	 * 获取随机数
	 * @return
	 */
	public static int getRandomInt(){
		return random.nextInt(900) + 1000;
	}
	public static BigDecimal nullDefault(BigDecimal b, BigDecimal d) {
	  return b == null ? d : b;
	 }

	 public static BigDecimal defaultZero(BigDecimal b) {
	  return nullDefault(b, new BigDecimal(0));
	 }
	 public static boolean rangeInDefined(int current, int min, int max)  
     {  
        return Math.max(min, current) == Math.min(current, max);  
     }  
}
