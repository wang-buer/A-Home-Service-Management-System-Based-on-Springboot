package com.entity.model;

import com.entity.FuwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 服务信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-07 10:17:53
 */
public class FuwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服务图片
	 */
	
	private String fuwutupian;
		
	/**
	 * 服务类型
	 */
	
	private String fuwuleixing;
		
	/**
	 * 合同信息
	 */
	
	private String hetongxinxi;
		
	/**
	 * 服务价格
	 */
	
	private String fuwujiage;
		
	/**
	 * 服务简介
	 */
	
	private String fuwujianjie;
		
	/**
	 * 服务详情
	 */
	
	private String fuwuxiangqing;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：服务图片
	 */
	 
	public void setFuwutupian(String fuwutupian) {
		this.fuwutupian = fuwutupian;
	}
	
	/**
	 * 获取：服务图片
	 */
	public String getFuwutupian() {
		return fuwutupian;
	}
				
	
	/**
	 * 设置：服务类型
	 */
	 
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
	}
				
	
	/**
	 * 设置：合同信息
	 */
	 
	public void setHetongxinxi(String hetongxinxi) {
		this.hetongxinxi = hetongxinxi;
	}
	
	/**
	 * 获取：合同信息
	 */
	public String getHetongxinxi() {
		return hetongxinxi;
	}
				
	
	/**
	 * 设置：服务价格
	 */
	 
	public void setFuwujiage(String fuwujiage) {
		this.fuwujiage = fuwujiage;
	}
	
	/**
	 * 获取：服务价格
	 */
	public String getFuwujiage() {
		return fuwujiage;
	}
				
	
	/**
	 * 设置：服务简介
	 */
	 
	public void setFuwujianjie(String fuwujianjie) {
		this.fuwujianjie = fuwujianjie;
	}
	
	/**
	 * 获取：服务简介
	 */
	public String getFuwujianjie() {
		return fuwujianjie;
	}
				
	
	/**
	 * 设置：服务详情
	 */
	 
	public void setFuwuxiangqing(String fuwuxiangqing) {
		this.fuwuxiangqing = fuwuxiangqing;
	}
	
	/**
	 * 获取：服务详情
	 */
	public String getFuwuxiangqing() {
		return fuwuxiangqing;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
