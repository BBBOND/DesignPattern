# DesignPattern
设计模式

## 策略模式Strategy（对象行为型）
- 概念
    策略模式把对象本身和运算规则区分开来，这个设计模式本身的核心思想是面向对象编程的多形性的思想。
    策略模式定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。
- 组成
    - 抽象策略角色：策略类，通常由一个接口或者抽象类实现。
    - 具体策略角色：包装了相关的算法和行为，一般是对抽象策略角色的实现。
    - 环境角色：持有一个策略类的引用，最终给客户端调用。
- 应用场景
    - 多个类只区别在表现行为不同，可以使用策略（Strategy）模式，在运行时**动态选择**具体要执行的行为。
    - 需要在不同情况下使用不同的策略(算法)，或者策略还可能在未来用其它方式来实现。
    - 对客户隐藏具体策略(算法)的实现细节，彼此完全独立。

