package com.wakedata.wk.member.score.repository.model;
	
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luomeng
 * @date 2021/02/25 20:53 
 */
@Data
@NoArgsConstructor
public class MemberScoreConsumeSourceDO implements Serializable {

	private static final long serialVersionUID = 744173150768015743L;

	/**
	 * 自增Id
	 */
	private Long id; 

	/**
	 * 集团Id
	 */
	private Long epId; 

	/**
	 * 业态Id
	 */
	private Long appId; 

	/**
	 * 项目ID
	 */
	private Long storeId; 

	/**
	 * 积分明细ID
	 */
	private Long scoreRecordId; 

	/**
	 * 会员一帐通
	 */
	private String uniqueAccountId; 

	/**
	 * 来源集团ID
	 */
	private Long sourceEpId; 

	/**
	 * 来源业态ID
	 */
	private Long sourceAppId; 

	/**
	 * 来源项目ID
	 */
	private Long sourceStoreId; 

	/**
	 * 变更数量
	 */
	private Long amount;

	/**
	 * 创建时间
	 */
	private Date createTime; 

	/**
	 * 更新时间
	 */
	private Date updateTime; 


}
