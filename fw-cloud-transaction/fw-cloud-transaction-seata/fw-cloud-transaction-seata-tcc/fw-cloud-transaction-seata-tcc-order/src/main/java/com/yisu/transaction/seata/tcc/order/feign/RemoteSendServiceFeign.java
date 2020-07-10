package com.yisu.transaction.seata.tcc.order.feign;

import com.yisu.transacation.base.dao.model.FwTradeLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "fw-transaction-seata-tcc-send", fallbackFactory = RemoteSendServiceFallback.class)
public interface RemoteSendServiceFeign {

    @PostMapping("send")
    void sendOrder(@RequestBody FwTradeLog tradeLog);
}
