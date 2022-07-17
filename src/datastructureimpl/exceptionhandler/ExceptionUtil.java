package datastructureimpl.exceptionhandler;

public final class ExceptionUtil {
    public static <T>  T unCheckedException(CheckedExceptionThrower<T>  exceptionThrower) {
        try{
            return exceptionThrower.get();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
