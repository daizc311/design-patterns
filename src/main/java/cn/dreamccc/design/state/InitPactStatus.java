package cn.dreamccc.design.state;

/**
 * <h2>cn.dreamccc.design.state</h2>
 *
 * @author Daizc-kl
 * @date 2020/10/29 17:42
 */
public class InitPactStatus extends AbstractPactStatus {

    public InitPactStatus(Pact pact) {
        super(pact, "INIT");
    }

    /**
     * 初始化
     */
    public void init(){

    }

    /**
     * 取消
     */
    public void cancel(){

    }

    /**
     * 拒签
     */
    public void refuse(){

    }

    /**
     * 签署完成
     */
    public void complete(){

    }

    /**
     * 等待期
     */
    public void waitLock(){

    }

    /**
     * 归档
     */
    public void archive(){

    }

    /**
     * 超时
     */
    public void timeout(){

    }

}
