package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import java.util.List;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiListField;

/**
 * 匹配用户标签添加接口
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:25:36
 */
public class AlipayOpenPublicMatchuserLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8782722286563476961L;

	/**
	 * 标签id，调用创建标签接口会返回label_id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签值，由开发者自主指定，标签值类型要满足创建标签接口中data_type参数的限定。
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 支付宝用户匹配器列表，最多传入10条
	 */
	@ApiListField("matchers")
	@ApiField("matcher")
	private List<Matcher> matchers;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	public List<Matcher> getMatchers() {
		return this.matchers;
	}
	public void setMatchers(List<Matcher> matchers) {
		this.matchers = matchers;
	}

}
