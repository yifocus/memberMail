package com.wakedata.wk.member.score.repository.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luomeng
 * @date 2021/02/27 15:58 
 */
@Data
@NoArgsConstructor
public class ScoreSettlementRecordDO  implements Serializable {

	private static final long serialVersionUID = -940365426515771477L;

	/**
	 * 自增ID
	 */
	private Long id; 

	/**
	 * 集团ID
	 */
	private Long epId; 

	/**
	 * 业态ID
	 */
	private Long appId; 

	/**
	 * 集团名称
	 */
	private String epName; 

	/**
	 * 业态名称
	 */
	private String appName; 

	/**
	 * 统计日期
	 */
	private Date date;

	/**
	 * 产生积分
	 */
	private Long produceScore; 

	/**
	 * 结算积分
	 */
	private Long settlementScore; 

	/**
	 * 接收积分
	 */
	private Long receiveScore; 

	/**
	 * 积分差值
	 */
	private Long scoreDifference; 

	/**
	 * 过期积分
	 */
	private Long expiredScore; 

	/**
	 * 创建时间
	 */
	private Date createTime; 

	/**
	 * 更新时间
	 */
	private Date updateTime; 


}
