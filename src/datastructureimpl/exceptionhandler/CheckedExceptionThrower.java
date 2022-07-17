package datastructureimpl.exceptionhandler;

public interface CheckedExceptionThrower<T> {
    T get() throws Exception;
}
