package staticproxy;

public class Lawyer implements ILawsuit {
    // 代理类持有委托类的引用，以便调用委托类来实现接口的具体功能
    private ILawsuit mLawsuit;

    public Lawyer(ILawsuit lawsuit) {
        this.mLawsuit = lawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }
}
