package com.wakedata.wk.member.score.repository.model;
	
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luomeng
 * @date 2021/02/25 15:05 
 */
@Data
@NoArgsConstructor
public class MemberScorePoolDO implements Serializable {

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
	 * 项目Id
	 */
	private Long storeId; 

	/**
	 * 会员一帐通
	 */
	private String uniqueAccountId; 

	/**
	 * 可用积分
	 */
	private Long amount;

	/**
	 * 失效时间
	 */
	private Date expireTime; 

	/**
	 * 积分状态 1-未使用，2-已使用，3-冻结
	 */
	private Integer status;

	/**
	 * 幂等key防止重复加积分
	 */
	private String idempKey; 

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	public Date getCreateTime() {
		if (createTime == null) {
			return new Date();
		}
		return createTime;
	}
}
