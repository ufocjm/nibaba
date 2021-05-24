package fun.nibaba.wechat.payment.interceptors.order;

import fun.nibaba.wechat.payment.interceptors.WechatPaymentInterceptor;
import fun.nibaba.wechat.payment.model.order.WechatPaymentCreateOrderParams;
import fun.nibaba.wechat.payment.model.order.WechatPaymentCreateOrderResult;

/**
 * 微信支付-创建订单拦截器接口
 *
 * @author chenjiamin
 * @date 2021/5/14 11:28 下午
 */
public interface WechatPaymentCreateOrderInterceptor extends WechatPaymentInterceptor<WechatPaymentCreateOrderParams, WechatPaymentCreateOrderResult> {

}
