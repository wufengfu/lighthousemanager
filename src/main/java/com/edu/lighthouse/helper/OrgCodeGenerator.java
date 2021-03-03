package com.fetx.ticket.utils;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Random;
import java.util.UUID;


/**
 * 组织编码生成类
 * 
 * @author wufengfu
 * 
 * Date: 2019-03-13
 */
public class OrgCodeGenerator {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			System.out.println(OrgCodeGenerator.generate());
		}
		
	}

	public static String generate(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static String generate16(){
		Date date = new Date();
		SimpleDateFormat aa = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String str = aa.format(date);
		
		StringBuffer buffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"); 
	    StringBuffer sb = new StringBuffer(); 
	    Random r = new Random(); 
	    int range = buffer.length(); 
	    for (int i = 0; i < 2; i ++) { 
	        sb.append(buffer.charAt(r.nextInt(range))); 
	    } 
		
		String ret = str + sb.toString();
		
		return ret;
	}
	
	public static String generateTourist(){//国内经济舱编码规则
		Date date = new Date();
		SimpleDateFormat aa = new SimpleDateFormat("HHMMddmmssyy");
		
		String str = aa.format(date);
		
		StringBuffer buffer = new StringBuffer("0123456789"); 
		StringBuffer sb = new StringBuffer(); 
		StringBuffer sbf = new StringBuffer(); 
		Random r = new Random(); 
		int range = buffer.length(); 
		for (int i = 0; i < 2; i ++) { 
			sb.append(buffer.charAt(r.nextInt(range))); 
		} 
		for (int i = 0; i < 2; i ++) { 
			sbf.append(buffer.charAt(r.nextInt(range))); 
		} 
		
		String ret = "21"+sbf.toString()+str + sb.toString();
		
		return ret;
	}
	public static String generateCabin(){//两舱编码规则
		Date date = new Date();
		SimpleDateFormat aa = new SimpleDateFormat("HHMMddmmssyy");
		
		String str = aa.format(date);
		
		StringBuffer buffer = new StringBuffer("0123456789"); 
		StringBuffer sb = new StringBuffer(); 
		StringBuffer sbf = new StringBuffer(); 
		Random r = new Random(); 
		int range = buffer.length(); 
		for (int i = 0; i < 2; i ++) { 
			sb.append(buffer.charAt(r.nextInt(range))); 
		} 
		for (int i = 0; i < 2; i ++) { 
			sbf.append(buffer.charAt(r.nextInt(range))); 
		} 
		
		String ret = "22"+sbf.toString()+str + sb.toString();
		
		return ret;
	}
	public static String generateMemberCard(){//会员卡编码规则
		Date date = new Date();
		SimpleDateFormat aa = new SimpleDateFormat("HHMMddmmssyy");
		
		String str = aa.format(date);
		
		StringBuffer buffer = new StringBuffer("0123456789"); 
		StringBuffer sb = new StringBuffer(); 
		StringBuffer sbf = new StringBuffer(); 
		Random r = new Random(); 
		int range = buffer.length(); 
		for (int i = 0; i < 2; i ++) { 
			sb.append(buffer.charAt(r.nextInt(range))); 
		} 
		for (int i = 0; i < 2; i ++) { 
			sbf.append(buffer.charAt(r.nextInt(range))); 
		} 
		
		String ret = "61"+sbf.toString()+str + sb.toString();
		
		return ret;
	}
	public static String generateDjq(){//代金券码编码规则
		Date date = new Date();
		SimpleDateFormat aa = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String str = aa.format(date);
		
		StringBuffer buffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"); 
		StringBuffer sb = new StringBuffer(); 
		StringBuffer sbf = new StringBuffer(); 
		Random r = new Random(); 
		int range = buffer.length(); 
		for (int i = 0; i < 2; i ++) { 
			sb.append(buffer.charAt(r.nextInt(range))); 
		} 
		for (int i = 0; i < 2; i ++) { 
			sbf.append(buffer.charAt(r.nextInt(range))); 
		} 
		
		String ret = sbf.toString()+str + sb.toString();
		
		return ret;
	}
}
