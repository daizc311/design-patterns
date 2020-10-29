package cn.dreamccc.design.state;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <h2>cn.dreamccc.design.state</h2>
 *
 * @author Daizc-kl
 * @date 2020/10/29 17:42
 */
public abstract class AbstractPactStatus {

    @Getter
    protected final Pact pact;

    @Getter
    protected final String statusName;

    public AbstractPactStatus(Pact pact, String statusName) {
        this.pact = pact;
        this.statusName = statusName;
    }


    /**
     * 初始化
     */
    public abstract void init();

    /**
     * 取消
     */
    public abstract void cancel();

    /**
     * 拒签
     */
    public abstract void refuse();

    /**
     * 签署完成
     */
    public abstract void complete();

    /**
     * 等待期
     */
    public abstract void waitLock();

    /**
     * 归档
     */
    public abstract void archive();

    /**
     * 超时
     */
    public abstract void timeout();

}
