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
public class MemberScoreIdempLogDO implements Serializable {

	private static final long serialVersionUID = 744173150768015743L;

	/**
	 * 自增Id
	 */
	private Long id; 

	/**
	 * 幂等值key 唯一标识
	 */
	private String idempKey;

	/**
	 * 业务key，按业务参数通过“-”拼接进行MD5生成的
	 */
	private String businessKey;

	/**
	 * 发生类型  0 订单冻结积分 1 订单冻结积分消费 2 订单取消冻结积分
	 */
	private Integer idempType;

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
	 * 变动数量
	 */
	private Long amount;

	/**
	 * 状态 0-已回滚，1-已发生
	 */
	private Integer status;

	/**
	 * 积分池Ids
	 */
	private String scorePoolIds; 

	/**
	 * 创建时间
	 */
	private Date createTime; 

	/**
	 * 更新时间
	 */
	private Date updatedTime; 


}
