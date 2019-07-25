package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 芝麻认证开始认证
 *
 * @author auto create
 * @since 1.0, 2017-01-10 16:08:26
 */
public class ZhimaCustomerCertificationCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 1786496586252474737L;

	/**
	 * 一次认证的唯一标识,在完成芝麻认证初始化后可以获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
