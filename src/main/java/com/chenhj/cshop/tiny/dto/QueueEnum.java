package com.chenhj.cshop.tiny.dto;

import lombok.Getter;

/**
 * 消息队列枚举配置
 */
@Getter
public enum QueueEnum {
    /**
     * 消息通知队列
     * cshop.order.direct(取消订单消息队列所绑定的交换机)：绑定的队列为cshop.order.cancel，一旦有消息以cshop.order.cancel为路由
     */
    QUEUE_ORDER_CANCEL("cshop.order.direct","cshop.order.cancel","cshop.order.cancel"),

    /**
     * 消息通知ttl队列
     * cshop.order.direct.ttl（订单延迟消息队列所绑定的交换机）:绑定的队列为cshop.order.cancel.ttl，一旦有消息以cshop.order.cancel.ttl为路由键发送过来
     * 会转发到此队列，并在此队列保存一定时间，等到超时后会自动将消息发送到cshop.order.cancel（取消订单消息消费队列）。
     */
    QUEUE_TTL_ORDER_CANCEL("cshop.order.direct.ttl", "cshop.order.cancel.ttl", "cshop.order.cancel.ttl"),

    /**
     * 消息延迟队列
     */
    QUEUE_ORDER_PLUGIN_CANCEL("cshop.order.direct.plugin", "cshop.order.cancel.plugin", "cshop.order.cancel.plugin");
    /**
     * 交换名称
     */
    private String exchange;

    /**
     * 队列名称
     */
    private String name;

    /**
     * 路由键
     */
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey){
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
