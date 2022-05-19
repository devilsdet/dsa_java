Functional Interface
=================================

interfcae Function<T, R> {
    public R apply(T t);
}

Function Chaining
=============================
f1.andThen(f2).apply(i)
First f1 is applied by f2
f1.compose(f2).apply(i)
First f2 is applied by f1
