package person;

public abstract class PersonCloth extends Person {
    // 持有一个原始类 Person 的引用
    protected Person mPerson;

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        // 调用 Person 类中的 dressed 方法
        mPerson.dressed();
    }
}
