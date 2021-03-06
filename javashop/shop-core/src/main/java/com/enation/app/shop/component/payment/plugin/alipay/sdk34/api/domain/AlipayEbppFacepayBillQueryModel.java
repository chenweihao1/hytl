package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 缴费当面付账单状态查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-13 19:55:44
 */
public class AlipayEbppFacepayBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8141469348893725796L;

	/**
	 * 支付宝交易流水号(和user_id、user_identity_code三者至少传一个)
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * ISV交易流水号（要求全局唯一）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户ID(和user_identity_code、bill_no三者至少传一个)
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户支付宝付款码 (需使用下单时用的码值，10分钟内有效）(和user_id、bill_no三者至少传一个)
	 */
	@ApiField("user_identity_code")
	private String userIdentityCode;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdentityCode() {
		return this.userIdentityCode;
	}
	public void setUserIdentityCode(String userIdentityCode) {
		this.userIdentityCode = userIdentityCode;
	}

}
